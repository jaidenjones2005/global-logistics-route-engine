# GlobalLogistics Route Optimization Engine Journal

## Phase 1: Building the Network

### What I Accomplished

In this phase, I created a WeightedGraph class using an adjacency matrix to represent delivery hubs and transportation routes. I added six cities and connected them using weighted edges that represent fuel costs.

I also created methods to add vertices, add weighted edges, and display the graph in the terminal.

### Reflection

An adjacency matrix is a good choice for a small, fixed number of delivery hubs because it is simple to organize and makes checking connections between cities fast. Each row and column represents a city, and the values show the cost of traveling between them.

An adjacency list would use less memory for a large network with fewer connections, but the adjacency matrix works well for this smaller project.

