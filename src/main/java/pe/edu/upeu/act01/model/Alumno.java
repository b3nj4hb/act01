package pe.edu.upeu.act01.model;

public class Alumno {

	private int idalumno;
	private String nombre;
	private String telefono;
	private String direccion;

	public Alumno() {
		super();
	}

	public Alumno(String nombre, String telefono, String direccion) {

		this.nombre = nombre;
		this.telefono = telefono;
		this.direccion = direccion;
	}

	public int getIdalumno() {
		return idalumno;
	}

	public void setIdalumno(int idalumno) {
		this.idalumno = idalumno;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	
}
