package modelo;

import java.util.Date;

public class Mascota{

	private static int identificador = 0;
	private int identificadorMascota = 0;
	private String nombre;
	private double edad;
	private Date fechaDeNacimiento;

	public Mascota() {
		identificador = identificador + 1;
		identificadorMascota = identificador;
	}

	public int getIdentificadorMasctoa() {
		return identificadorMascota;
	}

	public void setIdentificadorMasctoa(int identificadorMasctoa) {
		this.identificadorMascota = identificadorMasctoa;
	}

	public Mascota(String nombre, double edad, Date fechaDeNacimiento) {
		identificador = identificador + 1;
		identificadorMascota = identificador;
		this.nombre = nombre;
		this.edad = edad;
		this.fechaDeNacimiento = fechaDeNacimiento;
	}

	public static int getIdentificador() {
		return identificador;
	}

	public static void setIdentificador(int identificador) {
		Mascota.identificador = identificador;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getEdad() {
		return edad;
	}

	public void setEdad(double edad) {
		this.edad = edad;
	}

	public Date getFechaDeNacimiento() {
		return fechaDeNacimiento;
	}

	public void setFechaDeNacimiento(Date fechaDeNacimiento) {
		this.fechaDeNacimiento = fechaDeNacimiento;
	}

	@Override
	public String toString() {
		return "Mascota " + identificadorMascota + " [nombre=" + nombre + ", edad=" + edad + ", fechaDeNacimiento="
				+ fechaDeNacimiento + "]";
	}

	public void mostrarIdentificador() {
		System.out.println(identificador);
	}

}
