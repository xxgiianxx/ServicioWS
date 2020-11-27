package net.spring.concurso.service;

import java.util.List;

import net.spring.concurso.entity.Curso;
import net.spring.concurso.entity.Docente;

public interface DocenteService {
	public  List<Docente> listaDocente();
	public  Docente insertaActualizaDocente(Docente obj);
	public  void eliminaDocente(int id);
	public  List<Docente> listarPorNombre(String filtro);
	public  Docente buscaPorId(int id);
}
