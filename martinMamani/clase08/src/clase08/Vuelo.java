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
public class Vuelo {
    private String nombre;
    private int cantidad;

    
    public synchronized void venderPasajes(int cantidad)throws NoHayMasPasajesException{
        
        if(this.cantidad<cantidad)throw new NoHayMasPasajesException(nombre,cantidad);
        this.cantidad-=cantidad;
        
        
    }
    
    
    @Override
    public String toString() {
        return "Vuelo{" + "nombre=" + nombre + ", cantidad=" + cantidad + '}';
    }

    public Vuelo(String nombre, int cantidad) {
        this.nombre = nombre;
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCantidad() {
        return cantidad;
    }
}
