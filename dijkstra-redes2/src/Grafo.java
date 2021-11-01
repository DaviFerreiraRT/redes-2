
import java.util.ArrayList;
import java.util.List;

public class Grafo {

    public static final int INFINITY = Integer.MAX_VALUE / 2;
    protected int[][] adj;
    protected int numberOfEdges;
    protected int numberOfVertices;

    public Grafo(int numberOfVertices) {
        this.numberOfVertices = numberOfVertices;
        this.adj = new int[numberOfVertices][numberOfVertices];

        for (int i = 0; i < adj.length; i++) {
            for (int j = 0; j < adj.length; j++) {
                if (i == j) {
                    adj[i][j] = 0;
                } else {
                    adj[i][j] = Grafo.INFINITY;
                }
            }
        }
    }

    public void removeEdge(int v, int w) {
        adj[v][w] = Grafo.INFINITY;

        numberOfEdges--;
    }

    public void addEdge(int v, int w, int weighted) {
        adj[v][w] = weighted;

        numberOfEdges++;
    }

    public List<Integer> getPredecessors(int v) {
        List<Integer> result = new ArrayList<Integer>();

        for (int i = 0; i < adj.length; i++) {
            if (adj[i][v] != INFINITY) {
                result.add(i);
            }
        }

        return result;
    }

    public List<Integer> getAdjacentes(int v) {
        List<Integer> result = new ArrayList<Integer>();

        for (int i = 0; i < adj.length; i++) {
            if (adj[v][i] != INFINITY) {
                result.add(i);
            }
        }

        return result;
    }

    public int getWeight(int v, int w) {
        return adj[v][w];
    }

    public int getNumberOfVertices() {
        return numberOfVertices;
    }

    public int getNumberOfEdges() {
        return numberOfEdges;
    }

    public List<Integer> getVertices() {
        List<Integer> result = new ArrayList<Integer>();
        for (int i = 0; i < getNumberOfVertices(); i++) {
            result.add(i);
        }

        return result;
    }

    public boolean hasEdge(int source, int i) {
        return getWeight(source, i) != INFINITY;
    }
}