package Entidad;

import java.io.Serializable;

import Enum.Categoria;

public class Idea implements Serializable{
	private int id;
	private String descripcion;
	private ListaIdea listaIdea;
	private Categoria categoria;
	
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
	public Categoria getCategoria() {
		return categoria;
	}
	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	
	

}
