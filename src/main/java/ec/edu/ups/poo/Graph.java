package ec.edu.ups.poo;
import java.util.HashSet;
import java.util.Set;


public class Graph {
    private Set<Node> nodes;

    public Graph() {
        nodes = new HashSet<Node>();
    }

    public Node addNode(int value) {
        Node node = new Node(value);
        nodes.add(node);
        return node;
    }

    // Metodo para añadir una arista
    public void addEdge(Node src, Node dest){
        src.addNeighbor(dest);
        dest.addNeighbor(src);
    }
    public void addEdgeUni(Node src, Node dest){
        src.addNeighbor(dest);
    }

    //
    public void printGraph(){
        //imprimir nodos con todas sus relaciones
        for(Node n : nodes){
            System.out.print( n + "→");
            Set nodosVecinos = n.getNodes();
            for(Object nVecino : nodosVecinos){
                System.out.print(" - "+nVecino);
            }
            System.out.println("\n");

        }
    }
    public void getDFS(Node startNode){}
    private void getDFS (Node node, boolean[] visited){}
    public void getBFS(Node startNode){}
    public int [][] getAdjacencyMatrix(){
        return null;
    }
    public void printAdjacencyMatrix(){}

}