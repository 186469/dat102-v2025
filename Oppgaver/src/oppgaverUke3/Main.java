package oppgaverUke3;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

//		Rektangel rek = new Rektangel(2,3);
//		System.out.println("Rektangelet har " + rek.areal() + "cm^2");
//		rek.tegn();
//		System.out.println();
//		
//		Trekant trek = new Trekant(4);
//		System.out.println("Trekanten har " + trek.areal() + "cm^2");
//		trek.tegn();
		
		List<Figur> liste = new ArrayList<>();
		liste.add(new Rektangel(2,3));
		liste.add(new Rektangel(3,4));
		liste.add(new Trekant(5));
		liste.add(new Trekant(7));
		
		for (Figur fig : liste) {
			System.out.println("Arealet: " + fig.areal());
			fig.tegn();
			System.out.println();
		}
		
		double sum = 0;
		for (Figur figur : liste) {
			sum += figur.areal();
		}
		System.out.println("Det totalet arealete er: " + sum);
		
	}

}
