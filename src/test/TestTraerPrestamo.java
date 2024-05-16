package test;

import datos.Prestamo;
import negocio.PrestamoABM;

public class TestTraerPrestamo {
	public static void main(String[] args) {
		PrestamoABM prestamoABM = new PrestamoABM();
		
		long idPrestamo = 1;
		Prestamo p = prestamoABM.traerPrestamo(1L);
		System.out.printf("PRESTAMO id 1:\n %s", p);
		
	}
}
