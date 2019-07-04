package ar.com.eduit.curso.java.test;
import ar.com.eduit.curso.java.connectors.ConnectorMySQL;
import ar.com.eduit.curso.java.entidades.Alumno;
import ar.com.eduit.curso.java.entidades.Curso;
import ar.com.eduit.curso.java.enumerados.Dia;
import ar.com.eduit.curso.java.enumerados.Turno;
import ar.com.eduit.curso.java.repositories.jdbc.AlumnoR;
import ar.com.eduit.curso.java.repositories.jdbc.CursoR;
public class TestRepositories {
    public static void main(String[] args) {
        CursoR cr=new CursoR(ConnectorMySQL.getConnection());
        
        Curso curso=new Curso("PHP", "Carlos Rios", Dia.martes, Turno.tarde);
        
        cr.save(curso);
        
        System.out.println(curso);
        
        cr.remove(cr.getById(30));
        
        Curso cursoX=cr.getById(104);
        if(cursoX!=null){
            cursoX.setTitulo("java");
            cr.update(cursoX);
        }
        
        System.out.println("*************************************************");
        cr.getAll().forEach(System.out::println);
        //cr.getLikeTituloProfesor("", "car").forEach(System.out::println);
        
        AlumnoR ar=new AlumnoR(ConnectorMySQL.getConnection());
        
        Alumno alumno=new Alumno("Carlos","Rios",46,100);
        ar.save(alumno);
        System.out.println(alumno);
        
        ar.remove(ar.getById(1));
        
        Alumno alumnoX=ar.getById(22);
        if(alumnoX!=null){
            alumnoX.setNombre("Javier");
            ar.update(alumnoX);
        }
        
        System.out.println("*************************************************");
        ar.getAll().forEach(System.out::println);
        //ar.getLikeApellido("ri").forEach(System.out::println);
        
    }
}