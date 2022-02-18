package vista;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import modelo.Gato;
import modelo.Mascota;
import modelo.Perro;

public class Main {

	private static ArrayList<Mascota> mascotas = new ArrayList<Mascota>();

	public static void main(String[] args) {
		Mascota m = new Mascota("misifu", 2.4, new Date("1993/12/1"));
		mascotas.add(m);
		Gato g = new Gato("misifu", 2.4, new Date("1993/12/1"), 'l', "naranja");
		mascotas.add(g);

		Perro p = new Perro();
		mascotas.add(p);

		for (int i = 0; i < mascotas.size(); i++) {
			if (mascotas.get(i) instanceof Perro) {
				System.out.println(mascotas.get(i));
			}
		}

	}

}
