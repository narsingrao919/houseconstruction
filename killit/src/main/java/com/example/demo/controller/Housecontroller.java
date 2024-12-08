package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Houseentity;
import com.example.demo.service.Houseservice;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
@RequestMapping("/api/v1/")
public class Housecontroller {
	          
	        @Autowired
	        Houseservice houseservice;
	       
	       @PostMapping("/service")
	       public Houseentity postMethodName(@RequestBody Houseentity houseentity) {
	       	//TODO: process POST request
	       	
	       	return houseservice.create(houseentity);
	       }
	       
	       @GetMapping("/service/{id}")
	       public Optional<Houseentity> getMethodName(@PathVariable int noofhouses) {
	       	return houseservice.getting(noofhouses);
	       }
	       
	       @PutMapping("/service/{id}")
	       public Houseentity putMethodName(@PathVariable int noofhouses, @RequestBody Houseentity houseentity) {
	       	//TODO: process PUT request
	       	
	       	return houseservice.updating(noofhouses,houseentity);
	       }
	       
	       @GetMapping("/service")
	       public List<Houseentity>getallitems(){
	       	return houseservice.getall();
	       }
	       
	       
	       
	       
	      

}
