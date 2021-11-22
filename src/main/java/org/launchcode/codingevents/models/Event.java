package org.launchcode.codingevents.models;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.Objects;

/**
 * Created by Chris Bay
 */
public class Event {

	private int id;
	private static int nextId = 1;

	@NotBlank(message = "Name is required.")
	@Size(min = 3, max = 50, message = "Name must be between 3 and 50 characters.")
	private String name;

	@Size(max = 500, message = "Description must be 500 characters or less.")
	private String description;

	@NotBlank(message = "Contact email is required.")
	@Email(message = "Invalid email. Please Try again.")
	private String contactEmail;

	@NotBlank(message = "Please provide a location for this event.")
	@Size(max = 50, message = "Description must be 50 characters or less.")
	private String location;

	public Event(String name, String location, String description, String contactEmail) {
		this.name = name;
		this.location = location;
		this.description = description;
		this.contactEmail = contactEmail;
		this.id = nextId;
		nextId++;
	}

	public Event() {
		this.id = nextId;
		nextId++;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getContactEmail() {
		return contactEmail;
	}

	public void setContactEmail(String contactEmail) {
		this.contactEmail = contactEmail;
	}

	@Override
	public String toString() {
		return name;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Event event = (Event) o;
		return id == event.id;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}


}
