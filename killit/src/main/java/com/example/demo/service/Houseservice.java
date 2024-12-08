package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.slf4j.helpers.Reporter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Houseentity;
import com.example.demo.repository.Houserepo;

@Service
public class Houseservice {
    
	@Autowired
	Houserepo houserepo;
	

	public  Houseentity create(Houseentity houseentity) {
		return houserepo.save(houseentity);
		// TODO Auto-generated method stub
	
	}


	public Optional<Houseentity>  getting( int noofhouses) {
		// TODO Auto-generated method stub
		return houserepo.findById(noofhouses);
	}


	public Houseentity updating(int noofhouses, Houseentity houseentity){
		// TODO Auto-generated method stub
		Houseentity oldHouseentity=houserepo.findById(noofhouses).orElse(null);
		   oldHouseentity.setNoofhouses(houseentity.getNoofhouses());
		   oldHouseentity.setNoofrooms(houseentity.getNoofrooms());
		   oldHouseentity.setTypeofhouse(houseentity.getTypeofhouse());
		   oldHouseentity.setTypeofpaint(houseentity.getTypeofpaint());
		   oldHouseentity.setBudget(houseentity.getBudget());
		    houserepo.save(oldHouseentity);
		    return oldHouseentity;
		   }
	


	public List<Houseentity> getall() {
		// TODO Auto-generated method stub
		return houserepo.findAll();
	}


	
	

}
