package net.spring.concurso.entity;


import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;




@Entity
@Table(name = "libro")
public class Libro implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idLibro")
	private Integer idLibro;
	
	
	private String codigo;
	
	private String titulo;
	
	
	private String estado;
	
	
	
	@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idTipoLibro")
	private TipoLibro tipolibro;



	public Integer getIdLibro() {
		return idLibro;
	}



	public void setIdLibro(Integer idLibro) {
		this.idLibro = idLibro;
	}



	public String getCodigo() {
		return codigo;
	}



	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}



	public String getTitulo() {
		return titulo;
	}



	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}



	public String getEstado() {
		return estado;
	}



	public void setEstado(String estado) {
		this.estado = estado;
	}



	public TipoLibro getTipolibro() {
		return tipolibro;
	}



	public void setTipolibro(TipoLibro tipolibro) {
		this.tipolibro = tipolibro;
	}

	
}
