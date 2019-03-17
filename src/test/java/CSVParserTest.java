
import org.junit.Test;

import edu.brown.cs.jwhite13.io.CSVParser;
import edu.brown.cs.jwhite13.io.MalformedFileException;
import junit.framework.TestCase;

/**
 * @author jwhite13 test class for csvparser
 */
public class CSVParserTest extends TestCase {
  private CSVParser csvp;

  @Override
  protected void setUp() throws MalformedFileException {
    csvp = new CSVParser("data/stars/one-star.csv");
  }

  /**
   * test constructor.
   */
  @Test
  public void testConstruction() {
    assertNotNull(csvp);
  }

  /**
   * test getNext.
   */
  @Test
  public void testGetNext() {
    String[] correct = new String[] {
        "1", "Lonely Star", "5", "-2.24", "10.04"
    };
    String[] recieved = csvp.nextLine();

    for (int i = 0; i < correct.length; i++) {
      assertTrue(correct[i].equals(recieved[i]));
    }
  }
}
