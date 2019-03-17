
import java.util.List;

import org.junit.Test;

import edu.brown.cs.jwhite13.tries.Trie;
import junit.framework.TestCase;

/**
 * @author jwhite13 tester class for tries package
 */
public class TrieTest extends TestCase {
  private Trie trie;

  @Override
  public void setUp() {
    trie = new Trie();
    try {
      trie.addFile("data/autocorrect/27_test.txt");
    } catch (Exception e) {
      System.out.println("hit");
      assertTrue(false);
    }
  }

  /**
   * test.
   */
  @Test
  public void testConstructors() {
    assertNotNull(trie);
  }

  /**
   * test.
   */
  @Test
  public void testContents() {
    List<String> words = trie.asList();
    assertTrue(words.contains("a"));
    assertTrue(words.contains("abate"));
    assertTrue(words.contains("abater"));
    assertTrue(words.contains("abator"));
    assertTrue(words.contains("abort"));
    assertTrue(words.contains("aborts"));
    assertTrue(words.contains("abrupt"));
    assertTrue(words.contains("an"));
    assertTrue(words.contains("ant"));
    assertTrue(words.contains("anti"));
    assertTrue(words.contains("anther"));
    assertTrue(words.contains("antiar"));
    assertTrue(words.contains("antler"));
    assertTrue(words.contains("antral"));
    assertTrue(words.contains("antres"));
    assertTrue(words.contains("bar"));
    assertTrue(words.contains("barb"));
    assertTrue(words.contains("barber"));
    assertTrue(words.contains("barbary"));
    assertTrue(words.contains("barbaric"));
    assertTrue(words.contains("ban"));
    assertTrue(words.contains("bank"));
    assertTrue(words.contains("banker"));
    assertTrue(words.contains("bankit"));
    assertTrue(words.contains("bang"));
    assertTrue(words.contains("banger"));
    assertTrue(words.contains("banner"));
  }

  /**
   * test.
   */
  @Test
  public void testSubChildren() {
    List<String> words = trie.getChildWords("aba");
    assertFalse(words.contains("a"));
    assertTrue(words.contains("abate"));
    assertTrue(words.contains("abater"));
    assertTrue(words.contains("abator"));
    assertFalse(words.contains("abort"));
    assertFalse(words.contains("aborts"));
    assertFalse(words.contains("abrupt"));
    assertFalse(words.contains("an"));
    assertFalse(words.contains("ant"));
    assertFalse(words.contains("anti"));
    assertFalse(words.contains("anther"));
    assertFalse(words.contains("antiar"));
    assertFalse(words.contains("antler"));
    assertFalse(words.contains("antral"));
    assertFalse(words.contains("antres"));
    assertFalse(words.contains("bar"));
    assertFalse(words.contains("barb"));
    assertFalse(words.contains("barber"));
    assertFalse(words.contains("barbary"));
    assertFalse(words.contains("barbaric"));
    assertFalse(words.contains("ban"));
    assertFalse(words.contains("bank"));
    assertFalse(words.contains("banker"));
    assertFalse(words.contains("bankit"));
    assertFalse(words.contains("bang"));
    assertFalse(words.contains("banger"));
    assertFalse(words.contains("banner"));
  }
}
