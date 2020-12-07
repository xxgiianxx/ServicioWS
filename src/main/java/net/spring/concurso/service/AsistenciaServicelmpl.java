package net.spring.concurso.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import net.spring.concurso.dao.AsistenciaDAO;
import net.spring.concurso.entity.Asistencia;

@Service
public class AsistenciaServicelmpl implements AsistenciaService{
	
	
	@Autowired
	private AsistenciaDAO alumnodao;

	@Override
	public void insertaActualizaAsistencia(Asistencia obj) {
		alumnodao.insertaActualizaAsistencia(obj);		
	}

	@Override
	public void eliminaAsistencia(int id) {
		alumnodao.eliminaAsistencia(id);
		
	}

	@Override
	public List<Asistencia> listarPorNombre(String filtro) {
		return alumnodao.listarPorNombre(filtro);
	}

	@Override
	public Asistencia buscaPorId(int id) {
		return alumnodao.buscaPorId(id);
	}

	@Override
	public List<Asistencia> listaAsistencia() {
		return alumnodao.listaAsistencia();
	}

	@Override
	public void ActualizaAsistencia(Asistencia bean) {
		alumnodao.ActualizaAsistencia(bean);
		
	}

	
	
	
	

}
