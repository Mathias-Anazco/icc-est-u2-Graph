package ec.edu.ups.poo;

import java.util.HashSet;
import java.util.Set;

public class Node {
    private int value;
    Set<Node> nodes;
    public Node(int value) {
        this.value = value;
        nodes = new HashSet<Node>();
    }
    public int getValue() {
        return value;
    }

    public Set<Node> getNodes() {
        return nodes;
    }

    public void addNeighbor(Node neighbor) {
        nodes.add(neighbor);
    }

    @Override
    public String toString() {
        return  value + "" ;
    }
}