package com.crudSE.demo.DTOs;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeDTO {
  
  private Long id;
  private String name;
  private String email;
  private String address;
  private Long phone;
  
}

