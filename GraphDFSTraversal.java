import java.util.*;
/**
 * Program to traversal the directed graph using Depth First Search (BFS)
 * @author Aakash Giri
 */

// Java program to print DFS traversal from a given given graph
// This class represents a directed graph using adjacency list representation
public class GraphDFSTraversal {

  //Number of vertices
  private int V;
  // Adjacency List Representation
  private LinkedList<Integer> adj[];

  // Constructor
  @SuppressWarnings("unchecked") GraphDFSTraversal(int v){
      V = v;
      adj = new LinkedList[v];
      for (int i = 0; i < v; ++i)
          adj[i] = new LinkedList();
  }

  // Function to add an edge into the graph
  void addEdge(int v, int w){
      adj[v].add(w); // Add w to v's list.
  }

  // A function used by DFS
  void DFSUtil(int s, boolean visited[]){
      // Mark the current node as visited and print it
      visited[s] = true;
      System.out.print(s + " ");

      // Recur for all the vertices adjacent to this
      // vertex
      Iterator<Integer> i = adj[s].listIterator();
      while (i.hasNext()) {
          int n = i.next();
          if (!visited[n])
              DFSUtil(n, visited);
      }
  }

  // The function to do DFS traversal.
  // It uses recursive
  // DFSUtil()
  void DFS(int s){
      // Mark all the vertices as
      // not visited(set as
      // false by default in java)
      boolean visited[] = new boolean[V];

      // Call the recursive helper
      // function to print DFS
      // traversal
      DFSUtil(s, visited);
  }

  public static void main(String args[]){
    GraphDFSTraversal graph = new GraphDFSTraversal(4);

    graph.addEdge(0, 1);
    graph.addEdge(0, 2);
    graph.addEdge(1, 2);
    graph.addEdge(2, 0);
    graph.addEdge(2, 3);
    graph.addEdge(3, 3);

    System.out.println(
        "Following is Depth First Traversal "
        + "(starting from vertex 2)");

    graph.DFS(2);
  }
}
