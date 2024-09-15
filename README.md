<h1>Dijkstra's Algorithm Project 🌍</h1>

<h2>Overview</h2>
<p>
    This project implements <strong>Dijkstra's algorithm</strong> to find the shortest route between two cities selected by the user. The application calculates the most cost-effective path based on Euclidean distances between cities, represented as vertices in a graph.
</p>

<h2>Project Details</h2>

<h3>Input:</h3>
<ul>
    <li>A map with cities represented as points (vertices) and roads as connections (edges).</li>
    <li>Each city is defined by its coordinates (x, y), and the distance between two cities is calculated using the Euclidean formula.</li>
</ul>

<h3>Output:</h3>
<ul>
    <li>Displays the shortest route between two cities on the map, with the lowest travel cost based on distance.</li>
</ul>

<h2>Dijkstra's Algorithm</h2>
<p>
    Dijkstra's algorithm solves the shortest path problem for a weighted graph by maintaining a priority queue (PQ) of known shortest paths from the source to each city. Initially, all vertices are assigned infinite distance, except the source city, which is assigned 0. The algorithm explores neighboring vertices, updating the shortest path when a smaller distance is found.
</p>

<h2>Optimization</h2>
<p>
    To handle thousands of queries efficiently, the algorithm can be optimized by only re-initializing distances for vertices affected by the previous query, reducing the running time. The goal is to ensure fast query times without excessive space usage.
</p>

<h2>Features</h2>
<ul>
    <li><strong>Interactive City Selection:</strong> Users can choose cities using either the mouse or keyboard.</li>
    <li><strong>Route Visualization:</strong> The shortest path between cities is shown directly on the map.</li>
    <li><strong>Large-Scale Maps:</strong> The project includes at least 50 real-world countries with actual coordinates and distances.</li>
</ul>

<h2>Technical Requirements</h2>
<ul>
    <li><strong>Graph Representation:</strong> Vertices represent cities, and edges represent roads between cities with weights calculated as Euclidean distances.</li>
    <li><strong>Map Input:</strong> The map is read from a file that lists vertices (countries) and edges (connections between countries).</li>
</ul>

<h2>Example Map Input</h2>
<pre>
6 9
Country1 1000 2400
Country 2 2800 3000
Country 3 2400 2500
Country 4 4000 0
Country 5 4500 3800
Country 6 6000 1500
Country 1 Country 2
Country 1 Country 4
Country 2 Country 3
Country 2 Country 5
Country 3 Country 5
Country 3 Country 4
Country 3 Country 6
Country 4 Country 6
Country 5 Country 6
</pre>

<h2>Future Goals</h2>
<ul>
    <li>Optimize Dijkstra's algorithm further to process thousands of queries in sublinear time.</li>
    <li>Precompute shortest paths without using excessive memory space.</li>
</ul>


![qq](https://github.com/user-attachments/assets/92e3a402-61ee-44b6-bef8-709dc2b0eb80)
