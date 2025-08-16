package com.crudSE.demo.service;

import com.crudSE.demo.GlobalExceptionHandler.CustomExceptions.AlreadyExistsException;
import com.crudSE.demo.GlobalExceptionHandler.CustomExceptions.ResourceNotFoundException;
import com.crudSE.demo.DTOs.EmployeeDTO;
import com.crudSE.demo.models.Employee.Employee;
import com.crudSE.demo.models.Employee.EmployeeMapper;
import com.crudSE.demo.repositories.EmployeeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
  
  private final EmployeeRepository employeeRepository;
  
  
  public EmployeeService(EmployeeRepository employeeRepository) {
    this.employeeRepository = employeeRepository;
  }
  
  
  public EmployeeDTO createEmployee(Employee employee){
    if(this.employeeRepository.existsByEmail(employee.getEmail())){
      throw new AlreadyExistsException("The Employee with email: " + employee.getEmail() + " already exists");
    }
    return EmployeeMapper.mapToEmployeeDTO( this.employeeRepository.save(employee));
  }
  
  
  public EmployeeDTO getEmployeeById(Long id) {
    return EmployeeMapper.mapToEmployeeDTO(this.employeeRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException("The user does not exists with id: "+ id )));
  }
  
  
  public List<EmployeeDTO> getAllEmployees() {
    return this.employeeRepository.findAll().stream()
        .map(EmployeeMapper::mapToEmployeeDTO).collect(
            java.util.stream.Collectors.toList()
        );
  }
  
  
  public EmployeeDTO updateEmployee(EmployeeDTO employee) {
    Employee employeeToUpdate = this.employeeRepository.findById(employee.getId()).orElseThrow(()-> new ResourceNotFoundException("The employee with id "+ employee.getId()+ " is not found"));
    
    employeeToUpdate.setAddress(employee.getAddress());
    employeeToUpdate.setPhone(employee.getPhone());
    employeeToUpdate.setEmail(employee.getEmail());
    employeeToUpdate.setName(employee.getName());
    return EmployeeMapper.mapToEmployeeDTO(this.employeeRepository.save(employeeToUpdate));
  }
  
  
  public String deleteEmployee(EmployeeDTO employee) {
    if(!this.employeeRepository.existsByEmail(employee.getEmail())){
      throw new ResourceNotFoundException("Employee with email: " + employee.getEmail() + " does not exists");
    }
    this.employeeRepository.deleteById(employee.getId());
    
    return "User of id " + employee.getId() + " successfully deleted";
  }
}
