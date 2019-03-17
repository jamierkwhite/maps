
import org.junit.Test;

import edu.brown.cs.jwhite13.dijkstra.UnpreparedElementException;
import edu.brown.cs.jwhite13.stars.Point3d;
import junit.framework.TestCase;

/**
 * @author jwhite13 class to test point3d
 */
public class TestPoint3d extends TestCase {
  private Point3d p1;
  private Point3d p2;
  private Point3d p3;
  private Point3d p4;

  @Override
  protected void setUp() {
    p1 = new Point3d(0, 0, 0);
    p2 = new Point3d(1, 2, 3);
    p3 = new Point3d(1, 1, 1);
    p4 = new Point3d(3, 2, 1);
  }

  /**
   * test.
   */
  @Test
  public void testConstructor() {
    assertNotNull(p1);
    assertNotNull(p2);
    assertNotNull(p3);
  }

  /**
   * test.
   */
  @Test
  public void testDimension() {
    assertEquals(p1.getDim(), 0);
    p1.incrementDimension();
    assertEquals(p1.getDim(), 1);
    p1.incrementDimension();
    p1.incrementDimension();
    assertEquals(p1.getDim(), 0);
    p1.incrementDimension();
    assertEquals(p1.getDim(), 1);
  }

  /**
   * test.
   */
  @Test
  public void testDistance() {
    try {
      p1.distance();
      assertTrue(false);
    } catch (UnpreparedElementException e) {
      assertTrue(true);
    }

    p1.calculateDistanceComparison(new Point3d(0, 0, 0));
    p2.calculateDistanceComparison(new Point3d(0, 0, 0));
    p3.calculateDistanceComparison(new Point3d(0, 0, 0));

    try {
      assertEquals(p1.distance(), 0.0);
    } catch (UnpreparedElementException e) {
      assertTrue(false);
    }

    try {
      assertEquals(p2.distance(), 3.7417, 0.0001);
    } catch (UnpreparedElementException e) {
      assertTrue(false);
    }

    try {
      assertEquals(p3.distance(), 1.7321, .0001);
    } catch (UnpreparedElementException e) {
      assertTrue(false);
    }

    try {
      assertEquals(p3.distIn(0), 1.0);
    } catch (UnpreparedElementException e) {
      assertTrue(false);
    }

    try {
      p3.distIn(5);
      assertTrue(false);
    } catch (IndexOutOfBoundsException | UnpreparedElementException e) {
      assertTrue(true);
    }
  }
}
