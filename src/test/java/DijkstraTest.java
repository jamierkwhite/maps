
import java.util.ArrayList;

import org.junit.Test;

import edu.brown.cs.jwhite13.dijkstra.Dijkstra;
import edu.brown.cs.jwhite13.dijkstra.GraphEdge;
import edu.brown.cs.jwhite13.tries.NodeNotFoundException;
import junit.framework.TestCase;

/**
 * test class for Dijkstra.
 */
public class DijkstraTest extends TestCase {
  private static Dijkstra<String> dijkstra = new Dijkstra<String>(
      new TestFeeder());

  /**
   * test.
   */
  @Test
  public void testConstructor() {
    assertNotNull(dijkstra);
  }

  /**
   * test.
   */
  @Test
  public static void testShortestPath() {
    try {
      dijkstra.calculate("e", "s");
    } catch (NodeNotFoundException e) {
      assertTrue(false);
    }
    ArrayList<GraphEdge<String>> correct = new ArrayList<GraphEdge<String>>();
    correct.add(new GraphEdge<String>("b", "s", 2));
    correct.add(new GraphEdge<String>("h", "b", 1));
    correct.add(new GraphEdge<String>("g", "h", 2));
    correct.add(new GraphEdge<String>("e", "g", 2));

    assertEquals(correct, dijkstra.shortestPath());
  }

  /**
   * test.
   */
  @Test
  public static void testShortestDistance() {
    try {
      dijkstra.calculate("e", "s");
    } catch (NodeNotFoundException e) {
      assertTrue(false);
    }
    assertEquals(dijkstra.getDistance(), 7.0);
  }
}
