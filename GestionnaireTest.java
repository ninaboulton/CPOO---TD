package td01;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;
import gestionnaire.Gestionnaire;
import habitant.Habitant;

class GestionnaireTest {
	private Gestionnaire a;
	
	@BeforeAll
	void setup() {
		a = new Gestionnaire("a","b");
	}

	@Test
	void testAddHabitant() {
		Assertions.assertEquals("florian", a.addHabitant("florian","1234").getName());
		Assertions.assertEquals("1234", a.addHabitant("florian","1234").getPassword());
	}
	@Test
	void testDeleteHabitant() {
		Habitant b = a.addHabitant("Test", "aaaa");
		a.removeHabitant(b);
		Assertions.assertNull(b.getName());
		Assertions.assertNull(b.getPassword());
		
	}

}
