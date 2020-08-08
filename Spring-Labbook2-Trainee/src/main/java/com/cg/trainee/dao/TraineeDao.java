package com.cg.trainee.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.trainee.model.Trainee;

@Repository
public interface TraineeDao extends JpaRepository<Trainee, Integer>
{
	  
	  
}
