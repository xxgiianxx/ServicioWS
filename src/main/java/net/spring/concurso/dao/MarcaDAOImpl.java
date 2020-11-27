package net.spring.concurso.dao;
import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import net.spring.concurso.entity.Marca;

@Repository
public class MarcaDAOImpl implements MarcaDAO{
	
	@Autowired	
	private SessionFactory factory;
	
	
	@Transactional(readOnly = true)
	@Override
	public List<Marca> listAll() {
		Session session=factory.getCurrentSession();
		Query query=null;
		try {
			String hql="select m from Marca m";
			query=session.createQuery(hql);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return query.getResultList();
	}
	


}
