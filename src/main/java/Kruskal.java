package main.java;

import java.util.*;

public class Kruskal {

    public static Set<Arista> kruskal(Grafo grafo) {
        Set<Arista> arbolRecubrimientoMinimo = new HashSet<>();
        List<Arista> aristasOrdenadasPorCosto = grafo.getAristasOrdenadasPorCosto();
        //Conjunto de conjuntos, empiezan todos disjuntos en kruskal.
        Set<Set<Integer>> componentesDisjuntos = new HashSet<>();

        // Inicializar los componentes disjuntos (conjuntos unitarios)
        for (int vertice = 1; vertice <= grafo.getNumVertices(); vertice++) {
            Set<Integer> componente = new HashSet<>();
            componente.add(vertice);
            componentesDisjuntos.add(componente);
        }

        // Recorrer las aristas del grafo en orden ascendente de costo
        for (Arista arista : aristasOrdenadasPorCosto) {
            int origen = arista.getOrigen();
            int destino = arista.getDestino();
            Set<Integer> componenteOrigen = null;
            Set<Integer> componenteDestino = null;

            // Buscar los componentes disjuntos que contienen los vértices origen y destino
            for (Set<Integer> componente : componentesDisjuntos) {
                if (componente.contains(origen)) {
                    componenteOrigen = componente;
                }
                if (componente.contains(destino)) {
                    componenteDestino = componente;
                }
            }

            //Si los componentes disjuntos son distintos, unirlos y agregar la arista al árbol de recubrimiento mínimo
            if (componenteOrigen != componenteDestino) {
                arbolRecubrimientoMinimo.add(arista);
                componentesDisjuntos.remove(componenteOrigen);
                componentesDisjuntos.remove(componenteDestino);
                Set<Integer> nuevoComponente = new HashSet<>();
                nuevoComponente.addAll(componenteOrigen);
                nuevoComponente.addAll(componenteDestino);
                componentesDisjuntos.add(nuevoComponente);

                // Si el árbol de recubrimiento mínimo tiene n-1 aristas, donde n es el número de vértices del grafo, se ha encontrado el árbol de recubrimiento mínimo
                if (arbolRecubrimientoMinimo.size() == grafo.getNumVertices() - 1) {
                    break;
                }
            }
        }

        return arbolRecubrimientoMinimo;
    }


    public static void main(String[] args) {
        Arista ar1 = new Arista(1,3,1);
        Arista ar2 = new Arista(1,2,6);
        Arista ar3 = new Arista(1,4,5);
        Arista ar4 = new Arista(2,3,5);
        Arista ar5 = new Arista(3,4,5);
        Arista ar6 = new Arista(3,6,4);
        Arista ar7 = new Arista(3,5,6);
        Arista ar8 = new Arista(4,6,2);
        Arista ar9 = new Arista(6,5,6);
        Arista ar10 = new Arista(5,2,3);
        List<Arista> aristas = Arrays.asList(ar1,ar2,ar3,ar4,ar5,ar6,ar7,ar8,ar9,ar10);
        Grafo grafo = new Grafo(6,aristas);
        Set<Arista> resultado = kruskal(grafo);
        resultado.forEach(g -> {
            System.out.println(g.getOrigen() + " " + g.getDestino() + " " + g.getCosto());
        });
    }


}