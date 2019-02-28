package monPackage;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FIFOTest {
	
	private FIFO fifo;
	
	@BeforeEach
	void setUp() throws Exception {
		fifo = new FIFO();
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testAdd() {
		//Test qu'il est vide
		assertEquals(0,fifo.size(),"Erreur testSize");
		fifo.add(10);
		fifo.add(5);
		fifo.add(6);
		fifo.add(8);
		//Test ajouts se sont bien passés
		assertEquals(4,fifo.size(),"Erreur testSize");
		//fail("Not yet implemented");
	}

	@Test
	void testFirst() {
		fifo.add(10);
		fifo.add(15);
		int rst = fifo.first();
		assertEquals(10,rst,"Erreur testFirst");
		//fail("Not yet implemented");
	}

	@Test
	void testIsEmpty() {
		assertEquals(true,fifo.isEmpty(),"Erreur testIsEmpty");
	}

	@Test
	void testRemoveFirst() {
		fifo.add(10);
		fifo.add(15);
		fifo.add(30);
		fifo.removeFirst();
		int rst = fifo.first();
		assertEquals(15,rst,"Erreur testRemoveFirst");
		//fail("Not yet implemented");
	}

	@Test
	void testSize() {
		fifo.add(10);
		fifo.add(5);
		fifo.add(6);
		fifo.add(8);
		assertEquals(4,fifo.size(),"Erreur testSize");
	}

}
