package net.spring.concurso.dao;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import net.spring.concurso.entity.Computadora;
import net.spring.concurso.entity.Seccion;

@Repository
public class SeccionDAOImpl implements SeccionDAO {
	@Autowired	
	private SessionFactory factory;
	
	@Transactional(readOnly = true)
	@Override
	public List<Seccion> listaSeccion() {
		List<Seccion> lista=null;
		Query query=null;
		Session session=factory.getCurrentSession();
		try {
			String hql="select c from Seccion c";
			query=session.createQuery(hql);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return query.getResultList();
	}
	
	@Transactional
	@Override
	public Seccion insertaSeccion(Seccion obj) {
		Session session=factory.getCurrentSession();
		Seccion bean=null;
		try {
			bean= (Seccion) session.save(obj);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return bean;
	}

}
