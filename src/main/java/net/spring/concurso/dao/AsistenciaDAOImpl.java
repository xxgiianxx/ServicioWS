package net.spring.concurso.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import net.spring.concurso.entity.Asistencia;

@Repository

public class AsistenciaDAOImpl implements AsistenciaDAO{

	@Override
	public Asistencia insertaActualizaAsistencia(Asistencia obj) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void eliminaAsistencia(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Asistencia> listarTodos() {
		// TODO Auto-generated method stub
		return null;
	}

	//select x from Asistencia x where x.nombre
	@Override
	public List<Asistencia> listarPorNombre(String filtro) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Asistencia buscaPorId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
