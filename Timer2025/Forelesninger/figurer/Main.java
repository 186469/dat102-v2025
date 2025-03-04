package figurer;

public class Main {

	// Bruker interfacet som konstruktør.
	public static void skrivUt(Figur2D f) {
		
		System.out.println(f.areal());
		System.out.println(f.omkrets());
	}
	
	public static void main(String[] args) {

		// Er vanlig å skrive "Kvadrat kvadrat = new Kvadrat();"
		// Men det er anbefalt å bruke interfacet.
		Figur2D kvadrat = new Kvadrat(4);		
		skrivUt(kvadrat);
		
	}

}
