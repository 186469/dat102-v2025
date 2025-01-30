package dat102.f02.tabellbag;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TabellBagTest {

	@Test
	void test() {
<<<<<<< Updated upstream
<<<<<<< Updated upstream
		
		BagADT<String> bag = new TabellBag<String>(2);
		
		assertEquals(0, bag.getCurrentSize());
		assertTrue(bag.isEmpty());
		
		assertFalse(bag.contains("Eple"));
		
		assertTrue(bag.add("Eple"));
		assertTrue(bag.add("Banan"));
		assertFalse(bag.add("Pære"));
		
		assertEquals(2, bag.getCurrentSize());
		assertFalse(bag.isEmpty());
		
		assertTrue(bag.contains("Eple"));
		assertTrue(bag.contains("Banan"));
		assertFalse(bag.contains("Pære"));
=======
=======
>>>>>>> Stashed changes
		BagADT<String> bag = new TabellBag<>(2);
		assertEquals(0,bag.getCurrentSize());
		assertTrue(bag.isEmpty());
		
		assertFalse(bag.contains("Gulrot"));		
		
		assertTrue(bag.add("Eple"));
		assertTrue(bag.add("Banan"));
		assertFalse(bag.add("Pære"));		

		assertEquals(2,bag.getCurrentSize());
		assertFalse(bag.isEmpty());
		
		assertFalse(bag.contains("Gulrot"));
		assertTrue(bag.contains("Banan"));
		assertFalse(bag.contains("Pære"));

<<<<<<< Updated upstream
>>>>>>> Stashed changes
=======
>>>>>>> Stashed changes
		
		assertNotNull(bag.remove());
		assertNotNull(bag.remove());
		assertNull(bag.remove());
		
<<<<<<< Updated upstream
<<<<<<< Updated upstream
		assertEquals(0, bag.getCurrentSize());
		assertTrue(bag.isEmpty());

		assertFalse(bag.contains("Eple"));
		assertFalse(bag.contains("Banan"));
		assertFalse(bag.contains("Pære"));
=======
=======
>>>>>>> Stashed changes
		assertEquals(0,bag.getCurrentSize());
		assertTrue(bag.isEmpty());		
		
		
		
<<<<<<< Updated upstream
>>>>>>> Stashed changes
=======
>>>>>>> Stashed changes
	}

}
