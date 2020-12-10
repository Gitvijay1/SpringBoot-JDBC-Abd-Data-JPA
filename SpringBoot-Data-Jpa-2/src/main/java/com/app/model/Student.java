package com.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "student2")
public class Student {
	@Id
	@Column(name = "id")
	private Integer sid;
	@Column(name = "name")
	private String sname;
	@Column(name = "cource")
	private String scource;
	@Column(name = "fee")
	private Double fee;

}
