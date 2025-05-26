/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dto;

/**
 *
 * @author Dell
 */
public class Alumno {
      private int codiProd ;
    private String nomProd;
    private double precProd;
    private double cantProd;
   private double costoProd;

    public Alumno(int codiProd, String nomProd, double precProd, double cantProd, double costoProd) {
        this.codiProd = codiProd;
        this.nomProd = nomProd;
        this.precProd = precProd;
        this.cantProd = cantProd;
        this.costoProd = costoProd;
    }

    public int getCodiProd() {
        return codiProd;
    }

    public void setCodiProd(int codiProd) {
        this.codiProd = codiProd;
    }

    public String getNomProd() {
        return nomProd;
    }

    public void setNomProd(String nomProd) {
        this.nomProd = nomProd;
    }

    public double getPrecProd() {
        return precProd;
    }

    public void setPrecProd(double precProd) {
        this.precProd = precProd;
    }

    public double getCantProd() {
        return cantProd;
    }

    public void setCantProd(double cantProd) {
        this.cantProd = cantProd;
    }

    public double getCostoProd() {
        return costoProd;
    }

    public void setCostoProd(double costoProd) {
        this.costoProd = costoProd;
    }
   
   
   
}
