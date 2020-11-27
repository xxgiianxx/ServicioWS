package net.spring.concurso.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.spring.concurso.dao.SeccionDAO;
import net.spring.concurso.entity.Seccion;

@Service
public class SeccionServiceImpl implements SeccionService {
	
	@Autowired
	private SeccionDAO secciondao;

	@Override
	public List<Seccion> listaSeccion() {
		return secciondao.listaSeccion();
	}

	@Override
	public Seccion insertaSeccion(Seccion obj) {
		return secciondao.insertaSeccion(obj);
	}
	
}
