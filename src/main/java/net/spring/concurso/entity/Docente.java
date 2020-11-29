package net.spring.concurso.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;




@Entity
@Table(name = "docente")
public class Docente implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idDocente")
	private Integer idDocente;
	private String nombre;
	private String apaterno;
	private String amaterno;
	
	@Column(name = "fechaNacimiento")
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date fechaNacimiento;
	
	
	//@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
	@ManyToOne//(fetch = FetchType.LAZY)
	@JoinColumn(name = "idCurso")
	private Curso curso;
	
	//@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
	@ManyToOne//(fetch = FetchType.LAZY)
	@JoinColumn(name = "idCiclo")
	private Ciclo ciclo;
	
	//@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
	@ManyToOne//(fetch = FetchType.LAZY)
	@JoinColumn(name = "idInstitucion")
	private Institucion institucion;

	public Integer getIdDocente() {
		return idDocente;
	}

	public void setIdDocente(Integer idDocente) {
		this.idDocente = idDocente;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApaterno() {
		return apaterno;
	}

	public void setApaterno(String apaterno) {
		this.apaterno = apaterno;
	}

	public String getAmaterno() {
		return amaterno;
	}

	public void setAmaterno(String amaterno) {
		this.amaterno = amaterno;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}

	public Ciclo getCiclo() {
		return ciclo;
	}

	public void setCiclo(Ciclo ciclo) {
		this.ciclo = ciclo;
	}

	public Institucion getInstitucion() {
		return institucion;
	}

	public void setInstitucion(Institucion institucion) {
		this.institucion = institucion;
	}
	
	
	

}
