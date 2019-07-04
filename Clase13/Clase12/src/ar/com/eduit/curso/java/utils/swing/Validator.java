/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.com.eduit.curso.java.utils.swing;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author EducaciónIT
 */
public class Validator {
    private JTextField txt;

    public Validator(JTextField txt) {
        this.txt = txt;
    }
    
    private boolean error(String msg){
        JOptionPane.showMessageDialog(txt, msg,"Error!", JOptionPane.ERROR_MESSAGE);
        txt.selectAll();
        txt.requestFocus();
        return false;
    }
    public boolean length(int length){
        if(txt.getText().length()==length) return true;
           return error("La longitud de texto debe ser "+length+" caracteres.");     
            
    }
    public boolean length(int min,int max){
        if(txt.getText().length()>=min && txt.getText().length()<=max) return true;
        return error("La longitud de texto tiene que ser entre "+min+" y "+max+" caracteres.");
        
    }
    public boolean isInteger(){
        try {
            Integer.parseInt(txt.getText());
            return true;
        }catch(Exception e){
            return error("Debe ser un numero entero");
        }
    }
    public boolean isInteger(int min,int max){
        if(!isInteger())return false;
        int valor=Integer.parseInt(txt.getText());
        if(valor>=min && valor<=max)return true;
        return error("Debe ser un numero entero entre "+min+" y "+max);
    }
}
