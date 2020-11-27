package net.spring.concurso.dao;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import net.spring.concurso.entity.Aula;

@Repository
public class AulaDAOImpl implements AulaDAO {

	@Autowired
	private SessionFactory factory;

	@Transactional
	@Override
	public void insertaAula(Aula obj) {
		Session session = factory.getCurrentSession();
		try {
			session.save(obj);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
