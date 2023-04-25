package tddVuelo.dominio;

import java.util.ArrayList;

public class Aerolinea {
	ArrayList<AeroPuerto> aeropuertos;
	
	
	public Aerolinea() {
		aeropuertos=new ArrayList();
	}


	public void agregarAeropuerto(AeroPuerto aeropuerto) {
		aeropuertos.add(aeropuerto);
		}
	
	public boolean buscarAeropuertoPorCodigo(Integer codigo) {
		for(AeroPuerto aeropuertito : aeropuertos) {
			if(aeropuertito.getCodigo()==codigo) {
				return true;
			}
		}
		return false;
	}
	
	public boolean buscarAeropuertoPorNombre(String nombre) {
		for(AeroPuerto aeropuertito : aeropuertos) {
			if(aeropuertito.getNombre().equals(nombre)) {
				return true;
			}
		}
		return false;
	}
		


	
	
	

}
