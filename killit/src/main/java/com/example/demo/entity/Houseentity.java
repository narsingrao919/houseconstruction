package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name= "houseplannings",schema = "houseconstruction")
public class Houseentity {
	
	@Id
	private int noofhouses;
	private String typeofhouse;
	private int noofrooms;
	private String typeofpaint;
	private int budget;
	
	}
