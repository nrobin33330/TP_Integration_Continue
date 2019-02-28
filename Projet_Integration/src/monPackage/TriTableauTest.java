package monPackage;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TriTableauTest {
	
	
	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testTrier() throws IOException {
		int tab1[] = {0,1,2,3,4,5,6,7,8,9};
		int tab2[] = {9,8,7,6,5,4,3,2,1,0};
		TriTableau.trier(tab2);
		
		//fail("Not yet implemented");
	}
	
	
	
	@Test
	void testTriCroissant() {
		int tab1[] = {0,1,2,3,4,5,6,7,8,9};
		int tab2[] = {9,8,7,6,5,4,3,2,1,0};
		TriTableau.triCroissant(tab2);
		assertArrayEquals(tab1,tab2);
	}

	@Test
	void testTriDecroissant() {
		int tab1[] = {0,1,2,3,4,5,6,7,8,9};
		int tab2[] = {9,8,7,6,5,4,3,2,1,0};
		TriTableau.triDecroissant(tab1);
		assertArrayEquals(tab2,tab1);
	}

}
