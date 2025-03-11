package oppgaverUke3;

public class Rektangel implements Figur {

	private int høyde;
	private int bredde;
	
	public Rektangel(int høyde, int bredde) {
		this.høyde = høyde;
		this.bredde = bredde;
	}

	@Override
	public double areal() {
		return høyde * bredde;
	}

	@Override
	public void tegn() {

		for (int i = 0; i < høyde; i++) {
			for (int j = 0; j < bredde; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
	

}
