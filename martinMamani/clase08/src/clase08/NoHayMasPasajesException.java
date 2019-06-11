/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase08;

/**
 *
 * @author EducaciónIT
 */
public class NoHayMasPasajesException extends Exception {
    private String nombre;
    private int cantidad;

    public NoHayMasPasajesException(String nombre, int cantidad) {
        this.nombre = nombre;
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "El vuelo" + nombre + ", no tiene " + cantidad + " pasajes";
    }

    public String getNombre() {
        return nombre;
    }

    public int getCantidad() {
        return cantidad;
    }
    
}
