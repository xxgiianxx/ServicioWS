package net.spring.concurso.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.spring.concurso.dao.AlumnoDAO;
import net.spring.concurso.entity.Alumno;
import net.spring.concurso.entity.Libro;

@Service
public class AlumnoServiceImpl implements AlumnoService {

	@Autowired
	private AlumnoDAO alumnodao;
	@Override
	public List<Libro> listaLibro() {
		return alumnodao.listaLibro();
	}

	@Override
	public Libro insertaActualizaLibro(Libro obj) {
		return alumnodao.insertaActualizaLibro(obj);
	}

	@Override
	public void eliminaLibro(int id) {
	      alumnodao.eliminaLibro(id);
	}

	@Override
	public List<Libro> listarPorNombre(String filtro) {
		return alumnodao.listarPorNombre(filtro);
	}

	@Override
	public Alumno buscaPorId(int id) {
		return alumnodao.buscaPorId(id);
	}
	

}
