package net.spring.concurso.service;

import java.util.List;
import java.util.Optional;

import net.spring.concurso.entity.Curso;


public interface CursoService {
	public void insertaCurso(Curso obj);
    public void insertaActualizaCurso(Curso obj);
	public void eliminaCurso(int id);
	public List<Curso> listarTodos();
	public List<Curso> listarPorNombre(String filtro);
	public Curso buscaPorId(int id);
	
	/*
	public void save(Curso bean);
	public List<Curso> listAll();*/
	
}
