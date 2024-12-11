package Test;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Test;

public class TestTask {

    @Test
    public void testPrixHeureSetter() {
        Task task = new Task(1, "Test Task", "2024-12-12", 50.0);
        task.setPrixHeure(60.0);
        assertEquals(60.0, task.getPrixHeure(), 0.0);
    }

    @Test
    public void testGetLibelle() {
        Task task = new Task(1, "Test Task", "2024-12-12", 50.0);
        assertEquals("Test Task", task.getLibelle());
    }
}

