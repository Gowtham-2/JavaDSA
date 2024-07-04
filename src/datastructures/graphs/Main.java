package datastructures.graphs;

public class Main {
    public static void main(String[] args) {
        Graph gp=new Graph();
        gp.addVertex("A");
        gp.addVertex("B");
        gp.addVertex("C");
        gp.addVertex("D");
        gp.addEdge("A","C");
        gp.addEdge("A","B");
        gp.addEdge("A","D");
        gp.addEdge("B","D");
        gp.addEdge("C","D");
       // gp.removeEdge("A","B");
        gp.removeVertex("D");
        gp.printGraph();
    }
}
