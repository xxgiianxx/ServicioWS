package net.spring.concurso.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.spring.concurso.dao.CursoDAO;
import net.spring.concurso.entity.Curso;

@Service
public class CursoServiceImpl implements CursoService{
	@Autowired
	private CursoDAO cursodao;
	
	
	@Override
	public void insertaCurso(Curso obj) {
		 cursodao.insertaCurso(obj);
	}

	@Override
	public void insertaActualizaCurso(Curso obj) {
		 cursodao.insertaCurso(obj);
	}

	@Override
	public void eliminaCurso(int id) {
		cursodao.eliminaCurso(id);
	}

	@Override
	public List<Curso> listarTodos() {
		return cursodao.listarTodos();
	}

	@Override
	public List<Curso> listarPorNombre(String filtro) {
		return cursodao.listarPorNombre(filtro);
	}

	@Override
	public Curso buscaPorId(int id) {
		return cursodao.buscaPorId(id);
	}

	@Override
	public List<Curso> listaCurso() {
		return cursodao.listaCurso();
	}

	

}
