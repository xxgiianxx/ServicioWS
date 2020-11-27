package net.spring.concurso.dao;


import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import net.spring.concurso.entity.Usuario;

@Repository
public class UsuarioDAOImpl implements UsuarioDAO{
	
	@Autowired	
	private SessionFactory factory;
	@Transactional(readOnly=true)
	@Override
	public Usuario login(String Usuarios,String Clave ) {
       Session sesion=factory.getCurrentSession();
       Usuario beanx=null;
	   Query query=null;
		try {
			String hql="Select x from Usuario x where x.login =?1 and x.password =?2";
			query=(Query) sesion.createQuery(hql);
			query.setParameter(1, Usuarios);
			query.setParameter(2, Clave);
			beanx=(Usuario)query.getSingleResult();
		}catch (Exception e) {
         e.printStackTrace();
		}
      return beanx;
	}

}
