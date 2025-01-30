package dat102.f05.stabel.tabellstabel;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import dat102.f05.stabel.StabelADT;

class TabellStabelTest {

	// Metoder
	// push, pop, peek, isEmpty, clear
	
	StabelADT<String> stabel; 

	@BeforeEach
	void opprettStabler() {
		stabel = new TabellStabel<>();
	}
	
	@Test
	void nyStabelSkalVareTom() {
		
		assertTrue(stabel.isEmpty());
			
	}
	
	@Test
	void leggeTilVirkerFint() {
		
		stabel.push("Per");		
		assertFalse(stabel.isEmpty());
		assertEquals("Per",stabel.peek());
		
	}
	
	@Test
	void virkerClear() {
		stabel.push("Per");
		stabel.push("Pål");
		stabel.clear();
		assertTrue(stabel.isEmpty());
		
	}

	
}
