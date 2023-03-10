# Trabajo Práctico - Programación III
*UADE* - _MRI Pinamar_2023

### Grupo

### Autores
* Federico Calciano LU - 1115436
* Juan Cruz Lafranconi LU - 1115435
* Lucas Gioffre LU - 1038885

### Profesor
* Guillermo Rodriguez


***

## 1.	Introducción

A continuación, se presenta el trabajo practico obligatorio correspondiente a la materia Programación III cursada bajo la modalidad de intensiva en el campus de UADE – Costa Argentina. En el informe se detallarán las pautas del trabajo y se hará entrega de los archivos con los recursos correspondientes.

## 2.	Objetivo

El objetivo del trabajo consiste en aplicar algunos de los conceptos teóricos que se vieron durante la cursada e implementarlos en un entorno de desarrollo para asentar la compresión de lo visto en clase. 

### 2.1	Alcance
Se recibe la clase Grafo en Java y se deben implementar al menos 3 de los siguientes algoritmos:
*	Algoritmo Breadth-First Search (BFS)
*	Algoritmo Depth-First Search (DFS)
*	Algoritmo de Prim
*	Algoritmo de Kruskal
*	Algoritmo de Dijsktra
*	Algoritmo de Floyd

## 3.	Desarrollo

**Todos los algoritmos están implementados en clases distintas las cuales son representadas con su nombre. Éstas clases cuentan con un main donde se puede ejecutar el código con un grafo de prueba**

### Dijsktra - O(V^2) 

Lo primero que se realizó fue la elección de los algoritmos a implementar.
El primer algoritmo elegido fue el de Dijsktra. Este nos permite encontrar el costo del camino más corto entre un nodo en particular y todos los demás, siempre y cuando exista un camino. Como resultado se obtiene un grafo con los mismos nodos que el proporcionado para analizar, pero solamente con aristas entre el nodo buscado y todos los demás. Se podrá utilizar únicamente con grafos dirigidos y rotulados con costos positivos.

El algoritmo implementado recibe una matriz de adyacencia llamada grafo y el nodo de origen llamado src. Crea un array ***dist*** donde va aguardar los pesos de las distancias y un array de booleanos ***verticeYaProcesado***, que tiene flags que nos permiten recorrer el grafo. Solo cuando nos paramos sobre el vertice y analizamos sus adyacentes lo pasamos a true.

Primero inicializamos todas las instancias de ***dist*** y ***verticeYaProcesado***, con infinito y false. Para poder empezar a recorrer los arrays con un for. Dentro del mismo se calcula la distancia minima del vertice adyacente. Una vez que recibimos el vertice mas cercano, lo seteamos a true y entramos a un for más en el que actualizamos los valores de ***dist*** de los vértices adyacentes. Para finalizar se imprime ***dist*** con las distancias.


La función desarrollada para recibir una Matriz de Adyacencia de 9x9:


<img src="https://github.com/fecalci/TPO-PrograIII/blob/main/Picture1.png" alt="UADE-Logo" width="500"/>

Matriz graficada:


<img src="https://github.com/fecalci/TPO-PrograIII/blob/main/Picture2.png" alt="UADE-Logo" width="500"/>

Por ultimo el resultante de la implementación:

<img src="https://github.com/fecalci/TPO-PrograIII/blob/main/Picture3.png" alt="UADE-Logo" width="500"/>


### Kruksal - O(E log (V))
El segundo algoritmo empleado fue el de Kruksal. Esta técnica nos permite hallar el Árbol de Recubrimiento de Costo Mínimo para un grafo dado partiendo de una lista ordenada de aristas según su costo.

Grafo de prueba:


<img src="https://github.com/fecalci/TPO-PrograIII/blob/main/Picture4.png" alt="UADE-Logo" width="400"/>


Resultante:
Vertices y Peso:


<img src="https://github.com/fecalci/TPO-PrograIII/blob/main/Picture5.png" alt="UADE-Logo" width="120"/>

### BFS - O(V + E)
Por último, decidimos implementar un algoritmo de BFS (Breadth-First Search) para poner en práctica la técnica de nodos visitados para poder elegir hacia donde dirigir nuestro camino más corto y así obtener el camino más corto desde origen hasta v. Devuelve un print del camino ideal iterando sobre una lista de enteros llamada Recorrido

Grafo de prueba:


<img src="https://github.com/fecalci/TPO-PrograIII/blob/main/Picture6.png" alt="UADE-Logo" width="400"/>

Resultante:

<img src="https://github.com/fecalci/TPO-PrograIII/blob/main/Picture7.jpeg" alt="UADE-Logo" width="300"/>

## 4.	Conclusión

En conclusión, el análisis de grafos mediante algoritmos de Kruksal, BFS y Dijkstra es esencial en aplicaciones de optimización de recursos y minimización de costos.
Los algoritmos Dijkstra, Kruskal y BFS son eficientes y rápidos en la búsqueda de grafos. Dijkstra encuentra la ruta más corta, pero solo funciona en grafos con pesos positivos. Kruskal produce resultados óptimos, pero puede ser lento en grafos grandes. BFS es eficiente en grafos no ponderados, pero no es adecuado para encontrar la ruta más corta.

## 5.	Anexos
