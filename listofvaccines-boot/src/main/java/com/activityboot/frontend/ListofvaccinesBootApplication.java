package com.activityboot.frontend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.activityboot.frontend.dao.VaccineRepository;
import com.activityboot.frontend.model.Vaccine;

@SpringBootApplication
public class ListofvaccinesBootApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ListofvaccinesBootApplication.class, args);
	}
	
	@Autowired
	VaccineRepository vacrepo;

	@Override
	public void run(String... args) throws Exception {
		
		vacrepo.save(new Vaccine("Covaxin", "Available", 124780));
		vacrepo.save(new Vaccine("Covishield", "Available", 20000));
		vacrepo.save(new Vaccine("Pfizer", "Available", 3000));
		vacrepo.save(new Vaccine("Moderna", "Available", 58));
	}

}
