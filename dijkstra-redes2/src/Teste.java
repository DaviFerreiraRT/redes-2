import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Teste {


        public static void main(String[] args) {
        Grafo graph = new Grafo(11);
        int A = GrafoEnum.A.ordinal();
        int B = GrafoEnum.B.ordinal();
        int C = GrafoEnum.C.ordinal();
        int D = GrafoEnum.D.ordinal();
        int E = GrafoEnum.E.ordinal();
        int F = GrafoEnum.F.ordinal();
        int G = GrafoEnum.G.ordinal();

        graph.addEdge(A,B,7);
        graph.addEdge(A,D,5);
        graph.addEdge(B,C,8);
        graph.addEdge(B,D,9);
        graph.addEdge(B,E,7);
        graph.addEdge(C,E,5);
        graph.addEdge(D,E,15);;
        graph.addEdge(D,F,6);
        graph.addEdge(E,F,8);
        graph.addEdge(E,G,9);
        graph.addEdge(F,G,11);



        int source = 0;
        Dijkstra dijkstra = new Dijkstra(graph, source);

        List<Integer> vertices = graph.getVertices();
        for (Integer v : vertices) {
            Collection<Integer> path = dijkstra.pathTo(v);

            System.out.println("O caminho de " + source + " para " + v + ": " + path);
            System.out.println("A distancia é: " + dijkstra.getDistanceTo(v));
        }

        System.out.println(Arrays.toString(dijkstra.getDistTo()));
        System.out.println(Arrays.toString(dijkstra.getEdgeTo()));
    }

}
