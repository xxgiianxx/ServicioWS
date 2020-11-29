package net.spring.concurso.service;

import java.util.List;

import net.spring.concurso.entity.Alumno;
import net.spring.concurso.entity.Libro;

public interface AlumnoService {

	public  List<Alumno> listaAlumno();
    public  void insertaActualizaAlumno(Alumno obj);
	public void ActualizaAlumno(Alumno bean);

	public  void eliminaAlumno(int id);
	public  List<Alumno> listarPorNombre(String filtro);
	public  Alumno buscaPorId(int id);
}
