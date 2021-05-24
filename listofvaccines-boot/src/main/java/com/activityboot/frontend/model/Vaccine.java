package com.activityboot.frontend.model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="vaccines")
public class Vaccine {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	private String vaccinename;
	private String status;
	private long numberofVaccines;
	
	public Vaccine() {
		//default constructor
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getVaccinename() {
		return vaccinename;
	}
	public void setVaccinename(String vaccinename) {
		this.vaccinename = vaccinename;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public long getNumberOfVaccines() {
		return numberofVaccines;
	}
	public void setNumberOfVaccines(long numberOfVaccines) {
		this.numberofVaccines = numberOfVaccines;
	}
	public Vaccine(String vaccinename, String status, long numberOfVaccines) {
		super();
		this.vaccinename = vaccinename;
		this.status = status;
		this.numberofVaccines = numberOfVaccines;
	}
	
	
	

}
