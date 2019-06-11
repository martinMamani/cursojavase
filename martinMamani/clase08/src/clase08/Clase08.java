/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase08;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author EducaciónIT
 */
public class Clase08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //clase 08 manejo de exceptions
        
        
        //System.out.println(10/0);
        //System.out.println("Esta sentencia no se ejecuta");
        /*
        Estructura try catch finally
        
        try{
        
        colocar las sentencia que pueden lanzar exception,
        estas sentencia tienen mas costo de hardware.
        
        }catch(Exception e){
        
        Estas sentencias se ejecuta si se lanzo una exception en el bloque try.
        Se recibe un objeto de Exception como parametro, con los detalles del error.
        
        }finally{
        
        Este bloque es el unico que no es obligatorio.
        Estas sentencia se ejecutan siempre,exista exception o no.
        Las variables declaran en try o catch no son visibles desde este bloque.
        }
        Estas lineas tambien se ejecutan siempre.
        El programa termina normalmente.
        
        */
        
        /*
        try{
           System.out.println("Inicio del programa");
           System.out.println(10/0);
           System.out.println("esta sentencia no se ejecuta");
            }
        catch(Exception e ){
           System.out.println("ocurrio un error");
           System.out.println(e);
           e.printStackTrace();
        }finally{
           System.out.println("el programa termina normalmente");
            
        }
        System.out.println("fin del programa");
        */
        try{
               
        //GeneradorDeExcepciones.generar();
        //GeneradorDeExcepciones.generar(true);
        //GeneradorDeExcepciones.generar("22x");
        //GeneradorDeExcepciones.generar(null,0);
        //GeneradorDeExcepciones.generar("hola",10);
        //FileReader in = new FileReader(new File("texto.txt"));
        
        }catch(Exception e ){
            System.out.println(e);            
        }
        //Captura personalizada de exceptions
        try{
            //GeneradorDeExcepciones.generar("hola",10);
            //FileReader in = new FileReader(new File("texto.txt"));
        
     }
     catch(IndexOutOfBoundsException e)  { System.out.println("Indice fuera de rango");      }   
     //catch(ArrayIndexOutOfBoundsException e)  { System.out.println("Indice fuera de rango");      }
     catch(ArithmeticException e)             { System.out.println("Division por cero");           }
     catch(NumberFormatException e)           { System.out.println("Formato de numero incorrecto");}
     catch(NullPointerException e )           { System.out.println("Puntero nulo");                }
     //catch(StringIndexOutOfBoundsException e) { System.out.println("Indice fuera de rango");      }
     catch(Exception e)                       { System.out.println("Ocurrio un error no esperado");}
             
     //uso de exception para validar reglas de negocio
     
     Vuelo v1= new Vuelo("aer1234",100);
     Vuelo v2= new Vuelo("lat1234",100);       
     
        try {
            v1.venderPasajes(40);
            v2.venderPasajes(20);
            
            v1.venderPasajes(40);
            v2.venderPasajes(20);
            
            v1.venderPasajes(40);  //lanza exception
            v2.venderPasajes(10);  //esta venta no se realiza
            
        } catch (NoHayMasPasajesException ex) {
            System.out.println(ex);
        }
        
        
        //try with resourse java 7
        
        
        //si se lanza una exception el archivo si estaba abierto se cierra automaticamente
        try(FileReader reader= new FileReader(new File("texto.txt"))){
            //sentencias que leen el archivo
            
            reader.close();
            
        }catch (Exception e){
            System.out.println(e);
        }
        
        System.out.println("+++++++++++++++++++++++++++++++++++++++");
        
        try(GeneradorDeExcepciones generador = new GeneradorDeExcepciones()){
            GeneradorDeExcepciones.generar(false);
            generador.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
        
        
     
     }//fin de main
    
    
    }//fin de clase08
    

