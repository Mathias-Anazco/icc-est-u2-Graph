package ec.edu.ups.poo;

public class Main {
    public static void main(String[] args) {
        Graph graph = new Graph();

        Node nodoBase = graph.addNode(0);

        Node n1 = graph.addNode(1);
        Node n2 = graph.addNode(2);
        Node n3 = graph.addNode(3);
        Node n4 = graph.addNode(4);
        Node n5 = graph.addNode(5);
        Node n7 = graph.addNode(7);
        Node n8 = graph.addNode(8);
        Node n9 = graph.addNode(9);

        graph.addEdge(nodoBase,n3);
        graph.addEdge(nodoBase,n5);
        graph.addEdge(nodoBase,n1);

        graph.addEdge(n2,n3);
        graph.addEdge(n2,n1);

        graph.addEdge(n3,n2);
        graph.addEdge(n3,n4);
        graph.addEdge(n3,n7);
        graph.addEdge(n3,n9);

        graph.addEdge(n4,n1);
        graph.addEdge(n4,n3);

        graph.addEdge(n7,n3);
        graph.addEdge(n7,n8);

        graph.addEdge(n8,n1);
        graph.addEdge(n8,n7);

        graph.printGraph();


    }
}