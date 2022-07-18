package com.ExercicioResolvidoTestesAuto.ExercicioResolvidoTestesAuto.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.ExercicioResolvidoTestesAuto.ExercicioResolvidoTestesAuto.dto.DepartmentDTO;
import com.ExercicioResolvidoTestesAuto.ExercicioResolvidoTestesAuto.entities.Department;
import com.ExercicioResolvidoTestesAuto.ExercicioResolvidoTestesAuto.repositories.DepartmentRepository;

@Service
public class DepartmentService {

	@Autowired
	private DepartmentRepository repository;

	public List<DepartmentDTO> findAll() {
		List<Department> list = repository.findAll(Sort.by("name"));
		return list.stream().map(x -> new DepartmentDTO(x)).collect(Collectors.toList());
	}
}
