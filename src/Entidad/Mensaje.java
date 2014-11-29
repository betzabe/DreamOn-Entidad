package Entidad;

import java.io.Serializable;
import java.util.Date;

public class Mensaje implements Serializable {
	private int id;
	private String descripcion;
	private Usuario usuarioRemitente;
	private Usuario usuarioDestinatario;
	private Date fecha_envio;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public Usuario getUsuarioRemitente() {
		return usuarioRemitente;
	}
	public void setUsuarioRemitente(Usuario usuarioRemitente) {
		this.usuarioRemitente = usuarioRemitente;
	}
	public Usuario getUsuarioDestinatario() {
		return usuarioDestinatario;
	}
	public void setUsuarioDestinatario(Usuario usuarioDestinatario) {
		this.usuarioDestinatario = usuarioDestinatario;
	}
	public Date getFechaEnvio() {
		return fecha_envio;
	}
	public void setFechaEnvio(Date fecha_envio) {
		this.fecha_envio = fecha_envio;
	}
	
	

}
