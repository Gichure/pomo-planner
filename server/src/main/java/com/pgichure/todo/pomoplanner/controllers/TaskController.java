/**
 * 
 */
package com.pgichure.todo.pomoplanner.controllers;

import java.util.Collection;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pgichure.todo.pomoplanner.models.Task;
import com.pgichure.todo.pomoplanner.repositories.TaskRepository;

import lombok.RequiredArgsConstructor;

/**
 * @author Paul Gichure
 *
 */
@RestController
@RequestMapping(path = "/tasks")
@RequiredArgsConstructor
public class TaskController {
	
	private final TaskRepository taskRepository;

	@GetMapping
    public Collection<Task> tasks() {
        return taskRepository.findAll().stream()
                .collect(Collectors.toList());
    }
}
