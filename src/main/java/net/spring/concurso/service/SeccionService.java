package net.spring.concurso.service;

import java.util.List;

import net.spring.concurso.entity.Seccion;

public interface SeccionService {
	public  List<Seccion> listaSeccion();
	public Seccion insertaSeccion(Seccion obj);
}
