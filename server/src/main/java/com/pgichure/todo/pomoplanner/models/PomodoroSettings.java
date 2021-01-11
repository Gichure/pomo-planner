/**
 * 
 */
package com.pgichure.todo.pomoplanner.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Paul Gichure
 *
 */
@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PomodoroSettings {
	
	@Id 
	@GeneratedValue
	@Column(name = "id", updatable = false)
    private Long id;
	
	@Column(name = "duration")
	private Long duration;
	
	@Column(name = "long_duration")
	private Long longBreakDuration;
	
	@Column(name = "short_duration")
	private Long shortBreakDuration;
	
	@Column(name = "long_delay")
	private Long longBreakDelay;

}
