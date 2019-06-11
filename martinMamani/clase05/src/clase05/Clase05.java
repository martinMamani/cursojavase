/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase05;

/**
 *
 * @author EducaciónIT
 */
public class Clase05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        /*
        clase 05 interfaz grafica
        
        
        AWT:(abstract windows type)
        
        - es la primer interfaz grafica, esta integraga en core de jdk y 
        es la mas veloz.
        
        - no garantiza la misma aparencia grafica en los distintos Sos.
        
        Swing:
        - es posterior a awt, incluye a awt en su nucleo.
        - garantiza la misma aparencia en los distintos SOs.
        
        javaJX:
        - respeta completanmente el patron de diseño mvc(modelo vista controlador)
        - muy moderno a partir de jdk.
        - cross platform desarrollar app desktop web y mobile.
        - es una fracaso comercial.
        - discontinuado en el jdk 11. 
        
         */
        
         new PrimerForm().setVisible(true);
        
    }
    
   
    
}
