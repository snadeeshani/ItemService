package com.group_4.modal;

import java.util.List;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Category {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	Integer id;
	String name;
	@OneToMany(mappedBy ="category", cascade = CascadeType.ALL,fetch=FetchType.LAZY)
	
	List<ItemTypes> types;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<ItemTypes> getTypes() {
		return types;
	}
	public void setTypes(List<ItemTypes> types) {
		this.types = types;
	}
	
	public Category(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
		
	}
	public Category() {
		
	}
	
}
