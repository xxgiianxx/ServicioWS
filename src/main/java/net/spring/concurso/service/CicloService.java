package net.spring.concurso.service;

import java.util.List;

import net.spring.concurso.entity.Ciclo;

public interface CicloService {
	public List<Ciclo> listaCiclo();
	public Ciclo insertaCiclo(Ciclo obj);
}
