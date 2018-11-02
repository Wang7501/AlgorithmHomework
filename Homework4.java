import java.util.Arrays;

//Create an undirected graph of at least 10 vertices and 15 edges.
//
//Draw the graph and include the graph image in your submission.
//
//1. Do A DFS traversal on the graph.
//
//   Print the graph before traversal - adjacency matrix or adjacency list
//
//   print the start vertex of your dfs
//
//   print the nodes in the order they were visited.
//
//2. Do a BFS traversal for the same graph.
//
//     Print the nodes in the order they are visited for the dfs traversal.
//
//
//Submit the code
//
//submit the graph that you start out with
//
//submit the screen shot of each execution

public class Homework4 {
	private static void printMatrix(int[][] matrix) {
		for (int[] i : matrix) {
			System.out.println(Arrays.toString(i));
		}
	}
	public static void main(String[] args) {
		int[][] graph = {{0,1,0,0,1,1,0,0,0,0},{1,0,1,0,0,0,1,0,0,0},{0,1,0,1,0,0,0,1,0,0},{0,0,1,0,1,0,0,0,1,0},{1,0,0,1,0,0,0,0,0,1},
		{1,0,0,0,0,0,0,1,1,0},{0,1,0,0,0,0,0,0,1,1},{0,0,1,0,0,1,0,0,0,1},{0,0,0,1,0,1,1,0,0,0},{0,0,0,0,1,0,1,1,0,0}};
		
		printMatrix(graph);
	}

}
