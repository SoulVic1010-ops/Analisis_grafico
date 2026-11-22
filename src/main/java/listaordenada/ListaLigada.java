/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listaordenada;

/**
 *
 * @author victo
 */
public class ListaLigada {
    
    private Nodo cabeza;
    private int tamano;

    public ListaLigada() {
        cabeza = null;
        tamano = 0;
    }

    public boolean estaVacia() {
        return cabeza == null;
    }

    public void insertarAlInicio(int dato) {
        Nodo nuevo = new Nodo(dato);

        nuevo.setSiguiente(cabeza);
        cabeza = nuevo;

        tamano++;
    }

     // Inserta un dato manteniendo la lista ordenada.
     // Precondicion: la lista ya debe estar ordenada.
     // Complejidad: O(n)
    
    public void insertarOrdenado(int dato) {

        Nodo nuevo = new Nodo(dato);

        // Caso A: la lista esta vacia
        if (estaVacia()) {
            cabeza = nuevo;
            tamano++;
            return;
        }

        // Caso B: el dato es menor o igual que la cabeza
        if (dato <= cabeza.getDato()) {
            insertarAlInicio(dato);
            return;
        }

        Nodo actual = cabeza;

        // Se revisa el siguiente nodo para encontrar la posicion
        // correcta sin perder la referencia al nodo actual.
        while (actual.getSiguiente() != null &&
               actual.getSiguiente().getDato() < dato) {

            actual = actual.getSiguiente();
        }

        // Caso C: el dato es mayor que todos
        if (actual.getSiguiente() == null) {
            actual.setSiguiente(nuevo);
            tamano++;
            return;
        }

        // Caso D: el dato se inserta entre dos nodos
        nuevo.setSiguiente(actual.getSiguiente());
        actual.setSiguiente(nuevo);

        tamano++;
    }

    public void imprimir() {
        Nodo actual = cabeza;

        while (actual != null) {
            System.out.print(actual.getDato() + " -> ");
            actual = actual.getSiguiente();
        }

        System.out.println("null");
    }

    public int getTamano() {
        return tamano;
    }
}