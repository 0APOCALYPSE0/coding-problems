/**
 * Program to represent undirected graph using adjacency matrix
 * @author Aakash Giri
 */
public class GraphAdjacencyMatrix {

  // A utility function to add an edge in an
  // undirected graph
  static void addEdge(int adj[][], int u, int v){
      adj[u][v] = 1;
      adj[v][u] = 1;
  }

  // A utility function to remove an edge in on
  // undirected graph
  static void removeEdge(int adj[][], int u, int v){
    adj[u][v] = 0;
    adj[v][u] = 0;
  }

  // A utility function to print the adjacency matrix where 1 indicates edge
  // representation of graph
  static void printGraph(int adj[][], int V){
    for(int i=0; i<V; i++){
      System.out.print(i+": ");
      for(int j=0; j<V; j++){
        System.out.print(adj[i][j]+" ");
      }
      System.out.println();
    }
  }

  public static void main(String args[]){
    //Creating a graph with 5 vertices
    int V = 5;
    int adj[][] = new int[V][V];

    // Adding edges one by one
    addEdge(adj, 0, 1);
    addEdge(adj, 0, 4);
    addEdge(adj, 1, 2);
    addEdge(adj, 1, 3);
    addEdge(adj, 1, 4);
    addEdge(adj, 2, 3);
    addEdge(adj, 3, 4);

    printGraph(adj, V);

  }
}