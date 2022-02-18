package modelo;

import java.util.Date;

public class Gato extends Mascota {

	private char tipoPelo;
	private String color;

	public Gato(String nombre, double edad, Date fechaDeNacimiento, char tipoPelo, String color) {
		super(nombre, edad, fechaDeNacimiento);
		this.tipoPelo = tipoPelo;
		this.color = color;
	}

	@Override
	public String toString() {

		return super.toString() + "Gato [tipoPelo=" + tipoPelo + ", color=" + color + "]";
	}

}
