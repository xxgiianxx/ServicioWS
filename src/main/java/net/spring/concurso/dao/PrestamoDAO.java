package net.spring.concurso.dao;

import java.util.List;

import net.spring.concurso.entity.Prestamo;

public interface PrestamoDAO {

public  Prestamo insertaActualizaPrestamo(Prestamo obj);
	
	public  void eliminaPrestamo(int id);
	
	
	public  List<Prestamo> listarTodos();
	//select x from Prestamo x where x.nombre like :v_param
	public  List<Prestamo> listaPorNombre(String filtro);

	public  Prestamo buscaPorId(int id);
}
