package com.ExercicioResolvidoTestesAuto.ExercicioResolvidoTestesAuto.dto;

import java.io.Serializable;

import com.ExercicioResolvidoTestesAuto.ExercicioResolvidoTestesAuto.entities.Department;

public class DepartmentDTO implements Serializable{
	private static final long serialVersionUID = 1L;

	private Long id;
	private String name;
	
	public DepartmentDTO() {
	}

	public DepartmentDTO(Long id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public DepartmentDTO(Department entity) {
		this.id = entity.getId();
		this.name = entity.getName();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
