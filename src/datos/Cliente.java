package datos;

import java.time.LocalDate;
import java.util.Set;



public class Cliente {
	private long idCliente;
	private String apellido;
	private String nombre;
	private int dni;
	private LocalDate fechaDeNacimiento;
	private boolean baja;
	private Contacto contacto;
	private Set<Prestamo> prestamos;
	
	public Cliente() {
		
	}
	
	public Cliente(String apellido, String nombre, int dni, LocalDate fechaDeNacimiento) {
		super();
		this.apellido = apellido;
		this.nombre = nombre;
		this.dni = dni;
		this.fechaDeNacimiento = fechaDeNacimiento;
	}
	
	public Cliente(String apellido, String nombre, int dni, LocalDate fechaDeNacimiento,
			Contacto contacto) {
		super();
		this.apellido = apellido;
		this.nombre = nombre;
		this.dni = dni;
		this.fechaDeNacimiento = fechaDeNacimiento;
		this.contacto = contacto;
	}
	
	public Set<Prestamo> getPrestamos(){
		return prestamos;
	}
	
	public void setPrestamos(Set<Prestamo> prestamos) {
		this.prestamos = prestamos;
	}
	
	public Contacto getContacto() {
		return contacto;
	}

	public void setContacto(Contacto contacto) {
		this.contacto = contacto;
	}

	public long getIdCliente() {
		return idCliente;
	}

	protected void setIdCliente(long idCliente) {
		this.idCliente = idCliente;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apeliido) {
		this.apellido = apeliido;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public LocalDate getFechaDeNacimiento() {
		return fechaDeNacimiento;
	}

	public void setFechaDeNacimiento(LocalDate fechaDeNacimiento) {
		this.fechaDeNacimiento = fechaDeNacimiento;
	}

	public boolean isBaja() {
		return baja;
	}

	public void setBaja(boolean baja) {
		this.baja = baja;
	}

	@Override
	public String toString() {
		return "Cliente [idCliente=" + idCliente + ", apeliido=" + apellido + ", nombre=" + nombre + ", dni=" + dni
				+ ", fechaDeNacimiento=" + fechaDeNacimiento + ", baja=" + baja + "contacto="+ contacto +"]";
	}
	
	
	
	
	
}
