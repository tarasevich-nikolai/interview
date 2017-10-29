package tarasevich.nikolai.interview.algo.graph;

import tarasevich.nikolai.interview.algo.graph.util.GraphHelper;

import java.util.HashSet;
import java.util.Set;

import static tarasevich.nikolai.interview.algo.graph.Graph.Node;

/**
 * @author nikolai.tarasevich
 */
public class DFS {

    public static boolean hasPathDFS(int source, int destination, Graph graph) {
        Node start = graph.getNode(source);
        Node end = graph.getNode(destination);
        Set<Integer> visited = new HashSet<>();
        return hasPathDFS(start, end, graph, visited);
    }

    private static boolean hasPathDFS(Node start, Node end, Graph graph, Set<Integer> visited) {
        if (visited.contains(start.getId())) {
            return false;
        }
        visited.add(start.getId());
        if (start.getId() == end.getId()) {
            return true;
        }
        for (Node node : start.getAdjacent()) {
            if (hasPathDFS(node, end, graph, visited)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Graph graph = GraphHelper.generateGraph();
        System.out.println(DFS.hasPathDFS(0, 9, graph));
    }
}
