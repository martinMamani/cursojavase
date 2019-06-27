/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.com.eduit.curso.java.utils.file;
//remotemysql base de datos gratuita
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TreeSet;
import java.util.stream.Collectors;

/**
 *
 * @author EducaciónIT
 */
public class FileText implements I_File {
    
    private File file;

    public FileText(File file) {
        this.file = file;
    }
    public FileText(String file){
        this.file = new File(file);
    }
    @Override
    public void print() {
        int car;
        
        try  (FileReader in = new FileReader(file)){
            while((car=in.read())!= -1){
                System.out.print((char)car);
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public String getText() {
        int car;
        //String texto="";
        StringBuilder sb=new StringBuilder();
        try(FileReader in = new FileReader(file)){
            while((car=in.read())!=-1){
                //texto+=(char)car;
                sb.append((char)car);
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return sb.toString();//texto;
    }

    @Override
    public void setText(String text) {
        try(FileWriter out= new FileWriter(file))
        {
            out.write(text);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    @Override
    public void appendText(String text) {
        try(FileWriter out= new FileWriter(file,true))
        {
            out.write(text);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    @Override
    public void addLine(String line) {
       appendText(line+"\n");
    }

    @Override
    public void addLines(Collection<String> lines) {
       //lines.forEach(this::addLine);//java 8
       //for(String st:lines)addLine(st); java 5
       try(BufferedWriter out = new BufferedWriter(new FileWriter(file,true))){
           for(String st:lines){
               out.write(st+"\n");
           }
       }
       catch(Exception e){
           e.printStackTrace();
       }
    }
    @Override
    public void clear(){
        setText("");
    }

    @Override
    public List<String> getLines() {
        //List<String> lista = new ArrayList();
        try(BufferedReader in = new BufferedReader(new FileReader(file))){
          return  in.lines().collect(Collectors.toList());
          
        }
        catch(Exception e){
            //e.printStackTrace();
            return new ArrayList<String>();
        }
        
        //return lista;
    }

    @Override
    public List<String> getLines(String filter) {
        return getLines().stream().filter(p->p.toLowerCase().contains(filter.toLowerCase())).collect(Collectors.toList());
    }

    @Override//devuelve la lista ordenada
    public List<String> getSortedLines() {
        return getLines().stream().sorted().collect(Collectors.toList());
    }

    @Override//filtra y ordena
    public List<String> getSortedLines(String filter) {
        return getLines(filter).stream().sorted().collect(Collectors.toList());
    }

    @Override
    public List<String> getReverseLines() {
        List<String> listaReversa = new ArrayList();
        List<String> lista = new ArrayList();
        
        for(int a= lista.size()-1;a>=0;a--){
            listaReversa.add(lista.get(a));
        }
        return listaReversa;
    }

    @Override
    public List<String> getReverseSorteredLines() {
        return getLines().stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
    }

    @Override
    public LinkedHashSet<String> getLinkedHashSetLines() {
        LinkedHashSet<String> set= new LinkedHashSet();
        set.addAll(getLines());
        return set;
    }

    @Override
    public TreeSet<String> getTreeSetLines() {
        TreeSet<String> set = new TreeSet();
        set.addAll(getLines());
        return set;
    }

    @Override
    public void removeLine(String line) {
         List<String> lista = getLines();
         lista.remove(line);
         clear();
         addLines(lista);
    }
    
    
    
    
    
    
}
