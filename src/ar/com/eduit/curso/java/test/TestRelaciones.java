/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.com.eduit.curso.java.test;

import ar.com.eduit.curso.java.entities.ClienteEmpresa;
import ar.com.eduit.curso.java.entities.ClientePersonal;
import ar.com.eduit.curso.java.entities.Cuenta;
import java.util.ArrayList;

/**
 *
 * @author EducaciónIT
 */
public class TestRelaciones {
    
    public static void main(String [] args){
    
        /*
        objeto Mock (objeto simulado)
        
        modificadores de visibilidad
        
        
        modificadores      alcanse
        default(omitido)   el miembro es accesible desde la misma clase o desde 
                           clases que estan en el mismo paquete
        
        public             el miembro es accesible desde la misma clase
                           y desde clases de cualquier paquete
        
        private            el miembro solo es accesible desde la misma clase
        
        
        protected          el miembro es accesible desde la misma clase 
                           o desde clases que estan en el mismo paquete 
                           y tambien desde clases hijas en cualquier paquete
        

       */
        
     //para probar shift+f6 por que no es el main principal
     
    System.out.println("--cuenta1--");
    
    Cuenta cuenta1 = new Cuenta(1,"arg$");
    cuenta1.depositar(50000);
    cuenta1.depositar(30000);
    cuenta1.debitar(15000);
    System.out.println(cuenta1);
    
    
    System.out.println("--clienteP1--");
    
    ClientePersonal clienteP1 = new ClientePersonal(1,"ana","gallo",3);
    clienteP1.getCuenta().depositar(40000);
    
    Cuenta cuentaCliente1= clienteP1.getCuenta();
    cuentaCliente1.depositar(40000);
    cuentaCliente1.debitar(20000);
    
    System.out.println(clienteP1);
    
    
    System.out.println("--clienteE1--");
    
    ClienteEmpresa clienteE1 = new ClienteEmpresa(1,"todo limpio srl","lima 222");
    ArrayList<Cuenta> cuentas= clienteE1.getCuentas();
    cuentas.add(cuenta1);
    cuentas.add(new Cuenta (11,"reales"));
    cuentas.add(new Cuenta(12,"U$S"));
    cuentas.get(0).depositar(30000);
    cuentas.get(1).depositar(25000);
    cuentas.get(2).depositar(12000);
    
    System.out.println(clienteE1);
    for(int a=0 ; a<cuentas.size() ; a++){
        System.out.println(cuentas.get(a));
    }
        
    
    
    
    
    
    
    
    
    }
    
}
