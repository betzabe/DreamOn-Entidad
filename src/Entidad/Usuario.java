package Entidad;

import java.io.Serializable;

public class Usuario implements Serializable {

	private int id;
	private String nombres;
	private String apellidos;
	private String usuario_twitter;
	private String correo;
	private String password;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getUsuarioTwitter() {
		return usuario_twitter;
	}
	public void setUsuarioTwitter(String usuario_twitter) {
		this.usuario_twitter = usuario_twitter;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
