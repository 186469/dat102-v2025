package oppgaverUke3;

public class Trekant implements Figur{

	private int sideLengde;

	public Trekant(int sideLengde) {
		this.sideLengde = sideLengde;
	}

	@Override
	public double areal() {
		return (sideLengde * sideLengde) / 2.0;
	}

	@Override
	public void tegn() {
		for (int i = 0; i <= sideLengde; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	
}
