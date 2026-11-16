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

## Phase 3: Path Exploration (DFS)

### What I Accomplished

In this phase, I implemented Depth-First Search (DFS) using a Stack to check whether two cities are connected in the delivery network.

I tested DFS using the same cities as BFS and compared the results. Both algorithms correctly identified connected and disconnected cities.

### Reflection

The main difference between BFS and DFS is the data structure used to explore the graph.

BFS uses a Queue, which follows First-In, First-Out (FIFO). This allows it to explore nearby cities before moving farther away.

DFS uses a Stack, which follows Last-In, First-Out (LIFO). This causes it to explore deeper paths before returning to other possible routes.

I learned that both algorithms can determine whether a route exists, but they explore the graph in different orders.

## Phase 4: Validation & Reflection

### What I Accomplished

In this phase, I tested my Route Optimization Engine using several different graph scenarios. I checked connected cities, disconnected cities, a graph with only two cities, and a graph with multiple possible routes.

I also tested situations where the starting city and destination were the same.

### Testing Results

The BFS and DFS algorithms were tested to make sure they correctly identified whether two cities were connected.

I included Miami as a disconnected city to verify that both algorithms could return false when no route existed.

I also created a smaller graph containing Dallas and Houston to test connectivity in both directions.

Finally, I created a graph with multiple possible paths to confirm that both algorithms could find a connection even when different routes were available.

### Reflection

One important thing I noticed was that BFS and DFS can return the same connectivity results even though they explore the graph differently.

BFS uses a Queue to explore nearby vertices first, while DFS uses a Stack to explore deeper branches.

I also learned that checking connectivity is different from finding the lowest-cost route. Although the graph stores weighted edges, BFS and DFS do not use those weights to calculate the cheapest path.

### AI Review

I used ChatGPT as an AI tutor to review the implementation and testing scenarios. The review suggested checking disconnected vertices, small graphs, and cases where multiple routes exist.

I kept the existing BFS and DFS implementations because they meet the connectivity requirements of this assignment. A future improvement would be to implement Dijkstra's algorithm to calculate the lowest-cost delivery route.

