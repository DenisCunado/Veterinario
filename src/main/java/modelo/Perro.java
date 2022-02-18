package modelo;

import java.util.Date;

public class Perro extends Mascota {

	private String raza;
	private boolean pulgas;

	public Perro() {
		super();
	}
//
//	public Perro(String raza, boolean pulgas, String nombre, double edad, Date fechaDeNacimiento) {
//		super(nombre, edad, fechaDeNacimiento);
//		this.raza = raza;
//		this.pulgas = pulgas;
//	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public boolean isPulgas() {
		return pulgas;
	}

	public void setPulgas(boolean pulgas) {
		this.pulgas = pulgas;
	}

	@Override
	public String toString() {
		return super.toString() + "Perro [raza=" + raza + ", pulgas=" + pulgas + "]";
	}

}
