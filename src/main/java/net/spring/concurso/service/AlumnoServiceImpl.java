package net.spring.concurso.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import net.spring.concurso.dao.AlumnoDAO;
import net.spring.concurso.entity.Alumno;
import net.spring.concurso.entity.Libro;

@Service
public class AlumnoServiceImpl implements AlumnoService {

	@Autowired
	private AlumnoDAO alumnodao;

	@Override
	public List<Alumno> listaAlumno() {
		return alumnodao.listaAlumno();
	}

	@Override
	public void insertaActualizaAlumno(Alumno obj) {
		
		alumnodao.insertaActualizaAlumno(obj);
	}
	
	@Override
	public void eliminaAlumno(int id) {
		alumnodao.eliminaAlumno(id);
	}

	@Override
	public List<Alumno> listarPorNombre(String filtro) {
	return alumnodao.listarPorNombre(filtro);
	}
	
	@Override
	public Alumno buscaPorId(int id) {
		return alumnodao.buscaPorId(id);
	}

	
	@Override
	public void ActualizaAlumno(Alumno bean) {
		alumnodao.ActualizaAlumno(bean);
	}


}
