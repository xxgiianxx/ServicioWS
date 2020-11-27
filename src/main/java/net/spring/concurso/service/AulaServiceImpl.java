package net.spring.concurso.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.spring.concurso.dao.AulaDAO;
import net.spring.concurso.entity.Aula;

@Service
public class AulaServiceImpl implements AulaService{
	@Autowired
	private AulaDAO auladao;

	@Override
	public void insertaAula(Aula obj) {
		auladao.insertaAula(obj);		
	}

}
