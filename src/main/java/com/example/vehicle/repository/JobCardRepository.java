package com.example.vehicle.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.vehicle.model.JobCard;


@Repository
public interface JobCardRepository extends JpaRepository<JobCard, Long>{
	
	JobCard findByCustName(String custName);
}
