package com.india.spring.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.india.spring.entity.Emp;

import jakarta.websocket.server.PathParam;

public interface EmployeeRepository extends CrudRepository<Emp, Integer> {
	
	public List<Emp> findByName(String name);
	public List<Emp> findByNameAndPhone(String name,long phone);
	
	@Query("FROM Emp e WHERE e.name LIKE CONCAT(:c, '%')")
	public List<Emp> findByNameStartWithC(@PathParam("c") String c);
	
}