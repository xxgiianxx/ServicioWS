package net.spring.concurso.dao;

import java.util.List;

import net.spring.concurso.entity.Asistencia;

public interface AsistenciaDAO {
	public  Asistencia insertaActualizaAsistencia(Asistencia obj);
	public  void eliminaAsistencia(int id);
	public  List<Asistencia> listarTodos();
	public  List<Asistencia> listarPorNombre(String filtro);
	public  Asistencia buscaPorId(int id);
}
