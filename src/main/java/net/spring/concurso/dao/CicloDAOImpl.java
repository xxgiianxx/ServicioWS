package net.spring.concurso.dao;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import net.spring.concurso.entity.Ciclo;
import net.spring.concurso.entity.Curso;

@Repository
public class CicloDAOImpl implements CicloDAO {
	
	@Autowired
	private SessionFactory factory;
	
	@Transactional(readOnly = true)
	@Override
	public List<Ciclo> listaCiclo() {
	      List<Ciclo> lista=null;
	      Query query=null;
	      Session session=factory.getCurrentSession();
	      try {
			String hql="select c from Ciclo c";
			query=session.createQuery(hql);
		} catch (Exception e) {
	    e.printStackTrace();
		}
			return query.getResultList();
	}
	
	@Transactional
	@Override
	public Ciclo insertaCiclo(Ciclo obj) {
	   Session session=factory.getCurrentSession();
	   Ciclo objSalida=null;
	   try {
	       objSalida=(Ciclo) session.save(obj);
	   }catch (Exception e) {
		 e.printStackTrace();
	   }
	  return objSalida;
	}

}
