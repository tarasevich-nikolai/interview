package tarasevich.nikolai.interview.algo.graph.util;

import tarasevich.nikolai.interview.algo.graph.Graph;

/**
 * @author nikolai.tarasevich
 */
public class GraphHelper {

    public static Graph generateGraph() {
        Graph graph = new Graph(9);
        graph.addEdge(0, 1);
        graph.addEdge(0, 3);
        graph.addEdge(0, 4);

        graph.addEdge(1, 0);
        graph.addEdge(1, 2);

        graph.addEdge(2, 1);
        graph.addEdge(2, 3);

        graph.addEdge(3, 0);
        graph.addEdge(3, 2);
        graph.addEdge(3, 8);

        graph.addEdge(4, 0);
        graph.addEdge(4, 5);

        graph.addEdge(5, 4);
        graph.addEdge(5, 6);

        graph.addEdge(6, 5);
        graph.addEdge(6, 7);
        graph.addEdge(6, 8);

        graph.addEdge(7, 6);
        graph.addEdge(7, 8);

        graph.addEdge(8, 3);
        graph.addEdge(8, 6);
        graph.addEdge(8, 7);

        return graph;
    }
}
