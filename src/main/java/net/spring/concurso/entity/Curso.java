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
@Table(name = "curso")
public class Curso implements Serializable{
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idCurso")
	private Integer idCurso;
	private String codigo;
	private String nombre;
	private String estado;
	
	
	//@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
	@ManyToOne
	@JoinColumn(name = "idSistemaEvaluacion")
	private SistemaEvaluacion sistemaevaluacion;


	public Integer getIdCurso() {
		return idCurso;
	}


	public void setIdCurso(Integer idCurso) {
		this.idCurso = idCurso;
	}


	public String getCodigo() {
		return codigo;
	}


	public void setCodigo(String codigo) {
		this.codigo = codigo;
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


	public SistemaEvaluacion getSistemaevaluacion() {
		return sistemaevaluacion;
	}


	public void setSistemaevaluacion(SistemaEvaluacion sistemaevaluacion) {
		this.sistemaevaluacion = sistemaevaluacion;
	}

	
	
}
