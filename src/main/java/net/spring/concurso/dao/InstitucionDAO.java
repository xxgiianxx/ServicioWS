package net.spring.concurso.dao;

import java.util.List;

import net.spring.concurso.entity.Institucion;

public interface InstitucionDAO {
	public  List<Institucion> listaInstitucion();
	public Institucion insertaInstitucion(Institucion obj);
}
