/**
 * 
 */
package com.pgichure.todo.pomoplanner.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pgichure.todo.pomoplanner.models.Task;

/**
 * @author Paul Gichure
 *
 */
public interface TaskRepository extends JpaRepository<Task, Long>{

}
