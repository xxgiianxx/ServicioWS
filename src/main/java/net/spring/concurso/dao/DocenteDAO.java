package net.spring.concurso.dao;

import java.util.List;


import net.spring.concurso.entity.Docente;

public interface DocenteDAO {
	
		public  List<Docente> listaDocente();
		public  void insertaActualizaDocente(Docente obj);
		public void ActualizaDocente(Docente bean);
		public  void eliminaDocente(int id);
		public  List<Docente> listarPorNombre(String filtro);
		public  Docente buscaPorId(int id);
	
}
