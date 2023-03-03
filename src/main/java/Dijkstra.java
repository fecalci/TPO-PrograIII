public class Dijkstra {
    // Número de vértices en el grafo
    static final int V  = 9;

    // Función utilitaria para encontrar el vértice con la distancia mínima,
    // a partir del conjunto de los vértices todavía no incluidos en el
    // camino más corto
    private static int distanciaMinima(int[] dist, boolean[] verticeYaProcesado)
    {
        // Inicializar el valor mínimo, lo pone en infinito
        int min = Integer.MAX_VALUE;
        int minIndice = 0;

        // v tiene que ser menor a número total de vértices
        for (int v = 0; v < V; v++)

            // Si la distancia es menor o igual a infinito y el vértice no fue
            // procesado aún.
            if (verticeYaProcesado[v] == false && dist[v] <= min) {
                // min ahora es la distancia mínima almacenada
                min = dist[v];
                // Y guarda el índice de la última distancia mínima
                minIndice = v;
            }

        return minIndice;
    }

    // Función las distancias calculadas
    private static void imprimirSolucion(int[] dist, int n)
    {
        String[] letras = {"A", "B","C", "D","F", "G","H", "I","J", "K","L",
                "M","N", "O","P", "Q","R", "S","T", "U","V", "W","X", "Y","Z"};

        System.out.println("Distancia del vértice desde el origen\n");
        for (int i = 0; i < V; i++)
            System.out.println(letras[i] + " \t\t " + dist[i]);
    }

    private static void dijkstra(int[][] grafo, int src)
    {   // Crea dist con la cantidad V de espacios que va a ocupar con 0
        int[] dist = new int[V];
        // dist[i] guarda la distancia más corta desde src hasta el vértice i

        // Crea verticeYaProcesado con la cantidad de espacios que va a ocupar V con false
        boolean[] verticeYaProcesado = new boolean[V];
        // Este arreglo tiene true si el vértice i ya fue procesado

        // Inicializa todas las distancias como INFINITO y los vértices como False
        for (int i = 0; i < V; i++) {
            dist[i] = Integer.MAX_VALUE;
            verticeYaProcesado[i] = false;
        }
        // La distancia del vértice origen hacia el mismo es siempre 0
        dist[src] = 0;

        //Encuentra el camino más corto para todos los vértices
        for (int count = 0; count < V-1; count++)
        {

            //Toma el vértice con la distancia mínima del conjunto de vértices aún no procesados
            //En la primera iteración siempre se devuelve src como true
            int u = distanciaMinima(dist, verticeYaProcesado);

            // Se marca como ya procesado
            verticeYaProcesado[u] = true;

            // Actualiza los valores dist de los vértices adyacentes
            for (int v = 0; v < V; v++)
                // Se actualiza la dist[v] solo si no está en verticeYaProcesado,
                // y la distancia es distinta de infinito.
                // También usa el grafo enviado para verificar si
                // hay un arco desde u que es la posición de la última
                // distancia menor a v y el peso total del camino desde src
                // hasta v, y checkea si es mas chicos que el valor actual de dist[v]
                if (!verticeYaProcesado[v] && grafo[u][v] > 0 && dist[u] != Integer.MAX_VALUE
                        && dist[u]+grafo[u][v] < dist[v])
                    dist[v] = dist[u] + grafo[u][v];
        }

        // se imprime el arreglo con las distancias
        imprimirSolucion(dist, V);
    }

    public static void main(String[] args)
    {
        /* Matriz de Adyacencia */
        int[][] grafo =
                {{0, 4, 0, 0, 0, 0, 0, 8, 0},
                        {4, 0, 8, 0, 0, 0, 0, 11, 0},
                        {0, 8, 0, 7, 0, 4, 0, 0, 2},
                        {0, 0, 7, 0, 9, 14, 0, 0, 0},
                        {0, 0, 0, 9, 0, 10, 0, 0, 0},
                        {0, 0, 4, 0, 10, 0, 2, 0, 0},
                        {0, 0, 0, 14, 0, 2, 0, 1, 6},
                        {8, 11, 0, 0, 0, 0, 1, 0, 7},
                        {0, 0, 2, 0, 0, 0, 6, 7, 0}
                };

        dijkstra(grafo, 0);
    }
}