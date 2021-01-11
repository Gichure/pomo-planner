package com.pgichure.todo.pomoplanner;

import java.util.Date;
import java.util.stream.Stream;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.pgichure.todo.pomoplanner.models.Task;
import com.pgichure.todo.pomoplanner.repositories.TaskRepository;

@SpringBootApplication
public class PomoPlannerApplication {

	public static void main(String[] args) {
		SpringApplication.run(PomoPlannerApplication.class, args);
	}

	@Bean
    ApplicationRunner init(TaskRepository repository) {
        return args -> {
            Stream.of("Sort GIS-2342", "Train Interns", "Code Review - 2525").forEach(name -> {
                Task task = Task.builder()
                		.name(name)
                		.startTime(new Date())
                		.description(name)
                		.build();
                repository.save(task);
            });
            repository.findAll().forEach(System.out::println);
        };
    }
	
}
