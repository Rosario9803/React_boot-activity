package com.activityboot.frontend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.activityboot.frontend.dao.VaccineRepository;
import com.activityboot.frontend.model.Vaccine;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class VaccineController {
	
	@Autowired
	VaccineRepository vacrepo;
	
    @GetMapping("/Vaccineslist")
	public List<Vaccine> listOfVaccines() {
    	return vacrepo.findAll();
    
		
	}
}
