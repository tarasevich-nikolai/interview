package tarasevich.nikolai.interview.algo.graph;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/**
 * @author nikolai.tarasevich
 */
public class Graph {

    private Map<Integer, Node> nodeLookup = new HashMap<>();

    @Getter
    @EqualsAndHashCode
    public static class Node {
        private int id;
        private LinkedList<Node> adjacent = new LinkedList<>();

        public Node(int id) {
            this.id = id;
        }
    }

    public Graph(int size) {
        for (int i =0; i < size; i++) {
            this.nodeLookup.put(i, new Node(i));
        }
        //this.nodeLookup.put(0, new Node(0));
    }

    public Node getNode(int id) {
        if (nodeLookup.get(id) != null) {
            return this.nodeLookup.get(id);
        }
        return new Node(id);
    }

    public void addEdge(int source, int dest) {
        Node s = getNode(source);
        Node d = getNode(dest);
        s.adjacent.add(d);
    }
}
