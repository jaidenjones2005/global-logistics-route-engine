
public class Main {

    public static void main(String[] args) {

        WeightedGraph<String> graph = new WeightedGraph<>(6);

        graph.addVertex("New York");
        graph.addVertex("Chicago");
        graph.addVertex("Denver");
        graph.addVertex("Los Angeles");
        graph.addVertex("Seattle");
        graph.addVertex("Miami");

        graph.addEdge("New York", "Chicago", 10);
        graph.addEdge("Chicago", "Denver", 15);
        graph.addEdge("Denver", "Los Angeles", 20);
        graph.addEdge("Los Angeles", "Seattle", 12);

        // Miami is intentionally disconnected

        graph.displayGraph();

        System.out.println("\nBFS vs DFS Connectivity Tests:");

        System.out.println("\nNew York to Los Angeles:");
        System.out.println("BFS: "
                + graph.bfs("New York", "Los Angeles"));
        System.out.println("DFS: "
                + graph.dfs("New York", "Los Angeles"));

        System.out.println("\nNew York to Miami:");
        System.out.println("BFS: "
                + graph.bfs("New York", "Miami"));
        System.out.println("DFS: "
                + graph.dfs("New York", "Miami"));

        System.out.println("\nChicago to Seattle:");
        System.out.println("BFS: "
                + graph.bfs("Chicago", "Seattle"));
        System.out.println("DFS: "
                + graph.dfs("Chicago", "Seattle"));
    }
}
