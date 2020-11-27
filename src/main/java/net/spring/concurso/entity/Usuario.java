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
import javax.persistence.Transient;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;







@Entity
@Table(name = "usuario")
public class Usuario implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idUsuario")
	private int idUsuario;

	@Column(name = "nombre")
	private String nombre;

	@Column(name = "apaterno")
	private String apaterno;
	
	@Column(name = "amaterno")
	private String amaterno;

	@Column(name = "fechaNacimiento")
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date fechaNacimiento;

	@Column(name = "fechaRegistro")
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date fechaRegistro;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "celular")
	private String celular;
	
	@Column(name = "direccion")
	private String direccion;
	
	@Column(name = "login")
	private String login;
	
	@Column(name = "password")
	private String password;
	
	@Column(name = "dni")
	private String dni;



	@Transient 
	private String nombreCompleto;
	
	
	//@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
	@ManyToOne
	@JoinColumn(name = "idUbigeo")
	private Ubigeo ubigeo;
	
	//@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
	@ManyToOne
	@JoinColumn(name = "idTipoUsuario")
	private TipoUsuario tipoUsuario;
	
	
	
	public String getNombreCompleto() {
		return nombre.concat(" ").concat(apaterno).concat(" ").concat(amaterno);
	}
	public void setNombreCompleto(String nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
	}
	public int getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
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
	public Date getFechaRegistro() {
		return fechaRegistro;
	}
	public void setFechaRegistro(Date fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCelular() {
		return celular;
	}
	public void setCelular(String celular) {
		this.celular = celular;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public Ubigeo getUbigeo() {
		return ubigeo;
	}
	public void setUbigeo(Ubigeo ubigeo) {
		this.ubigeo = ubigeo;
	}
	public TipoUsuario getTipoUsuario() {
		return tipoUsuario;
	}
	public void setTipoUsuario(TipoUsuario tipoUsuario) {
		this.tipoUsuario = tipoUsuario;
	}
	

	

	

	
}
