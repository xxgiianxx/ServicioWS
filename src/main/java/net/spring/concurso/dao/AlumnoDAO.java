package net.spring.concurso.dao;

import java.util.List;

import net.spring.concurso.entity.Alumno;
import net.spring.concurso.entity.Libro;

public interface AlumnoDAO {
	public  List<Alumno> listaAlumno();
    public  void insertaActualizaAlumno(Alumno obj);
	public void ActualizaAlumno(Alumno bean);
	public  void eliminaAlumno(int id);
	public  List<Alumno> listarPorNombre(String filtro);
	public  Alumno buscaPorId(int id);
}
