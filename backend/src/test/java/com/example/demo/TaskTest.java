package com.example.demo;

import com.example.demo.model.Task;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.springframework.boot.test.context.SpringBootTest;
import org.junit.jupiter.api.Test;


@SpringBootTest
public class TaskTest {

    @Test
    void testDescription() {
        final String taskDescription = "DEMO";

        Task testee = new Task();
        testee.setTaskdescription(taskDescription);

        assertEquals(taskDescription, testee.getTaskdescription(), "Description should match");
    }

	@Test
void testSetAndGetId() {
    Task task = new Task();
    task.setId(42L);
    assertEquals(42L, task.getId());
}

}
