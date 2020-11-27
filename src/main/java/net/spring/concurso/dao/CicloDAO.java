package net.spring.concurso.dao;

import java.util.List;

import net.spring.concurso.entity.Ciclo;

public interface CicloDAO {
	public List<Ciclo> listaCiclo();
	public Ciclo insertaCiclo(Ciclo obj);
}
