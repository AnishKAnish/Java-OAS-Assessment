package com.employee.employeemanagement.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name= "EMP_TB")
public class Employee {
    
    @Id
    @GeneratedValue
    private int id;
    private String name;
    private String address;
    private double salary;
    
}
