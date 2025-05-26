package dao;

import dto.Docente;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

public class DocenteDAO {

    private List<Docente> lista = new ArrayList<>();
    private int ubicacion = -1;

    public boolean esVacio() {
        return lista.isEmpty();
    }
    
    public void primero() {
        ubicacion = 0;
    }

    public void ultimo() {
        ubicacion = lista.size() - 1;
    }

    public void anterior() {
        if (ubicacion > 0) {
            ubicacion--;
        }
    }

    public void siguiente() {
        if (ubicacion < lista.size() - 1) {
            ubicacion++;
        }
    }

    public Docente getDocente() {
        return lista.get(ubicacion);
    }

    public void agregar(Docente a) {
        lista.add(a);
        ubicacion = lista.size() - 1;
    }

    public void modificar(Docente a) {
        lista.set(ubicacion, a);
    }

    public void eliminar() {
        lista.remove(ubicacion);
        if (ubicacion == lista.size()) {
            ubicacion = lista.size() - 1;
        }
    }

    public String imprimir() {
        String resultado = "";
        for (Docente docente : lista) {
            resultado += docente.toString()+"\n";
        }
        return resultado;
    }
    
    public double calcularPromedioEdad(){
        LocalDate ld = LocalDate.now();
        double promedio = 0;
        int dato = 0;
        for(Docente d: lista){
            Period pd = Period.between(d.getFechaNac(), ld);
            dato += pd.getYears();
        }
        
        promedio = (double)dato/lista.size();
        return promedio;
    }

}
