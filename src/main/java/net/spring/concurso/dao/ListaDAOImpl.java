package net.spring.concurso.dao;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import net.spring.concurso.entity.Curso;
import net.spring.concurso.entity.Libro;

@Repository
public class ListaDAOImpl implements LibroDAO {
	@Autowired
	private SessionFactory factory;
	
	@Transactional(readOnly = true)
	@Override
	public List<Libro> listaLibro() {
	    List<Libro> lista=null;
	      Query query=null;
	      Session session=factory.getCurrentSession();
	      try {
			String hql="select c from Libro c";
			query=session.createQuery(hql);
		} catch (Exception e) {
	    e.printStackTrace();
		}
    return query.getResultList();
	}
	
	@Transactional
	@Override
	public Libro insertaActualizaLibro(Libro obj) {
		  Session session=factory.getCurrentSession();
		  Libro objSalida=null;
		  try {
		      objSalida=(Libro) session.save(obj);
		   }catch (Exception e) {
			e.printStackTrace();
		  }
	return objSalida;
	}
	@Transactional
	@Override
	public void eliminaLibro(int id) {
		Session session=factory.getCurrentSession();
		try {
			Libro bean=session.get(Libro.class, id);
		session.delete(bean);
		}catch (Exception e) {
          e.printStackTrace();
        }
	}

	@Override
	public List<Libro> listarPorNombre(String filtro) {
	    Session sesion=factory.getCurrentSession();
	     List<Libro> lista=null;
		 Query query=null;
try {
	String hql="select x from Libro x where x.titulo  LIKE :nombre";
	query=(Query) sesion.createQuery(hql);
	query.setParameter("nombre", "%"+filtro + "%");
} catch (Exception e) {
e.printStackTrace();
}
	return query.getResultList();
}

	@Override
	public Libro buscaPorId(int id) {
		Libro bean=null;
	       Session session=factory.getCurrentSession();
	       try {  
		   bean=session.get(Libro.class,id);
		} catch (Exception e) {
	    e.printStackTrace();	
	    }
	return bean;
	}
	
}
