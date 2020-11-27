package net.spring.concurso.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;




@Entity
@Table(name = "tipolibro")
public class TipoLibro implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idTipoLibro")
	private Integer idTipoLibro;
	
	
	private String nombre;
	
	private String estado;

	public Integer getIdTipoLibro() {
		return idTipoLibro;
	}

	public void setIdTipoLibro(Integer idTipoLibro) {
		this.idTipoLibro = idTipoLibro;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	
	

}
