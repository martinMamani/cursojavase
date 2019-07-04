package ar.com.eduit.curso.java.repositories.interfaces;
import ar.com.eduit.curso.java.entidades.Alumno;
import ar.com.eduit.curso.java.entidades.Curso;
import java.util.List;
import java.util.stream.Collectors;
public interface I_AlumnoR {
    void save(Alumno alumno);
    void remove(Alumno alumno);
    void update(Alumno alumno);
    List<Alumno>getAll();
    default Alumno getById(int id){
        List<Alumno>lista=getAll()
                .stream()
                .filter(a->a.getId()==id)
                .collect(Collectors.toList());
        return (lista==null || lista.isEmpty())?(new Alumno()):lista.get(0);
    }
    default List<Alumno>getByApellido(String apellido){
        return getAll()
                .stream()
                .filter(a->a.getApellido().equalsIgnoreCase(apellido))
                .collect(Collectors.toList());
    }
    default List<Alumno>getLikeApellido(String apellido){
        return getAll()
                .stream()
                .filter(a->a.getApellido().toLowerCase().contains(apellido.toLowerCase()))
                .collect(Collectors.toList());
    }
    default List<Alumno>getLikeCurso(Curso curso){
        return getAll()
                .stream()
                .filter(a->a.getIdCurso()==curso.getId())
                .collect(Collectors.toList());
    }
}