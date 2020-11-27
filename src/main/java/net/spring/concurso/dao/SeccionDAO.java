package net.spring.concurso.dao;

import java.util.List;

import net.spring.concurso.entity.Seccion;

public interface SeccionDAO {
	public  List<Seccion> listaSeccion();
	public Seccion insertaSeccion(Seccion obj);
}
