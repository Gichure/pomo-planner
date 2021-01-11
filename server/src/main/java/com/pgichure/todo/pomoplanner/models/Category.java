/**
 * 
 */
package com.pgichure.todo.pomoplanner.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.pgichure.todo.pomoplanner.models.Pomodoro.PomodoroBuilder;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

/**
 * @author Paul Gichure
 *
 */
@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Category {

	@Id 
	@GeneratedValue
	@Column(name = "id", updatable = false)
    private Long id;
	
	@Column(name = "name", nullable = false)
	private @NonNull String name;
	
	@Column(name = "description")
	private String description;
	
}
