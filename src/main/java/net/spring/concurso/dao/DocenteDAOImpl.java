package net.spring.concurso.dao;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


import net.spring.concurso.entity.Docente;


@Repository
public class DocenteDAOImpl implements DocenteDAO{
	
	@Autowired	
	private SessionFactory factory;
	
	
	@Transactional(readOnly = true)
	@Override
	public List<Docente> listaDocente() {
		List<Docente> lista=null;
		Query query=null;
		Session session=factory.getCurrentSession();
		try {
			String hql="select c from Docente c";
			query=session.createQuery(hql);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return query.getResultList();
	}

	@Transactional
	@Override
	public void insertaActualizaDocente(Docente obj) {
		 Session session=factory.getCurrentSession();
	     try {
	        session.save(obj);
	     }catch (Exception e) {
		 e.printStackTrace();
	     }
		
	}

	@Transactional
	@Override
	public void ActualizaDocente(Docente bean) {
		Session session=factory.getCurrentSession();
		try {
			session.update(bean);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	@Transactional
	@Override
	public void eliminaDocente(int id) {
		Session session=factory.getCurrentSession();
		try {
		Docente bean=session.get(Docente.class, id);
		session.delete(bean);
		}catch (Exception e) {
          e.printStackTrace();
        }
		
	}

	
	@Transactional(readOnly=true)
	@Override
	public List<Docente> listarPorNombre(String filtro) {
	       Session sesion=factory.getCurrentSession();
	       List<Docente> lista=null;
		   Query query=null;
try {
	String hql="select x from Docente x where x.nombre like  LIKE :nombre";
	query=(Query) sesion.createQuery(hql);
	query.setParameter("nombre", "%"+filtro + "%");
	

} catch (Exception e) {
e.printStackTrace();
}
		return query.getResultList();
	}

	@Override
	public Docente buscaPorId(int id) {
		  Docente bean=null;
	       Session session=factory.getCurrentSession();
	       try {  
		   bean=session.get(Docente.class,id);
		} catch (Exception e) {
	    e.printStackTrace();	
	    }
			return bean;
	}
	
	

}
