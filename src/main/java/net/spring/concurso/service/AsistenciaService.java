package net.spring.concurso.service;

import java.util.List;

import net.spring.concurso.entity.Asistencia;

public interface AsistenciaService {
	
	public  void insertaActualizaAsistencia(Asistencia obj);
	public  void eliminaAsistencia(int id);
	public  List<Asistencia> listarPorNombre(String filtro);
	public  Asistencia buscaPorId(int id);
	public  List<Asistencia> listaAsistencia();
	public void ActualizaAsistencia(Asistencia bean);
	

}
