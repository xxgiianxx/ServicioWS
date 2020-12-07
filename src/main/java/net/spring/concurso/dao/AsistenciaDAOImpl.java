package net.spring.concurso.dao;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


import net.spring.concurso.entity.Asistencia;


@Repository

public class AsistenciaDAOImpl implements AsistenciaDAO{

	
	@Autowired	
	private SessionFactory factory;
	
	@Transactional
	@Override
	public void insertaActualizaAsistencia(Asistencia obj) {
		 Session session=factory.getCurrentSession();
	     try {
	        session.save(obj);
	     }catch (Exception e) {
		 e.printStackTrace();
	     }
		
	}

	@Transactional
	@Override
	public void eliminaAsistencia(int id) {
		Session session=factory.getCurrentSession();
		try {
		Asistencia bean=session.get(Asistencia.class, id);
		session.delete(bean);
		}catch (Exception e) {
          e.printStackTrace();
        }
		
	}

	@Override
	public List<Asistencia> listarTodos() {
		List<Asistencia> lista=null;
		Query query=null;
		Session session=factory.getCurrentSession();
		try {
			String hql="select c from Asistencia c";
			query=session.createQuery(hql);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return query.getResultList();
	}

	@Transactional(readOnly=true)
	@Override
	public List<Asistencia> listarPorNombre(String filtro) {
	       Session sesion=factory.getCurrentSession();
	       List<Asistencia> lista=null;
		   Query query=null;
try {
	String hql="select x from Asistencia x where x.nombre like  LIKE :nombre";
	query=(Query) sesion.createQuery(hql);
	query.setParameter("nombre", "%"+filtro + "%");
	
} catch (Exception e) {
e.printStackTrace();
}
		return query.getResultList();
	}
	
	

	@Override
	public Asistencia buscaPorId(int id) {
		Asistencia bean=null;
	       Session session=factory.getCurrentSession();
	       try {  
		   bean=session.get(Asistencia.class,id);
		} catch (Exception e) {
	    e.printStackTrace();	
	    }
			return bean;
	}
	
	
	@Transactional(readOnly = true)
	@Override
	public List<Asistencia> listaAsistencia() {
		List<Asistencia> lista=null;
		Query query=null;
		Session session=factory.getCurrentSession();
		try {
			String hql="select c from Asistencia c";
			query=session.createQuery(hql);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return query.getResultList();
	}

	@Transactional
	@Override
	public void ActualizaAsistencia(Asistencia bean) {
		Session session=factory.getCurrentSession();
		try {
			session.update(bean);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	

}
