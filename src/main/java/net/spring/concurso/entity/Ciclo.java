package net.spring.concurso.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;




@Entity
@Table(name = "ciclo")
public class Ciclo implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idCiclo")
	private Integer idCiclo;	
	private String nombre;	
	private String estado;
	public Integer getIdCiclo() {
		return idCiclo;
	}
	public void setIdCiclo(Integer idCiclo) {
		this.idCiclo = idCiclo;
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

