package com.ExercicioResolvidoTestesAuto.ExercicioResolvidoTestesAuto.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ExercicioResolvidoTestesAuto.ExercicioResolvidoTestesAuto.dto.EmployeeDTO;
import com.ExercicioResolvidoTestesAuto.ExercicioResolvidoTestesAuto.entities.Department;
import com.ExercicioResolvidoTestesAuto.ExercicioResolvidoTestesAuto.entities.Employee;
import com.ExercicioResolvidoTestesAuto.ExercicioResolvidoTestesAuto.repositories.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository repository;

	@Transactional(readOnly = true)
	public Page<EmployeeDTO> findAll(Pageable pageable) {
		Page<Employee> page = repository.findAll(pageable);
		return page.map(x -> new EmployeeDTO(x));
	}

	@Transactional
	public EmployeeDTO insert(EmployeeDTO dto) {
		Employee entity = new Employee();
		entity.setName(dto.getName());
		entity.setEmail(dto.getEmail());
		entity.setDepartment(new Department(dto.getDepartmentId(), null));
		
		entity = repository.save(entity); //Por padrão o método . save() retorna uma referência para a entidade salva
		return new EmployeeDTO(entity);
	}
}
