package negocio;

import java.time.LocalDate;
import java.util.List;

import dao.PrestamoDao;
import datos.Cliente;
import datos.Prestamo;

public class PrestamoABM {
	private PrestamoDao dao = new PrestamoDao();
	
	public Prestamo traerPrestamo(Long idPrestamo) {
		return dao.traer(idPrestamo);
	}
	
	public List<Prestamo> traerPrestamo(Cliente c){
		return dao.traer(c);
	}
	
	public int agregar(LocalDate fecha, double monto, double interes, int cantCuotas, Cliente c) {
		Prestamo p = new Prestamo(fecha,monto,interes,cantCuotas,c);
		return dao.agregar(p);
	}
	
	public void modificar(Prestamo c) {
		dao.actualizar(c);
	}
	
}
