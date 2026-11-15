
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
        graph.addEdge("New York", "Miami", 25);

        graph.displayGraph();
    }
}