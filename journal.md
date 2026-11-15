# GlobalLogistics Route Optimization Engine Journal

## Phase 1: Building the Network

### What I Accomplished

In this phase, I created a WeightedGraph class using an adjacency matrix to represent delivery hubs and transportation routes. I added six cities and connected them using weighted edges that represent fuel costs.

I also created methods to add vertices, add weighted edges, and display the graph in the terminal.

### Reflection

An adjacency matrix is a good choice for a small, fixed number of delivery hubs because it is simple to organize and makes checking connections between cities fast. Each row and column represents a city, and the values show the cost of traveling between them.

An adjacency list would use less memory for a large network with fewer connections, but the adjacency matrix works well for this smaller project.

## Phase 2: Connectivity Check (BFS)

### What I Accomplished

In this phase, I implemented Breadth-First Search (BFS) using a Queue to check whether two cities are connected in the delivery network.

I tested the algorithm with connected cities such as New York and Los Angeles and disconnected cities such as New York and Miami.

### Reflection

A Queue allows BFS to explore the graph level by level because it follows the First-In, First-Out (FIFO) principle. Cities that are discovered first are processed before cities that are discovered later.

This means BFS checks the closest neighboring cities before moving farther through the network. It is useful for determining connectivity and can also find paths with the fewest edges in an unweighted graph.

I learned how the Queue and visited array work together to prevent the algorithm from repeatedly exploring the same cities.

