/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gui;
import dao.ListaEnlazada;
import dto.Alumno;
/**
 *
 * @author Dell
 */
public class Main {
    ListaEnlazada lista = new ListaEnlazada();
        
        ListaEnlazada.agregarAdelante(10,"jabon",10,10,5);
        System.out.println("Lista actual:");
        ListaEnlazada.eliminarFinal();
         
        System.out.println("mostrarlista");
        ListaEnlazada.imprimir();

}
