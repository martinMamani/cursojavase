package ar.com.eduit.curso.java.test;
import ar.com.eduit.curso.java.connectors.ConnectorMySQL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Savepoint;
import java.sql.Statement;
public class TestConnection {
    public static void main(String[] args) throws Exception{
        Connection conn=ConnectorMySQL.getConnection();
        Statement st=conn.createStatement();
        String query="insert into cursos(titulo,profesor,dia,turno) values "
                + "('java','Carlos Ríos','lunes','tarde')";
        st.execute(query);
        
        ConnectorMySQL.getConnection().createStatement().execute(
                "insert into cursos(titulo,profesor,dia,turno) values "
                        + "('java2','Carlos Ríos','martes','noche')"
        );
//        ConnectorMySQL.getConnection().createStatement().execute(
//                "delete from cursos"
//        );
        
    }
}