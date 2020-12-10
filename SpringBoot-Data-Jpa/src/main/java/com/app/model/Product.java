package com.app.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "product2")
public class Product {
	@Id
	private Integer pid;
	private String pname;
	private Double cost; 

}
