package net.spring.concurso.dao;
import java.util.List;

import net.spring.concurso.entity.Libro;
public interface LibroDAO {

	public  List<Libro> listaLibro();
     public  Libro insertaActualizaLibro(Libro obj);
	public  void eliminaLibro(int id);
	public  List<Libro> listarPorNombre(String filtro);
	public  Libro buscaPorId(int id);
	
}
