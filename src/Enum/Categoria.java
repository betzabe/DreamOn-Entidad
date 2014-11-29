package Enum;

public enum Categoria {

	Viaje(1, "viaje"), Comida(2, "comida"),Lugar(3,"Lugar"),Ninguna(0,"Ninguna");
	
	private int id;
	private String nombre;
	
	private Categoria(int id, String nombre) {
		this.id = id;
		this.nombre = nombre;
	}

	public static Categoria valueOf(int id) {
		switch (id) {
		case 0:
			return Ninguna;
		case 1:
			return Viaje;
		case 2:
			return Comida;
		case 3:
			return Lugar;
	default:
			return Viaje;
		}
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
}
