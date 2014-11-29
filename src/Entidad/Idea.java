package Entidad;

import java.io.Serializable;


public class Idea implements Serializable{
	private int id;
	private String descripcion;
	private ListaIdea listaIdea;
	private Categoria categoria;
	private int estatus;
	
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
	public ListaIdea getListaIdea() {
		return listaIdea;
	}
	public void setListaIdea(ListaIdea listaIdea) {
		this.listaIdea = listaIdea;
	}
	public int getEstatus() {
		return estatus;
	}
	public void setEstatus(int estatus) {
		this.estatus = estatus;
	}
	public Categoria getCategoria() {
		return categoria;
	}
	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	
	

}
