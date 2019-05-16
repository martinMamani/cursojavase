/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase02;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import javax.swing.JOptionPane;

public class Clase02 {

    public static void main(String[] args) {
        // clase programacion orientada a objetos
        
        /*
        
        que es una clase? es una generalizacion de algo sustantivo
        se declara como sustantivo en singular
        en java las clases son objetos de la clase class.
        
        que es una atributo?
        son variables contenidas dentro de una clase y describen al objeto.
        
        en java los atributos son objetos de la clase field.
        
        que es una metodo?
        son acciones de la clase,se describen como verbos.
        en java los metodos son objetos de la clase method
        */
        
        //declaracion de clase interna
        
        class Auto{
        //atributos    
        
        String marca ;
        String modelo;
        String color;
        int velocidad;        
        
        // metodos constructores
        //los constructores son metodos que inicializan el objeto, tienen
        //el mismo nombre que la clase y pueden ser sobrecargados
        //si la clase no tiene constructor java agrega uno vacio al compilar
        
        
        /**
         * este metodo fue deprecado por martin 16/05/2019
         * por resultar inseguro, usar en su reemplazo
         * Auto(String marca,String modelo,String color)
         * @deprecated
         */
        @Deprecated //Anotation a partir de jdk , avisamos que el metodo es obsoleto
        //constructor vacio
        Auto(){}
        
        
        //constructor parametrico
    
        Auto(String marca, String modelo , String color){
            this.marca=marca;
            this.modelo=modelo;
            this.color=color;
            
        }



        //metodos
        
        void acelerar()   {                  //acelerar
            //velocidad+=10; 
            //if(velocidad>100)velocidad=100 ;
            //regla de negocio para el control de la velocidad
            //llamando a metodo dentro de la misma clase 
           acelerar(10);
        }
        //metodo sobrecargado
        // es cuando hay metodos con el mismo nombre
        //pero debe tener distinta firma de parametros.
        void acelerar(int kilometros){      //acelerarInt
            velocidad+=kilometros;
            if(velocidad>100)velocidad=100 ;
        }
        
        
        void frenar(){
            velocidad-=10;
        }
        
       
        void velocidad(){
            System.out.println(velocidad);
        }
        
        int getVelocidad(){
            return velocidad;
        }
        
        @Override
        public String toString(){
          return marca+" "+modelo+" "+color+" "+velocidad;  
        }
        
        
        
        
        
        
        
        }//finaliza la clase auto
        
        
       System.out.println(Auto.class.getName());
       System.out.println(Auto.class.getSimpleName());
       System.out.println(Auto.class.getSuperclass().getName());
       
       System.out.println(Clase02.class.getName());
       System.out.println(Clase02.class.getSimpleName());
       System.out.println(Clase02.class.getSuperclass().getName());
       
       
       //listado de campos de la clase auto
       
       System.out.println("lista de campos de la clase auto");
       Field[]campos = Auto.class.getDeclaredFields();
       for (int a=0;a<campos.length;a++)
           System.out.println(campos[a].getName());
       
       System.out.println("lista de metodos de la clase auto");
       //listado de metodos de la clase auto
       Method[] metodos = Auto.class.getDeclaredMethods();
       for (int a=0;a<metodos.length;a++)
           System.out.println(metodos[a].getName());
       
       
       /*
       los objetos son instancias de la clase y representan una situacion en particular
       los objetos tiene estado(valor en sus atributos)
       */
       System.out.println("--auto1--");
       
       Auto auto1 = new Auto();
       
       auto1.marca= "ford";
       auto1.modelo="fiesta";
       auto1.color="azul";
       auto1.acelerar();   //10
       auto1.acelerar();   //20
       auto1.acelerar();   //30
       auto1.frenar();    //20
       auto1.acelerar(13); //33
       
       System.out.println(auto1.marca+" "+auto1.modelo+" "+auto1.color+" "+auto1.velocidad);
       //los atributos String de una clase se inicializan automaticamente en null
       //los atributos numericos de una clase se inicializan en cero.
       
       int x;
       //System.out.println(x);//error no se puede usar una variable sin inicializar
       
       System.out.println("--auto2--");
       
       Auto auto2 = new Auto();
       
       auto2.marca= "fiat";
       auto2.modelo="idea";
       auto2.color="rojo";
       
       for (int a=0;a<60;a++)
           auto2.acelerar();
       
       System.out.println(auto2.marca+" "+auto2.modelo+" "+auto2.color+" "+auto2.velocidad);
       
       System.out.println("--auto3--");
       
       Auto auto3 = new Auto("wv", "gol", "blanco");
       auto3.acelerar(42);
       auto3.velocidad();
       
       System.out.println(auto3.getVelocidad());
       //imprime un panel en pantalla y muesta una velocidad.
       JOptionPane.showMessageDialog(null,"velocidad"+auto3.getVelocidad());
       
       //metodo toSring()
       //imprime la clase el tipo de objeto y el codigo hash .
       System.out.println(auto3.toString());
       System.out.println(auto3);
       
       
       
       
       
    }//finaliza el main
    
}//finaliza clase02
