
import java.sql.SQLException;

import org.junit.Test;

import edu.brown.cs.jwhite13.bacon.DatabaseFeeder;
import edu.brown.cs.jwhite13.tries.NodeNotFoundException;
import junit.framework.TestCase;

/**
 * @author jwhite13 class to test DatabaseFeeder
 */
public class DatabaseFeederTest extends TestCase {
  private static DatabaseFeeder feeder = null;

  @Override
  public void setUp() {
    try {
      feeder = new DatabaseFeeder("data/bacon/smallBacon.sqlite3");
    } catch (SQLException | ClassNotFoundException e) {
      assertTrue(false);
    }
  }

  /**
   * test.
   */
  @Test
  public void testGetNode() {
    try {
      assertTrue(
          feeder.getNode("Will Smith").getContents().equals("Will Smith"));
    } catch (NodeNotFoundException e) {
      assertTrue(false);
    }
    try {
      feeder.getNode("Shakira");
      assertTrue(false);
    } catch (NodeNotFoundException e) {
      assertTrue(true);
    }
  }
}
