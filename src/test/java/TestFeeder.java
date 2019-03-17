
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import edu.brown.cs.jwhite13.dijkstra.DijkstraFeeder;
import edu.brown.cs.jwhite13.dijkstra.GraphEdge;
import edu.brown.cs.jwhite13.dijkstra.GraphNode;
import edu.brown.cs.jwhite13.structures.Pair;
import edu.brown.cs.jwhite13.tries.NodeNotFoundException;

/**
 * @author jamie
 *
 */
public class TestFeeder implements DijkstraFeeder<String> {
  private HashMap<String, Pair<String, Integer>[]> graph;

  /**
   * constructor.
   */
  @SuppressWarnings("unchecked")
  public TestFeeder() {
    graph = new HashMap<String, Pair<String, Integer>[]>();
    graph.put("s", new Pair[] {
        new Pair<String, Integer>("a", 7), new Pair<String, Integer>("b", 2),
        new Pair<String, Integer>("c", 3)
    });

    graph.put("a", new Pair[] {
        new Pair<String, Integer>("b", 3), new Pair<String, Integer>("d", 4),
        new Pair<String, Integer>("s", 7)
    });

    graph.put("b", new Pair[] {
        new Pair<String, Integer>("h", 1), new Pair<String, Integer>("d", 4),
        new Pair<String, Integer>("a", 3), new Pair<String, Integer>("s", 2)
    });

    graph.put("c", new Pair[] {
        new Pair<String, Integer>("l", 2), new Pair<String, Integer>("s", 3)
    });

    graph.put("d", new Pair[] {
        new Pair<String, Integer>("a", 4), new Pair<String, Integer>("b", 4),
        new Pair<String, Integer>("f", 5)
    });

    graph.put("e", new Pair[] {
        new Pair<String, Integer>("k", 5), new Pair<String, Integer>("g", 2)
    });

    graph.put("f", new Pair[] {
        new Pair<String, Integer>("d", 5), new Pair<String, Integer>("h", 3)
    });

    graph.put("g", new Pair[] {
        new Pair<String, Integer>("h", 2), new Pair<String, Integer>("e", 2)
    });

    graph.put("h", new Pair[] {
        new Pair<String, Integer>("b", 1), new Pair<String, Integer>("f", 3),
        new Pair<String, Integer>("g", 2)
    });

    graph.put("i", new Pair[] {
        new Pair<String, Integer>("j", 6), new Pair<String, Integer>("k", 4),
        new Pair<String, Integer>("l", 4)
    });

    graph.put("j", new Pair[] {
        new Pair<String, Integer>("l", 4), new Pair<String, Integer>("i", 6),
        new Pair<String, Integer>("k", 4)
    });

    graph.put("k", new Pair[] {
        new Pair<String, Integer>("i", 4), new Pair<String, Integer>("j", 4),
        new Pair<String, Integer>("e", 5)
    });

    graph.put("l", new Pair[] {
        new Pair<String, Integer>("c", 2), new Pair<String, Integer>("i", 4),
        new Pair<String, Integer>("j", 4)
    });

    graph.put("unconnected", new Pair[0]);
  }

  @Override
  public GraphNode<String> getNode(String thing) throws NodeNotFoundException {
    return new GraphNode<String>(thing);
  }

  @Override
  public List<GraphEdge<String>> getEdges(String thing) {
    List<GraphEdge<String>> out = new ArrayList<GraphEdge<String>>();
    for (Pair<String, Integer> p : graph.get(thing)) {
      out.add(new GraphEdge<String>(p.item1(), thing, p.item2()));
    }
    return out;
  }
}
