package net.spring.concurso.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.spring.concurso.dao.DocenteDAO;
import net.spring.concurso.entity.Docente;

@Service
public class DocenteServiceImpl implements DocenteService{
	@Autowired
	private DocenteDAO docentedao;

	@Override
	public List<Docente> listaDocente() {
		return docentedao.listaDocente();
	}

	@Override
	public Docente insertaActualizaDocente(Docente obj) {
		// TODO Auto-generated method stub
		return docentedao.insertaActualizaDocente(obj);
	}

	@Override
	public void eliminaDocente(int id) {
		docentedao.eliminaDocente(id);
		
	}

	@Override
	public List<Docente> listarPorNombre(String filtro) {
		return docentedao.listarPorNombre(filtro);
	}

	@Override
	public Docente buscaPorId(int id) {
		return docentedao.buscaPorId(id);
	}
	


}