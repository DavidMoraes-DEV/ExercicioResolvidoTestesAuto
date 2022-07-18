package com.ExercicioResolvidoTestesAuto.ExercicioResolvidoTestesAuto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ExercicioResolvidoTestesAuto.ExercicioResolvidoTestesAuto.entities.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
