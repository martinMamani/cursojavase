/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.com.eduit.curso.java.repositories.jdbc;

import ar.com.eduit.curso.java.entidades.Curso;
import ar.com.eduit.curso.java.repositories.interfaces.I_CursoR;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

/**
 *
 * @author EducaciónIT
 */
public class CursoR implements I_CursoR{
    private Connection conn;
    
    public CursoR(Connection conn){
        this.conn=conn;
    }
    @Override public void save(Curso curso) {
        if(curso==null) return;//es un aspecto
        /*
        String query = "insert into cursos values(titulo,profesor,dia,turno)values "
        +"('"curso.getTitulo()+"','"+curso.getProfesor()+"'"+"
        
        */
        try( PreparedStatement ps =conn.prepareStatement(
                "insert into cursos(titulo,profesor,dia,turno)values(?,?,?,?)",
                PreparedStatement.RETURN_GENERATED_KEYS
        )){
            ps.setString(1, curso.getTitulo());
            ps.setString(2,curso.getProfesor());
            ps.setString(3,curso.getDia().toString());
            ps.setString(4,curso.getTurno().toString());
            ps.execute();
            ResultSet rs=ps.getGeneratedKeys();
            if(rs.next()){
                curso.setId(rs.getInt(1));
            }
        }catch (Exception e){
           
           e.printStackTrace();
        }
        
        
        
    }

    @Override
    public void remove(Curso curso) {
        if(curso==null) return;//es un aspecto
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(Curso curso) {
        if(curso==null) return;//es un aspecto
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Curso> getAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
