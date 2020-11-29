package net.spring.concurso.service;

import java.util.List;

import net.spring.concurso.entity.Institucion;

public interface InstitucionService {
	public  List<Institucion> listaInstitucion();
	public void insertaInstitucion(Institucion obj);
}
