package com.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


import com.app.entity.Register;

@Repository
 public interface RegisterRepository extends JpaRepository<Register,Integer> {
	
	@Query("select r from Register r where r.userName=?1")
	public Register findByUserName(String userName);	

}
