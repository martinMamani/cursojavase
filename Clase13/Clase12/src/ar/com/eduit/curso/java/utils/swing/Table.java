/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.com.eduit.curso.java.utils.swing;

import java.lang.reflect.Field;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author EducaciónIT
 */
public class Table <E>{
    
    public void cargar(JTable tbl,List<E> lista){
        if(tbl==null)return;
        DefaultTableModel dtm = new DefaultTableModel();
        if(lista==null || lista.isEmpty())return;
        E e=lista.get(0);//obtengo el primer elemnto de la lista
        //cuales son los campos del elemento
        Field[] campos=e.getClass().getDeclaredFields();
        
        for(Field c:campos)dtm.addColumn(c.getName());//obtengo las columnas
        
        for(E x:lista){//recorro columna
            Object[]fila = new Object[campos.length];
            for(int c=0;c<campos.length;c++){//recorro fila
             
               String method="get"+campos[c].getName().substring(0,1).toUpperCase()+
                       campos[c].getName().substring(1);
               //System.out.println(method);
               try{
               fila[c]= e.getClass().getMethod(method,null).invoke(x,null);
               
               
               }catch(Exception ex){
                   ex.printStackTrace();
               
           }
        }
        dtm.addRow(fila);
        }
        tbl.setModel(dtm);//limpia la tabla
        
    }
    
    

    }

