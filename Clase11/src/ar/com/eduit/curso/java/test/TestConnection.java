/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.com.eduit.curso.java.test;

import ar.com.eduit.curso.java.connectors.ConnectorMySQL;
import java.sql.Connection;
import java.sql.Statement;

/**
 *
 * @author EducaciónIT
 */
public class TestConnection {
    public static void main(String[]args) throws Exception{
        Connection conn = ConnectorMySQL.getConnection();
        Statement st=conn.createStatement();
        String query="insert into cursos(titulo,profesor,dia,turno)values"
                +"('java','Martin Mamani','lunes','tarde')";
        st.execute(query);
        
        ConnectorMySQL.getConnection().createStatement().execute(
           "insert into cursos(titulo,profesor,dia,turno)values"
                +"('java2','Martin Mamani','lunes','noche')"
        );
    }
}
