# Trabajo Práctico - Programación III
*UADE* - _MRI Pinamar_

### Grupo

### Autores
* Federico Calciano LU - 1115436
* Juan Cruz Lafranconi LU - 1115326
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

### Dijsktra

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


### Kruskal
El segundo algoritmo empleado fue el de Kruskal. Esta técnica nos permite hallar el Árbol de Recubrimiento de Costo Mínimo para un grafo dado partiendo de una lista ordenada de aristas según su costo.

Grafo de prueba:


<img src="https://github.com/fecalci/TPO-PrograIII/blob/main/Picture4.png" alt="UADE-Logo" width="400"/>


Resultante:
Vertices y Peso:


<img src="https://github.com/fecalci/TPO-PrograIII/blob/main/Picture5.png" alt="UADE-Logo" width="120"/>

Por último, a modo de poner en práctica la técnica de Programación Dinámica, se implementó el algoritmo de Floyd. Con este se obtendrán los caminos más cortos entre todos los pares de vértices. Para utilizar esta técnica, no hay exclusión del tipo de grafo, puede utilizarse tanto para dirigidos como para no dirigidos.

## 4.	Conclusión

En el trabajo se destacan algoritmos que sirven para realizar operaciones de distinto tipo sobre grafos. Tanto Dijkstra como Floyd nos sirven para hallar los caminos más cortos pero a su vez tienen su diferencia, uno lo hace desde un vértice a todos y el último mencionado sirve para todos los pares de vértices. Por otra parte, elegimos Kruskal cómo la técnica para hallar el ARMC.

## 5.	Anexos
