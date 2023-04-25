package tddVuelo.dominio;

import static org.junit.Assert.*;

public class Test {
	
//	 queSpuedaBuscaarUnAeropuertoPorCodigo
//    queSpuedaBuscaarUnAeropuertoPorNombre
//    queSepuedaCambiarLaDireccionDeUnAeropuerto
//    
//    
//    QueSepUedaCrearUnaRuta
//    QueepuedaCambiarEltvDeUnaruta
//    
//    
//    queSepuedaBuscartodasLasRutasDeUnAeropuertoOrigen
//    
//    
//    queNoSePuedaCrearUnVueloConLaMismRutayQueSeSuperpongaEnELHorario

	@org.junit.Test
	public void queSpuedaBuscaarUnAeropuertoPorCodigo() {
		Aerolinea aerolinea = new Aerolinea();
		AeroPuerto aeropuerto=new AeroPuerto("aerolineas","lastoninas",1);
		AeroPuerto aeropuerto2=new AeroPuerto("aerolineas2","lastoninas",2);
		AeroPuerto aeropuerto3=new AeroPuerto("aerolineas3","lastoninas",3);
		aerolinea.agregarAeropuerto(aeropuerto);
		aerolinea.agregarAeropuerto(aeropuerto2);
		aerolinea.agregarAeropuerto(aeropuerto3);

		assertTrue(aerolinea.buscarAeropuertoPorCodigo(1));
		
	}
	
	@org.junit.Test
	public void queSePuedaBuscaarUnAeropuertoPorCodigo() {
		Aerolinea aerolinea = new Aerolinea();
		AeroPuerto aeropuerto=new AeroPuerto("aerolineas","lastoninas",1);
		AeroPuerto aeropuerto2=new AeroPuerto("aerolineas2","lastoninas",2);
		AeroPuerto aeropuerto3=new AeroPuerto("aerolineas3","lastoninas",3);
		aerolinea.agregarAeropuerto(aeropuerto);
		aerolinea.agregarAeropuerto(aeropuerto2);
		aerolinea.agregarAeropuerto(aeropuerto3);

		assertTrue(aerolinea.buscarAeropuertoPorNombre("aerolineas"));
	}
	
	@org.junit.Test
	public void queSepuedaCambiarLaDireccionDeUnAeropuerto() {
		String nuevaDireccion="mardeajo";
		AeroPuerto aeropuerto=new AeroPuerto("aero","lastoninas",1);
		aeropuerto.setDireccion(nuevaDireccion);
		assertTrue(aeropuerto.getDireccion().equals(nuevaDireccion));
	}
	
	@org.junit.Test
	public void QueSePuedaCrearUnaRuta() {
		Ruta rutaVuelo = new Ruta("mendoza","misiones");
		assertNotNull(rutaVuelo);
	}
	
	
	
	

}
