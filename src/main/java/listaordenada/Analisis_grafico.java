/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package listaordenada;

/**
 *
 * @author victo
 */
public class Analisis_grafico {

    public static void main(String[] args) {

        ListaLigada lista = new ListaLigada();

        System.out.println("Insertando datos ordenadamente:\n");

        lista.insertarOrdenado(3);
        lista.imprimir();

        lista.insertarOrdenado(5);
        lista.imprimir();

        lista.insertarOrdenado(10);
        lista.imprimir();

        lista.insertarOrdenado(25);
        lista.imprimir();

        lista.insertarOrdenado(30);
        lista.imprimir();

        lista.insertarOrdenado(40);
        lista.imprimir();

        lista.insertarOrdenado(50);
        lista.imprimir();

        lista.insertarOrdenado(60);
        lista.imprimir();

        System.out.println("\nTamaño final: " + lista.getTamano());
    }
}
