/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.com.eduit.curso.java.utils.file;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TreeSet;

/**
 *
 * @author EducaciónIT
 */
public interface I_File {
    
    void print();
    String getText();
    void setText(String text);
    void appendText(String text);
    void addLine(String line);//agrag una linea
    void addLines(Collection<String>lines);//agrega una collection
    void clear();
    List<String>getLines();// devuelve lista de lineas
    List<String>getLines(String filter);//devuelve todos con el nombre de filter
    List<String>getSortedLines();//devuelve la lista ordenada
    List<String>getSortedLines(String filter);//devuelve la lista ordenada con filter
    List<String>getReverseLines();
    List<String>getReverseSorteredLines();
    LinkedHashSet<String>getLinkedHashSetLines();
    TreeSet<String>getTreeSetLines();//ordena por orden natural
    void removeLine(String line);//borra una linea
}
