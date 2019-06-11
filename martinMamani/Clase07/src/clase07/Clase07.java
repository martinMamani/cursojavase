/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase07;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.Stack;
import java.util.TreeSet;
import java.util.Vector;

/**
 *
 * @author EducaciónIT
 */
public class Clase07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Clase 07 collections
        
        Auto[] autos = new Auto[4];
        autos[0]= new Auto("fiat","idea","verde");
        autos[1]= new Auto("wv","up","blanco");
        autos[2]= new Auto("ford","ka","gris");
        autos[3]= new Auto("renaul","kango","bordo");

        //for(int a =0;a<autos.length;a++)
        //System.out.println(autos[a]);
        
        
        //recorrido foreach
        for(Auto a:autos){
            System.out.println(a);
        
        }
        //framework collection
        //interfaz list
        
        List lista;
        lista = new ArrayList();
        //lista = new LinkedList();
        //lista = new Vector();
        
        lista.add(new Auto("Fiat","uno","negro"));
        lista.add(new Auto("wv","gol","rojo"));
        lista.add("hola");
        lista.add(23);
        
        //copiamos los autos del vector auto a lista
        for(Auto a: autos)
            lista.add(a);
        
        //lista.remove(3);            borra indice 3
        //lista.remove((Object)23);   borra el numero 23
        //lista.remove(23);             lanza error fuera de rango
        lista.remove("chau");         //no borra nada
        
        //recorrido por indices
        
        System.out.println("+++++++++++++++++++++++++++++++++++++++++");
        //for(int a=0;a<lista.size();a++) System.out.println(lista.get(a));
        
        //recorrido foreach
        
        //for(Object o:lista)System.out.println(o);
        
        //metodo default .foreach() jdk 8
        
        /////lista.forEach(item->System.out.println(item));
        /////lista.forEach(item->{
        /////System.out.println(item);
        
        //});
        
       //lista.forEach(System.out::println);
        
       //uso de generic a partir de jdk5
    
       List <Auto> lista2 = new LinkedList();
       lista2.add(new Auto("peugeot","408","negro"));
       lista2.add(new Auto("chevrolet","corsa","rojo")) ;
       
       Auto auto1=(Auto)lista.get(0);
       Auto auto2= lista2.get(0);
       
       //copiamos los autos de lista a lista2
       
       lista.forEach(item->{
           
           if(item instanceof Auto)
             lista2.add((Auto)item);
           
       }
       );
       System.out.println("***************************");
       lista2.forEach(System.out::println);
       
       //api Stream jdk 8
       // es un objeto filtrable
       //listar los coches de color rojo
       System.out.println("***************************");
       lista2.stream().filter(a->a.getColor().equalsIgnoreCase("rojo")).forEach(System.out::println);
       
       
       
       
       
       
       //interfaz set
       
       Set<String> set;
       
       //implementacion hashSet:es la mas veloz,no garantiza el orden de los elementos.
       //set = new HashSet();
       
       //implementacion linkedhashset:almacena elementos de una lista enlazada por orden de ingreso
       
       //set=new LinkedHashSet();
       
       //implementacion TreeSet: almacena elementos en un arbol por orden natural.
       
       set = new TreeSet();
       
       set.add("lunes");
       set.add("martes");
       set.add("lunes");
       set.add("martes");
       set.add("miercoles");
       set.add("jueves");
       set.add("viernes");
       set.add("sabado");
       set.add("domingo");
       
       System.out.println("*********************************************");
       set.forEach(System.out::println);
       
       
       //set<auto>
       
       //Set<Auto> setAutos = new LinkedHashSet();
       Set<Auto> setAutos= new TreeSet();
       setAutos.addAll(lista2);
       setAutos.add(new Auto("ford","ka","gris"));
       System.out.println("*********************************************");
       setAutos.forEach(System.out::println);
       
       System.out.println("*********************************************");
       //lista2.forEach(System.out::println);
       //lista2.stream().sorted().forEach(System.out::println);
       //lista2.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
       lista2.stream().sorted(Comparator.comparing(a->a.getColor())).forEach(System.out::println);
        System.out.println("*********************************************");
       //pilas y colas
       //clase stack representa una pila
       //clase arrayDeque representa una cola
       
       Stack <Auto>pilaAuto = new Stack();
       pilaAuto.push(auto1);
       pilaAuto.push(auto2);
       //.push apilar un elemento
       //.pop desapila un elemento
       System.out.println(pilaAuto.pop());
       
       ArrayDeque<Auto>colaAutos= new ArrayDeque();
       colaAutos.offer(auto1);
       colaAutos.offer(auto2);
       //.offer() encola un elemento
       //.poll() desencola un elemento
       System.out.println(colaAutos.poll());
       
       
       
       
       
       
       
       
       
       
       
       
       
        
    }//fin de main
    
}//fin de clase 07
