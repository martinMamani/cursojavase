/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.com.eduit.curso.java.test;

import ar.com.eduit.curso.java.connectors.ConnectorMySQL;
import ar.com.eduit.curso.java.entidades.Curso;
import ar.com.eduit.curso.java.enumerados.Dia;
import ar.com.eduit.curso.java.enumerados.Turno;
import ar.com.eduit.curso.java.repositories.jdbc.CursoR;

/**
 *
 * @author EducaciónIT
 */
public class TestRepositories {
    
    public static void main(String[]args){
        
        CursoR cr= new CursoR(ConnectorMySQL.getConnection());
        
        
        Curso curso = new Curso("PHP","Martin Mamani",Dia.martes,Turno.tarde);
        
        cr.save(curso);
        
        System.out.println(curso);
    }
    
    
}
