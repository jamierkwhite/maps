
import java.util.LinkedList;
import java.util.List;

import org.junit.Test;

import edu.brown.cs.jwhite13.kdTree.DimensionalComparator;
import edu.brown.cs.jwhite13.kdTree.KDTree;
import edu.brown.cs.jwhite13.kdTree.Point2d;
import junit.framework.TestCase;

/**
 * @author jwhite13 class to test KDTree
 */
public class KDTreeTest extends TestCase {
  private KDTree<Point2d> tree;

  @Override
  protected void setUp() {
    @SuppressWarnings("rawtypes")
    List<DimensionalComparator> list = new LinkedList<DimensionalComparator>();
    list.add(new Point2d(0, 0));
    list.add(new Point2d(0, 1));
    list.add(new Point2d(0, 2));
    list.add(new Point2d(1, 2));
    list.add(new Point2d(2, -3));
    list.add(new Point2d(-1, 0));
    list.add(new Point2d(2, 2));
    list.add(new Point2d(1, 3));
    list.add(new Point2d(1, 2));
    list.add(new Point2d(1, 1));
    this.tree = new KDTree<Point2d>(list, 2);
  }

  /**
   * test building the constructor.
   */
  @Test
  public void testConstructor() {
    assertNotNull(tree);
  }
}
