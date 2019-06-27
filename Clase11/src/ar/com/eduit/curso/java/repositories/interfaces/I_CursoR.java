/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.com.eduit.curso.java.repositories.interfaces;

import ar.com.eduit.curso.java.entidades.Curso;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author EducaciónIT
 */
public interface I_CursoR {
    void save(Curso curso);
    void remove(Curso curso);
    void update(Curso curso);
    List<Curso>getAll();
    default Curso getById(int id){
        List<Curso>lista = getAll().stream().filter(p->p.getId()==id).collect(Collectors.toList());
        
      return (lista==null || lista.isEmpty())?(new Curso()):lista.get(0);
    }
    default List<Curso>getByTitulo(String titulo){
        return getAll()
                .stream()
                .filter(c->c.getTitulo().equalsIgnoreCase(titulo))
                .collect(Collectors.toList());
    }
    default List<Curso>getLikeTitulo(String titulo){
    return getAll().stream().filter(c->c.getTitulo().toLowerCase().contains(titulo.toLowerCase())).collect(Collectors.toList());
    }
    default List<Curso>getLikeTituloProfesor(String titulo,String profesor){
        return getAll().stream().filter(c->c.getTitulo().toLowerCase().contains(titulo.toLowerCase())  &&
                c.getProfesor().toLowerCase().contains(profesor.toLowerCase())).collect(Collectors.toList());
    }
}
