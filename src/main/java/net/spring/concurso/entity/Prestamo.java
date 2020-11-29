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
@Table(name = "prestamo")
public class Prestamo implements Serializable {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idPrestamo")
	private Integer idPrestamo;
	
	
	private String nombre;
	
	@Column(name = "fechaPrestamo")
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date fechaPrestamo;
	
	
	@Column(name = "fechaDevolucion")
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date fechaDevolucion;
	
	
	private String estado;
	
	//@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
	@ManyToOne//(fetch = FetchType.LAZY)
	@JoinColumn(name = "idLibro")
	private Libro libro;
	
	
	//@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
	@ManyToOne//(fetch = FetchType.LAZY)
	@JoinColumn(name = "idAlumno")
	private Alumno alumno;


	public Integer getIdPrestamo() {
		return idPrestamo;
	}


	public void setIdPrestamo(Integer idPrestamo) {
		this.idPrestamo = idPrestamo;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public Date getFechaPrestamo() {
		return fechaPrestamo;
	}


	public void setFechaPrestamo(Date fechaPrestamo) {
		this.fechaPrestamo = fechaPrestamo;
	}


	public Date getFechaDevolucion() {
		return fechaDevolucion;
	}


	public void setFechaDevolucion(Date fechaDevolucion) {
		this.fechaDevolucion = fechaDevolucion;
	}


	public String getEstado() {
		return estado;
	}


	public void setEstado(String estado) {
		this.estado = estado;
	}


	public Libro getLibro() {
		return libro;
	}


	public void setLibro(Libro libro) {
		this.libro = libro;
	}


	public Alumno getAlumno() {
		return alumno;
	}


	public void setAlumno(Alumno alumno) {
		this.alumno = alumno;
	}

	
}
