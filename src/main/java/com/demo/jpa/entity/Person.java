package com.demo.jpa.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "t_person")
public class Person {
	@Id
	@GeneratedValue
	private Integer id;

	@Column(name = "name", nullable = true, length = 20)
	private String name;

	@Column(name = "age", nullable = true, length = 4)
	private int age;
}
