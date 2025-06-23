package com.example.demo.repository;

import com.example.demo.model.Task;
import com.example.demo.repository.TaskRepository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class TaskRepositoryTest {

    @Autowired
    private TaskRepository taskRepository;

    @Test
    void testSaveAndFind() {
        Task task = new Task();
        task.setTaskdescription("TestTask");

        Task saved = taskRepository.save(task);
        Optional<Task> fetched = taskRepository.findById(saved.getId());

        assertTrue(fetched.isPresent());
        assertEquals("TestTask", fetched.get().getTaskdescription());
    }
}
