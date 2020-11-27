package net.spring.concurso.service;

import java.util.List;

import net.spring.concurso.entity.Alumno;
import net.spring.concurso.entity.Libro;

public interface AlumnoService {

	public  List<Libro> listaLibro();
    public  Libro insertaActualizaLibro(Libro obj);
	public  void eliminaLibro(int id);
	public  List<Libro> listarPorNombre(String filtro);
	public  Alumno buscaPorId(int id);
}
