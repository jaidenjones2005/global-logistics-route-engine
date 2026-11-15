
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

        // Miami is intentionally disconnected for BFS testing

        graph.displayGraph();

        System.out.println("\nBFS Connectivity Tests:");

        System.out.println("New York to Los Angeles: "
                + graph.bfs("New York", "Los Angeles"));

        System.out.println("New York to Miami: "
                + graph.bfs("New York", "Miami"));

        System.out.println("Chicago to Seattle: "
                + graph.bfs("Chicago", "Seattle"));
    }
}
