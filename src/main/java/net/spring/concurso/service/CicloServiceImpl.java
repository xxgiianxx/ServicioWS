package net.spring.concurso.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.spring.concurso.dao.CicloDAO;
import net.spring.concurso.entity.Ciclo;

@Service
public class CicloServiceImpl implements CicloService {
	
	@Autowired
	private CicloDAO ciclodao;
	
	@Override
	public List<Ciclo> listaCiclo() {
		return ciclodao.listaCiclo();
	}

	@Override
	public Ciclo insertaCiclo(Ciclo obj) {
		return ciclodao.insertaCiclo(obj);
	}
	

}
