
public class Main {

    public static void main(String[] args) {

        // Test 1: Original delivery network
        System.out.println("=== TEST 1: DELIVERY NETWORK ===");

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

        graph.displayGraph();

        testConnection(graph, "New York", "Los Angeles");
        testConnection(graph, "New York", "Miami");
        testConnection(graph, "Chicago", "Seattle");
        testConnection(graph, "Miami", "Seattle");
        testConnection(graph, "Denver", "Denver");

        // Test 2: Only two connected cities
        System.out.println("\n=== TEST 2: TWO CITIES ===");

        WeightedGraph<String> smallGraph = new WeightedGraph<>(2);

        smallGraph.addVertex("Dallas");
        smallGraph.addVertex("Houston");

        smallGraph.addEdge("Dallas", "Houston", 5);

        smallGraph.displayGraph();

        testConnection(smallGraph, "Dallas", "Houston");
        testConnection(smallGraph, "Houston", "Dallas");

        // Test 3: Multiple possible paths
        System.out.println("\n=== TEST 3: MULTIPLE PATHS ===");

        WeightedGraph<String> pathGraph = new WeightedGraph<>(5);

        pathGraph.addVertex("A");
        pathGraph.addVertex("B");
        pathGraph.addVertex("C");
        pathGraph.addVertex("D");
        pathGraph.addVertex("E");

        pathGraph.addEdge("A", "B", 2);
        pathGraph.addEdge("B", "C", 3);
        pathGraph.addEdge("C", "D", 4);
        pathGraph.addEdge("A", "D", 10);
        pathGraph.addEdge("D", "E", 5);

        pathGraph.displayGraph();

        testConnection(pathGraph, "A", "E");
        testConnection(pathGraph, "B", "E");

        System.out.println("\n=== ALL TESTS COMPLETED ===");
    }

    public static void testConnection(
            WeightedGraph<String> graph,
            String start,
            String end) {

        System.out.println("\n" + start + " to " + end);
        System.out.println("BFS: " + graph.bfs(start, end));
        System.out.println("DFS: " + graph.dfs(start, end));
    }
}
