package net.spring.concurso.dao;

import java.util.List;


import net.spring.concurso.entity.Curso;




public interface CursoDAO {
	public void insertaCurso(Curso obj);
    public  void insertaActualizaCurso(Curso obj);
	public  void eliminaCurso(int id);
	public  List<Curso> listarTodos();
	public  List<Curso> listarPorNombre(String filtro);
	public  Curso buscaPorId(int id);
	public  List<Curso> listaCurso();
}
