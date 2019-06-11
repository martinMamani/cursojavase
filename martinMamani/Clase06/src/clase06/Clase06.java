/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase06;

import java.util.Scanner;

/**
 *
 * @author EducaciónIT
 */
public class Clase06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // clase 06
        
        // clase object
        
        Object obj;
        
        class Dato{
            
            int dato;
            public Dato(int dato){
                this.dato = dato;
            }

            @Override
            public int hashCode() {
                /*
                int hash = 7;
                hash = 29 * hash + this.dato;
                return hash;
                */
                return toString().hashCode();
                
            }

            @Override
           
            public boolean equals(Object obj) {
                 /*
                if (this == obj) {
                    return true;
                }
                if (obj == null) {
                    return false;
                }
                if (getClass() != obj.getClass()) {
                    return false;
                }
                final Dato other = (Dato) obj;
                if (this.dato != other.dato) {
                    return false;
                }
                return true;
             */
            return toString().equals(obj.toString());
            }

            @Override
            public String toString() {
                return "Dato{" + "dato=" + dato + '}';
            }
            
        }//fin de la clase dato
        
            Dato d1 = new Dato(2);
            Dato d2=d1;
            Dato d3= new Dato(2);
            Dato d4 = new Dato(4);
            String d5 = "2";
            
            //metodo hashCode();
            
            
           System.out.println("d1.hashCode(): "+d1.hashCode());
           System.out.println("d2.hashCode(): "+d2.hashCode()); 
           System.out.println("d3.hashCode(): "+d3.hashCode()); 
           System.out.println("d4.hashCode(): "+d4.hashCode());
           System.out.println("d5.hashCode(): "+d5.hashCode());
        
           //metodo equals();
           //este compara ,esta definido en la clase padre object a traves del codigo hashcode
           System.out.println("d1.equals(d1): "+d1.equals(d1));//son iguales
           System.out.println("d1.equals(d2): "+d1.equals(d2));//son dos variables que hacen referencia al mismo estado
           System.out.println("d1.equals(d3): "+d1.equals(d3));//son 2 objetos con mismo estado pero distinto lugar de memoria
           System.out.println("d1.equals(d4): "+d1.equals(d4));//son 2 objetos de distinto estado
           System.out.println("d1.equals(d5): "+d1.equals(d5));//son 2 objetos distintos
        
           //clase String
           
           String texto1= "esto es una cadena de caracteres!";
           String texto2 = new String ("hola");
           char[] vector = {'h','o','l','a'};
           String texto3 = new String (vector);
           
           //.charAt()//muestra una posicion
           System.out.println(texto1.charAt(10));
           //.length()muestras una longitud
           System.out.println(texto1.length());
           //.equals() .equalsIngnoreCase()//ignora la mayusculas
           System.out.println(texto2.equalsIgnoreCase("HOLA"));
           System.out.println(texto2.equalsIgnoreCase("holA"));
           //.toLowerCase() .toUpperCase()//convierte todo en minuscula y mayuscula
           System.out.println(texto1.toLowerCase());
           System.out.println(texto1.toUpperCase());
           //.trim()//quita espacios vacios adelante y atras
           System.out.println("   Hola Hola  ".trim());
           //.contains()//me dice si contiene una cadena de caracteres
           System.out.println(texto1.contains("hola"));
           System.out.println(texto2.contains("una"));
           
           
           // .startsWith() .endsWith()
           System.out.println(texto1.startsWith("hola"));
           System.out.println(texto1.startsWith("esto"));
           System.out.println(texto1.endsWith("chau!"));
           System.out.println(texto1.endsWith("res!"));
           
           //.substring//devuelve una parte de la cadena del indice hasta el final o hasta lo indicado
           System.out.println(texto1.substring(10));
           System.out.println(texto1.substring(10,20));
           
           //.split()//separa palabras segun lo definido espacio o por coma o por letras
           String [] palabras = texto1.split(" ");
           for (int a=0;a<palabras.length;a++)
               System.out.println(palabras[a]);
           
           System.out.println(texto1.substring(texto1.length()-5,texto1.length()));
           
           //StringBuilder StringBuffer
           String texto = "";
           System.out.println(texto+"\t"+texto.hashCode());
           texto+="h";
           System.out.println(texto+"\t"+texto.hashCode());
           texto+="o";
           System.out.println(texto+"\t"+texto.hashCode());
           texto+="l";
           System.out.println(texto+"\t"+texto.hashCode());
           texto+="a";
           System.out.println(texto+"\t"+texto.hashCode());
           
           
           //StringBuffer sb = new StringBuffer();//menos reciente
           StringBuilder sb = new StringBuilder();//mas reciente
           
           System.out.println(sb.toString()+"\t"+sb.hashCode());
           sb.append("h");
           System.out.println(sb.toString()+"\t"+sb.hashCode());
           sb.append("o");
           System.out.println(sb.toString()+"\t"+sb.hashCode());
           sb.append("l");
           System.out.println(sb.toString()+"\t"+sb.hashCode());
           sb.append("a");
           System.out.println(sb.toString()+"\t"+sb.hashCode());
           
           texto = "";
           StringBuffer textosb= new StringBuffer();
           for(int a=1;a<=200000;a++){
               //texto+="x";
               textosb.append("x");
               
           }
           //System.out.println(texto);
           ////////System.out.println(textosb);
           
           //Clase System
           
           //.exit()
           //System.out.printIn(10/0);
           
           
           //System.exit(0);//termina el programa sin errores
           //System.exit(1);//termina el programa con errores
           //System.exit(-1);//termina el programa sin advertencia
           //System.out.println("Esta linea no se ejecuta!");
           
           //Atributo out:brinda un sream a consola sincronizado
           //Atributo err:brinda un sream a consola no sincronizado
           //Atributo in:brinda un sream de entrada de consola sincronizado
           
           System.out.println("hola 1");
           System.out.println("hola 2");
           System.out.println("hola 3");
           System.out.println("hola 4");
           System.out.println("hola 5");
           System.out.println("hola 6");
           System.out.println("hola 7");
           System.out.println("hola 8");
           System.out.println("hola 9");
           System.out.println("hola 10");
           
           System.err.println("ocurrio un error");
           System.out.println("ingrese su nombre");
           //String nombre = new Scanner(System.in).next();
           //System.err.println("hola "+nombre);
           
           //.getProperties()
           
           System.out.println(System.getProperties());
           String [] propiedades = System.getProperties().toString().split(",");
           for(int a=0;a<propiedades.length;a++)
               System.out.println(propiedades[a]);
           
           System.out.println("********************************************");
           //.getProperty()
           
           System.out.println(System.getProperty("os.name"));
           System.out.println(System.getProperty("os.version"));
           System.out.println(System.getProperty("os.arch"));
           System.out.println(System.getProperty("java.version"));
           System.out.println(System.getProperty("user.name"));
           System.out.println(System.getProperty("user.country"));
           System.out.println(System.getProperty("user.language"));
           System.out.println(System.getProperty("user.home"));
           
           //.getEnv() cambia segun la version de jdk
           
           System.out.println(System.getenv());
           String [] env = System.getenv().toString().split(",");
           for(int a=0;a<env.length;a++)System.out.println(env[a]);
           
           System.out.println(System.getenv("NUMBER_OF_PROCESSORS"));
           
           
           
           
           
           
    }//fin de main
    
}// fin de clase 06
