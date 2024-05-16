package negocio;

import java.time.LocalDate;
import java.util.List;

import dao.ClienteDao;
import datos.Cliente;
import datos.Contacto;

public class ClienteABM {

	ClienteDao dao = new ClienteDao();
	
	public Cliente traer(long idCliente) {
		return dao.traer(idCliente);
	}

	public Cliente traer(int dni) {
		return dao.traer(dni);
	}
	
	public Cliente traerClienteYContacto(long idCliente) {
		return dao.traerClienteYContacto(idCliente);
	}
	
	public Cliente traerClienteYPrestamos(long idCliente) {
		return dao.traerClienteYPrestamo(idCliente);
	}
	
	public int agregar(String apellido, String nombre, int dni, LocalDate fechaDeNacimiento) throws Exception{
		
		
		if(traer(dni)!= null) {
			throw new Exception("El cliente que desea ingresar ya se encuentra registrado");
		}
		
		Cliente c = new Cliente(apellido, nombre, dni, fechaDeNacimiento);
		return dao.agregar(c);
	}
	
	public int agregar(String apellido, String nombre, int dni, LocalDate fechaDeNacimiento, Contacto contacto) throws Exception{
		
		
		if(traer(dni)!= null) {
			throw new Exception("El cliente que desea ingresar ya se encuentra registrado");
		}
		
		Cliente c = new Cliente(apellido, nombre, dni, fechaDeNacimiento,contacto);
		return dao.agregar(c);
	}
	public void modificar(Cliente c) throws Exception {
		
		if(traer(c.getDni())!= null && 
		   (c.getIdCliente() != traer(c.getDni()).getIdCliente()) ){
			throw new Exception("El DNI que desea modificar ya se encuentra registrado");
		}
		
		dao.actualizar(c);
	}
	public void eliminar(long idCliente) throws Exception {
		/*
		 * En este caso la baja es física y sabemos que la entidad no tiene relaciones
		 * pero en caso de tenerlas, hay que validar que el cliente no tenga dependencias que
	generen errores al borrarlo.
		 */
		Cliente c = dao.traer(idCliente);
		if(c == null) {
			throw new Exception("El Cliente no se encuentra registrado");
		}
		dao.eliminar(c);
	}
	public List<Cliente> traer() {
		return dao.traer();
	}
}
