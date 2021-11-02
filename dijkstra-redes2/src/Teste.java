import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Teste {


        public static void main(String[] args) {
        Grafo graph = new Grafo(7);
        GrafoEnum A = GrafoEnum.A;
        GrafoEnum B = GrafoEnum.B;
        GrafoEnum C = GrafoEnum.C;
        GrafoEnum D = GrafoEnum.D;
        GrafoEnum E = GrafoEnum.E;
        GrafoEnum F = GrafoEnum.F;
        GrafoEnum G = GrafoEnum.G;

        graph.addEdge(A.ordinal(),B.ordinal(),7);
        graph.addEdge(A.ordinal(),D.ordinal(),5);
        graph.addEdge(B.ordinal(),C.ordinal(),8);
        graph.addEdge(B.ordinal(),D.ordinal(),9);
        graph.addEdge(B.ordinal(),E.ordinal(),7);
        graph.addEdge(C.ordinal(),E.ordinal(),5);
        graph.addEdge(D.ordinal(),E.ordinal(),15);;
        graph.addEdge(D.ordinal(),F.ordinal(),6);
        graph.addEdge(E.ordinal(),F.ordinal(),8);
        graph.addEdge(E.ordinal(),G.ordinal(),9);
        graph.addEdge(F.ordinal(),G.ordinal(),11);



        int source = A.ordinal();
        Dijkstra dijkstra = new Dijkstra(graph, source);

        List<Integer> vertices = graph.getVertices();
        for (Integer v : vertices) {
            Collection<Integer> path = dijkstra.pathTo(v);

            if(v == A.ordinal()) {
                    System.out.println("O caminho de " + A + " para " + A + ": " + path);
            }
            else if(v == B.ordinal()){
                    System.out.println("O caminho de " + A + " para " + B + ": " + path);
            }
            else if (v == C.ordinal()){
                    System.out.println("O caminho de " + A + " para " + C + ": " + path);
            }
            else if (v == D.ordinal()){
                    System.out.println("O caminho de " + A + " para " + D + ": " + path);
            }
            else if (v == E.ordinal()){
                    System.out.println("O caminho de " + A + " para " + E + ": " + path);
            }
            else if (v == F.ordinal()){
                    System.out.println("O caminho de " + A + " para " + F + ": " + path);
            }
            else if (v == G.ordinal()){
                    System.out.println("O caminho de " + A + " para " + G + ": " + path);
            }

            System.out.println("A distancia é: " + dijkstra.getDistanceTo(v));
        }


    }

}
