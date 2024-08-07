package com.sujan.demo;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

import org.springframework.data.annotation.Id;

import lombok.Data;

@Data
@Entity
@Table(name = "employees")
public class Employee {

  @Id
  //@GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;
  
  private String name; 
}
