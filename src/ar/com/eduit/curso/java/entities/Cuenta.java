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
public class Cuenta {
    
     private int nro ;
     private String moneda;
     private float saldo;
     
    public Cuenta(int nro, String moneda) {
        this.nro = nro;
        this.moneda = moneda;
        this.saldo=0;
    }

     public void depositar(float monto){
        
        saldo+=monto;
        
    }
     
      public void debitar(float monto){
        if(monto<=saldo) 
            saldo-=monto;
        else System.out.println("no hay fondos suficientes");
        
    }
    
    
    @Override
    public String toString() {
        return "Cuenta{" + "nro=" + nro + ", moneda=" + moneda + ", saldo=" + saldo + '}';
    }

    public int getNro() {
        return nro;
    }

    public String getMoneda() {
        return moneda;
    }

    public float getSaldo() {
        return saldo;
    }

   
    
    
    
    
    
}
