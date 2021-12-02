package org.launchcode.codingevents.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.Objects;

@Entity
public class EventCategory {

	@Id
	@GeneratedValue
	private int id;

	@NotBlank(message = "Category is required")
	@Size(min = 3, max = 50, message = "Category must be at least 3")
	private String name;

	public EventCategory(@Size(min = 3, message = "Category must be at least 3") String name) {
		this.name = name;
	}

	public EventCategory() {
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return name;
	}


	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		EventCategory that = (EventCategory) o;

		return id == that.id;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
}
