package oppgave3Uke3;

import java.util.ArrayList;

public class oppg3 {

	public static void main(String[] args) {

		ArrayList<Integer> tall = new ArrayList<>(5);
		int a = 1;
		
		tall.add(2);
		tall.add(3);
		tall.add(4);
		tall.add(5);
		tall.add(2);
		
		System.out.println(tall.get(3));
		System.out.println(tall.get(4));
		
		tall.add(1, 10);

		System.out.println("Antall elementer i listen er: " + tall.size());
		
		if (tall.contains(a)) {
			System.out.println("Listen inneholder tallet: " + a);
		}
		else {
			System.out.println("Listen inneholder ikke tallet: " + a);
		}
		
		int elementSomErLik = 2;
		int førstePos = tall.indexOf(elementSomErLik);
		int sistePos = tall.lastIndexOf(elementSomErLik);
		
		System.out.println(tall);
		
		System.out.println("Første plassen i listen som er " + elementSomErLik + ": " + (førstePos+1));
		System.out.println("Siste plassen i listen som er " + elementSomErLik + ": " + (sistePos+1));

		tall.clear();
		System.out.println(tall.isEmpty());

		
	}

}
