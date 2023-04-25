package tddVuelo.dominio;

public class AeroPuerto {
	String nombre;
	String direccion;
	Integer codigo;
	
	public AeroPuerto() {
		
	}
	
	public AeroPuerto(String nombre) {
		this.nombre=nombre;
	}
	public AeroPuerto(String nombre,String direccion,Integer codigo) {
		this.nombre=nombre;
		this.direccion=direccion;
		this.codigo=codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
	
	

}
