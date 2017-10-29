package tarasevich.nikolai.interview.algo.graph;

import tarasevich.nikolai.interview.algo.graph.util.GraphHelper;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

import static tarasevich.nikolai.interview.algo.graph.Graph.Node;

/**
 * @author nikolai.tarasevich
 */
public class BFS {

    public static boolean hasPathBFS(int src, int dst, Graph graph) {
        Node start = graph.getNode(src);
        Node end = graph.getNode(dst);
        Set<Integer> visited = new HashSet<>();
        LinkedList<Node> nextToVisit = new LinkedList<>();
        nextToVisit.add(start);

        while (!nextToVisit.isEmpty()) {
            Node node = nextToVisit.remove();
            if (visited.contains(node.getId())) {
                continue;
            }
            if (node.getId() == end.getId()) {
                return true;
            }
            visited.add(node.getId());
            nextToVisit.addAll(node.getAdjacent());
        }

        return false;
    }

    public static void main(String[] args) {
        Graph graph = GraphHelper.generateGraph();
        System.out.println(BFS.hasPathBFS(0, 5, graph));
    }
}
