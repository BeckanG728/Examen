/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import dto.Alumno;
import dto.Nodo;

/**
 *
 * @author Dell
 */
public class ListaEnlazada {

    private Nodo cabeza;

    public ListaEnlazada() {
        this.cabeza = null;
    }

    public void agregarAdelante(Alumno alumno) {
        Nodo nuevoNodo = new Nodo(alumno);
        nuevoNodo.siguiente = cabeza.siguiente;
        cabeza.siguiente = nuevoNodo;
    }

    public void eliminarFinal(Alumno alumno) {
        Nodo nuevoNodo = new Nodo(alumno);
        if (cabeza == null) {
            cabeza = nuevoNodo;
        } else {
            Nodo actual = cabeza;

            while (actual.siguiente != null) {
                actual = actual.siguiente;
            }
            actual.siguiente = nuevoNodo;
        }
    }

}

public void imprimir(Alumno alumno) {
        Nodo actual = cabecera.siguiente; 
        while (actual != null) {
            System.out.print(actual.dato + " -> ");
            actual = actual.siguiente;
        }
        System.out.println("null");
    }


    public promediofinal (Alumno alumno){
        double promedio;
        double contador;
        double resultado;
    for (int i=0; alumno.costoProd.lenght; i++){
        resultado+=alumno.costoProd;
        contador++;
        System.out.println("promedio de costos:"+(resultado/contador));
    }
  }
