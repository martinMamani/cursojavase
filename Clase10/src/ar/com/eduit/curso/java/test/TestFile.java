/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.com.eduit.curso.java.test;

import ar.com.eduit.curso.java.utils.file.FileText;
import ar.com.eduit.curso.java.utils.file.I_File;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author EducaciónIT
 */
public class TestFile {
    
    
    public static void main(String[] args){
        String file="texto.txt";
        I_File fileText= new FileText(file);
        
        fileText.setText("Curso de Java.\n");
        fileText.appendText("Primavera.\n");
        fileText.appendText("Verano.\n");
        fileText.appendText("Otoño.\n");
        fileText.appendText("Invierno.\n");
        
        fileText.addLine("Lunes");
        fileText.addLine("Lunes");
        fileText.addLine("Martes");
        fileText.addLine("Miercoles");
        fileText.addLine("Jueves");
        fileText.addLine("Jueves");
        fileText.addLine("Viernes");
        
        List<String> lista = new ArrayList();
        lista.add("Rojo");
        lista.add("Rojo");
        lista.add("Verde");
        lista.add("Azul");
        
        fileText.addLines(lista);
        //fileText.clear();
        fileText.removeLine("Verde");
        
        //fileText.print();
        //System.out.println(fileText.getText());
        
        fileText.getLines().forEach(System.out::println);
        //fileText.getLines("l").forEach(System.out::println);
        //fileText.getSortedLines("l").forEach(System.out::println);
        //fileText.getReverseLines().forEach(System.out::println);
        //fileText.getSortedLines().forEach(System.out::println);
        //fileText.getReverseSorteredLines().forEach(System.out::println);
        //fileText.getLinkedHashSetLines().forEach(System.out::println);
        //fileText.getTreeSetLines().forEach(System.out::println);
        
        
    }
    
}
