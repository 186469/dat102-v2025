package figurer;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class KvadratTest {

	@Test
	void fungererArealOgOmkrets() {
		
		Figur2D kvadrat = new Kvadrat(3);	
		assertEquals(9.0, kvadrat.areal());
		assertEquals(12.0, kvadrat.omkrets());
		
		
	}
	
}
