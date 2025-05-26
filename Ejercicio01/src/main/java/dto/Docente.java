package dto;

import java.time.LocalDate;

/**
 * @author Beckan Geronimo
 */
public class Docente {

    private int codigo;
    private String nombre;
    private String direccion;
    private LocalDate fechaNac;
    private double talla;
    private String correo;

    public Docente(int codigo, String nombre, String direccion, LocalDate fechaNac, double talla, String correo) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.direccion = direccion;
        this.fechaNac = fechaNac;
        this.talla = talla;
        this.correo = correo;
    }

    public Docente() {
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public LocalDate getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(LocalDate fechaNac) {
        this.fechaNac = fechaNac;
    }

    public double getTalla() {
        return talla;
    }

    public void setTalla(double talla) {
        this.talla = talla;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    @Override
    public String toString() {
        return codigo + " - "+ nombre + " - " + direccion + " - " + fechaNac + " - " + talla + " - " + correo;
    }
}
