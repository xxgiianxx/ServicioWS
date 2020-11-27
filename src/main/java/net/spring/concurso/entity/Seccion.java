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
@Table(name = "seccion")
public class Seccion implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idSeccion")
	private Integer idSeccion;
	private String nombre;
	
	
	
	@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idCurso")
	private Curso curso;
	
	
	
	@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idDocente")
	private Docente docente;
	
	
	@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idCiclo")
	private Ciclo ciclo;


	public Integer getIdSeccion() {
		return idSeccion;
	}


	public void setIdSeccion(Integer idSeccion) {
		this.idSeccion = idSeccion;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public Curso getCurso() {
		return curso;
	}


	public void setCurso(Curso curso) {
		this.curso = curso;
	}


	public Docente getDocente() {
		return docente;
	}


	public void setDocente(Docente docente) {
		this.docente = docente;
	}


	public Ciclo getCiclo() {
		return ciclo;
	}


	public void setCiclo(Ciclo ciclo) {
		this.ciclo = ciclo;
	}
	
	

}



