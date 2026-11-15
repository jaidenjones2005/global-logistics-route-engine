
import java.util.ArrayList;
import java.util.Arrays;

public class WeightedGraph<T> {

    private ArrayList<T> vertices;
    private int[][] adjacencyMatrix;
    private int maxVertices;

    public WeightedGraph(int maxVertices) {
        this.maxVertices = maxVertices;
        vertices = new ArrayList<>();
        adjacencyMatrix = new int[maxVertices][maxVertices];

        for (int[] row : adjacencyMatrix) {
            Arrays.fill(row, -1);
        }
    }

    public void addVertex(T vertex) {
        if (vertices.size() >= maxVertices) {
            throw new IllegalStateException("Graph is full.");
        }

        if (vertices.contains(vertex)) {
            throw new IllegalArgumentException(
                    "Vertex already exists.");
        }

        vertices.add(vertex);
    }

    public void addEdge(T source, T destination, int weight) {
        int sourceIndex = vertices.indexOf(source);
        int destinationIndex = vertices.indexOf(destination);

        if (sourceIndex == -1 || destinationIndex == -1) {
            throw new IllegalArgumentException(
                    "One or both cities do not exist.");
        }

        if (weight < 0) {
            throw new IllegalArgumentException(
                    "Weight cannot be negative.");
        }

        adjacencyMatrix[sourceIndex][destinationIndex] = weight;
        adjacencyMatrix[destinationIndex][sourceIndex] = weight;
    }

    public void displayGraph() {
        System.out.println("\nDelivery Network:");

        for (int i = 0; i < vertices.size(); i++) {
            System.out.print(vertices.get(i) + " -> ");

            for (int j = 0; j < vertices.size(); j++) {
                if (adjacencyMatrix[i][j] != -1) {
                    System.out.print(
                            vertices.get(j) + "("
                                    + adjacencyMatrix[i][j] + ") ");
                }
            }

            System.out.println();
        }
    }
}
