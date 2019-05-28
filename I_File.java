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
public interface I_File {
    
    /*
    - todos los miembros de una interfaz son publicos.
    - una interfaz no puede tener atributos ni constructores.
    - solo tiene metodos abstratos y atributos final (constante).
    - los metodos no tienen codigo ,  es la clase que implementa la 
    interfaz quien define el codigo.
    - una clase puede implementar muchas interfaces y una interfaz
    puede ser usada por muchas clases.
   
    */
    
    /**
     * Escribe el texto en el archivo, la javaDoc es heredada a las implementaciones
     * 
     * 
     * 
     * @param texto texto a escribir
     */
    
    void setText(String texto);
    String getText();
    
    //metodos default,  jdk 8 o sup
    //son metodos que tiene codigo y es heredado a las implementaciones
    default void info(){
        System.out.println("interfaz archivo");
        
    }
    
    
    
}
