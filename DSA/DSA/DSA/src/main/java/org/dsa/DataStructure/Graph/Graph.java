package org.dsa.DataStructure.Graph;
//                 Edge(line between 0,2)
//            2---------------0
//           / \
//         /    \
//      1--------3 <--- vertices (3,1,2,0)
//
//Edge List
// int[][] edges = {{0,2},{2,1},{2,3},{1,3}};
//
//Adjacent List
// Map<Integer,List> adjacent = {0={2},2={1,3,0},1={2,3},3={1,2}};
//
//Adjacent Matrix
// int[][] graph = [
//                        0 1 2 3
//                        | | | |
//                0 ->   [0,0,1,0],
//                1 ->   [0,0,1,1],
//                2 ->   [1,1,0,1],
//                3 ->   [0,1,1,0]
//                 ]


import java.util.*;

public class Graph {

//    3--------4-------------5
//    |        |             |
//    |        |             |
//    1--------2             6
//    \       /
//     \     /
//      \   /
//       \ /
//        0

    private Map<Integer, List<Integer>> adjacentList;

    Graph() {
        this.adjacentList = new HashMap();
    }

    public void addVertex(int node) {
       adjacentList.putIfAbsent(node,new ArrayList<>());
    }

//    public void removeVertex(int node) {
//        adjacentList.values().stream().forEach(e -> e.remove(node));
//        adjacentList.remove(node);
////        this.noOfNodes--;
//    }

    public void addEdge(int node1, int node2) {

        adjacentList.get(node1).add(node2);
        adjacentList.get(node2).add(node1);
    }

//    public void removeEdge(int node1, int node2) {
//
//        adjacentList.get(node1).remove(node2);
//        adjacentList.get(node2).remove(node1);
//    }

    public static void main(String[] args) {
        Graph graph = new Graph();
        graph.addVertex(0);
        graph.addVertex(1);
        graph.addVertex(2);
        graph.addVertex(3);
        graph.addVertex(4);
        graph.addVertex(5);
        graph.addVertex(6);

        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(2, 4);
        graph.addEdge(3, 4);
        graph.addEdge(4, 5);
        graph.addEdge(5, 6);


        System.out.println(graph.adjacentList);


    }

}
