package net.spring.concurso.dao;

import java.util.List;
import java.util.Optional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import net.spring.concurso.entity.Curso;


import javax.persistence.Query;

@Repository
public class CursoDAOImpl implements CursoDAO {
	@Autowired
	private SessionFactory factory;

	
	
	@Transactional
	@Override
	public void insertaCurso(Curso obj) {
     Session session=factory.getCurrentSession();
     try {
        session.save(obj);
     }catch (Exception e) {
	 e.printStackTrace();
     }

	}
	@Transactional
	@Override
	public void insertaActualizaCurso(Curso obj) {
		 Session session=factory.getCurrentSession();
		   try {
		     session.save(obj);
		  }catch (Exception e) {
	 e.printStackTrace();
		}
	}

	@Transactional
	@Override
	public void eliminaCurso(int id) {
		Session session=factory.getCurrentSession();
		try {
		Curso bean=session.get(Curso.class, id);
		session.delete(bean);
		}catch (Exception e) {
          e.printStackTrace();
        }
	}
	
	@Transactional(readOnly = true)
	@Override
	public List<Curso> listarTodos() {
      List<Curso> lista=null;
      Query query=null;
      Session session=factory.getCurrentSession();
      try {
		String hql="select c from Curso c";
		query=session.createQuery(hql);
	} catch (Exception e) {
    e.printStackTrace();
	}
		return query.getResultList();
	}
	
	@Transactional(readOnly=true)
	@Override
	public List<Curso> listarPorNombre(String filtro) {
	       Session sesion=factory.getCurrentSession();
	       List<Curso> lista=null;
		   Query query=null;
try {
	String hql="select x from Curso x where x.nombre  LIKE :nombre";
	query=(Query) sesion.createQuery(hql);
	query.setParameter("nombre", "%"+filtro + "%");
	//query=sesion.(hql);

} catch (Exception e) {
e.printStackTrace();
}
		return query.getResultList();
}

	
	@Override
	public Curso buscaPorId(int id) {
       Curso bean=null;
       Session session=factory.getCurrentSession();
       try {  
	   bean=session.get(Curso.class,id);
	} catch (Exception e) {
    e.printStackTrace();	
    }
		return bean;
	}
	
	
	@Transactional(readOnly = true)
	@Override
	public List<Curso> listaCurso() {
		List<Curso> lista=null;
		Query query=null;
		Session session=factory.getCurrentSession();
		try {
			String hql="select c from Curso c";
			query=session.createQuery(hql);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return query.getResultList();
	}

	
}
