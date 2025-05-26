/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dto;
import dao.ListaEnlazada;
import dto.Alumno;
/**
 *
 * @author Dell
 */
public class Nodo {
  Alumno alumno;
  private Nodo siguiente;
  
  public Nodo(Alumno alumnno) {
       this.alumno=alumno;
        this.siguiente = null;        
    }
}


