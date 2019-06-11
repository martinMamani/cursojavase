/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase08;

import java.io.Closeable;

/**
 *
 * @author EducaciónIT
 */
public class GeneradorDeExcepciones implements Closeable {
    public static void generar() {
        
        int[] vector = new int [5];
        vector[10]=20;
        
    }
    public static void generar(boolean x){
        if(x) System.out.println(10/0);
    }
    public static void generar(String numero){  //"22x"
        int nro=Integer.parseInt(numero);
    }
    public static void generar(String texto,int index){//"hola",2
        //if(texto==null|| index>=texto.length()||index<0)return;
        System.out.println(texto.charAt(index));
    }
    
    @Override
    public void close(){
        System.out.println("Se cerro el generador");
    }
}
