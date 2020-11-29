package net.spring.concurso.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.spring.concurso.dao.InstitucionDAO;
import net.spring.concurso.entity.Institucion;

@Service
public class InstitucionServiceImpl implements InstitucionService {
	
	@Autowired
	private InstitucionDAO instituciondao;

	
	@Override
	public List<Institucion> listaInstitucion() {
		return instituciondao.listaInstitucion();
	}

	@Override
	public void insertaInstitucion(Institucion obj) {
		instituciondao.insertaInstitucion(obj);
	}

	
	
}
