package dat102.f02.tabellbag;

<<<<<<< Updated upstream
<<<<<<< Updated upstream
=======
=======
>>>>>>> Stashed changes
import java.util.ArrayList;
import java.util.Arrays;

>>>>>>> Stashed changes
/**
 * En implementasjon av BagADT
 * 
 * @author Lars-Petter Helland
 */
<<<<<<< Updated upstream
<<<<<<< Updated upstream
public class TabellBag<T> implements BagADT<T> {
=======
public class TabellBag<T> implements BagADT <T> {
>>>>>>> Stashed changes
=======
public class TabellBag<T> implements BagADT <T> {
>>>>>>> Stashed changes

	private static final int DEFAULT_KAPASITET = 10;

	private T[] tabell;
	private int antall;

	/************************************************************/

	public TabellBag() {
		this(DEFAULT_KAPASITET);
	}

	@SuppressWarnings("unchecked")
	public TabellBag(int kapasitet) {
		tabell = (T[]) new Object[kapasitet];
		antall = 0;
	}

	@Override
	public int getCurrentSize() {
		return antall;
	}

	@Override
	public boolean isEmpty() {
		return antall == 0;
	}

	private boolean erFull() {
		return antall == tabell.length;
	}
<<<<<<< Updated upstream
<<<<<<< Updated upstream
	
=======
>>>>>>> Stashed changes
=======
>>>>>>> Stashed changes
	@Override
	public boolean add(T newEntry) {
		
		if (erFull()) {
			return false;
		}
<<<<<<< Updated upstream
<<<<<<< Updated upstream
		
		tabell[antall] = newEntry;
		antall++;
=======
		tabell[antall] = newEntry;
		antall++;		
>>>>>>> Stashed changes
=======
		tabell[antall] = newEntry;
		antall++;		
>>>>>>> Stashed changes
		return true;
	}

	@Override
	public T remove() {
		
		if (isEmpty()) {
			return null;
		}
<<<<<<< Updated upstream
<<<<<<< Updated upstream
		
=======
>>>>>>> Stashed changes
=======
>>>>>>> Stashed changes
		T element = tabell[antall-1];
		tabell[antall-1] = null;
		antall--;
		return element;
	}

	@Override
	public boolean remove(T anEntry) {
<<<<<<< Updated upstream
<<<<<<< Updated upstream

		boolean funnet = false;
		int indeks = 0;
		while(indeks < antall && !funnet) {
			if(anEntry.equals(tabell[indeks])) {
				funnet = true;
			} else {
				indeks++;
			}
		}
		if(!funnet) {
			return false;
		}
		tabell[indeks] = tabell[antall-1];
		tabell[antall-1] = null;
		antall--;
		return true;
=======
		// TODO Auto-generated method stub
		return false;
>>>>>>> Stashed changes
=======
		// TODO Auto-generated method stub
		return false;
>>>>>>> Stashed changes
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getFrequencyOf(T anEntry) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean contains(T anEntry) {
		
		for (int i = 0; i < antall; i++) {
			if (tabell[i].equals(anEntry)) {
				return true;
			}
		}
		return false;
<<<<<<< Updated upstream
<<<<<<< Updated upstream
	}
=======
		}
>>>>>>> Stashed changes
=======
		}
>>>>>>> Stashed changes

	@Override
	public T[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}

	/************************************************************/

}
