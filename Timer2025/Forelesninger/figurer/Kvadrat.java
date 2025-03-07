package figurer;

public class Kvadrat implements Figur2D {

	private double side;
	
	public Kvadrat(double side) {
		this.side = side;
	}

	@Override
	public double areal() {		
		return side * side;
	}

	@Override
	public double omkrets() {		
		return side * 4;
	}


	
}
