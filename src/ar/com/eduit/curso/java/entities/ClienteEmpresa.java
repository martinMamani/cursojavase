/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.com.eduit.curso.java.entities;

import java.util.ArrayList;

/**
 *
 * @author EducaciónIT
 */
public class ClienteEmpresa {
    
    private int nro;
    private String razonSocial;
    private String direccin;
    private ArrayList<Cuenta> cuentas;    
//Cuenta[] cuentas= new Cuenta[10];//cuando definimos un vector tenemos que decir la longitud

    public ClienteEmpresa(int nro, String razonSocial, String direccin) {
        this.nro = nro;
        this.razonSocial = razonSocial;
        this.direccin = direccin;
        this.cuentas= new ArrayList();
        
    }

    @Override
    public String toString() {
        return "ClienteEmpresa{" + "nro=" + nro + ", razonSocial=" + razonSocial + ", direccin=" + direccin + '}';
    }
    
    
    

    public int getNro() {
        return nro;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public String getDireccin() {
        return direccin;
    }

    public ArrayList<Cuenta> getCuentas() {
        return cuentas;
    }
            
    
    
    
    
    
}
