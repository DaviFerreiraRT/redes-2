import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Stack;

public class Dijkstra {
    private int edgeTo[];
    private int[] distTo;
    private int source;

    public Dijkstra(Grafo graph, int source) {
        this.source = source;
        edgeTo = new int[graph.getNumberOfVertices()];
        distTo = new int[graph.getNumberOfVertices()];

        for (int i = 0; i < distTo.length; i++) {
            distTo[i] = Grafo.INFINITY;
            edgeTo[i] = 0;
        }
        distTo[source] = 0;
        edgeTo[source] = 0;

        execute(graph, source);
    }

    private void execute(Grafo graph, int s) {
        List<Integer> open = graph.getVertices();
        List<Integer> closed = new ArrayList<Integer>();

        while (!open.isEmpty()) {
            Collections.sort(open, new Comparator<Integer>() {
                @Override
                public int compare(Integer v1, Integer v2) {
                    return distTo[v1] - distTo[v2];
                }
            });

            Integer v = open.get(0);
            closed.add(v);
            open.remove(v);

            List<Integer> adj = graph.getAdjacentes(v);
            for(Integer w :  adj) {
                if (!closed.contains(w)) {
                    if (distTo[v] + graph.getWeight(v, w) < distTo[w]) {
                        distTo[w] = distTo[v] + graph.getWeight(v, w);
                        edgeTo[w] = v;
                    }
                }
            }
        }

    }

    public Collection<Integer> pathTo(int v) {
        // LIFO
        Stack<Integer> path = new Stack<Integer>();
        for(int x = v; x != source; x = edgeTo[x]) {
            path.push(x);
        }

        path.push(source);

        return path;
    }

    public int getDistanceTo(int v) {
        return distTo[v];
    }

    public int [] getDistTo() {
        return distTo;
    }

    public int[] getEdgeTo() {
        return edgeTo;
    }
}
