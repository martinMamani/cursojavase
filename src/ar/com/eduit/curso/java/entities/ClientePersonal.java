/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.com.eduit.curso.java.entities;

/**
 *
 * @author EducaciónIT
 */
public class ClientePersonal {
    
    private int nro;
    private String nombre;

    @Override
    public String toString() {
        return "ClientePersonal{" + "nro=" + nro + ", nombre=" + nombre + ", apellido=" + apellido + ", Cuenta=" + Cuenta + '}';
    }
    private String apellido;
    private Cuenta Cuenta;
    
    public ClientePersonal(int nro, String nombre, String apellido,int nroCuenta) {
        this.nro = nro;
        this.nombre = nombre;
        this.apellido = apellido;
        this.Cuenta = new Cuenta(nroCuenta,"arg$");
    }
    
//para que el ide cree un constructor de cliente persona presionamos la tecla 
//alt+Insert

    public int getNro() {
        return nro;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public Cuenta getCuenta() {
        return Cuenta;
    }
    
    
    
    
    
}


