package com.activityboot.frontend.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.activityboot.frontend.model.Vaccine;

@Repository
public interface VaccineRepository extends JpaRepository<Vaccine,Long>{

}
