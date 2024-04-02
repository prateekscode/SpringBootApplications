package com.india.spring;

import java.util.Optional;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.india.spring.dto.EmpDTO;
import com.india.spring.entity.Emp;
import com.india.spring.repository.EmployeeRepository;
import com.india.spring.service.impl.RegisterServiceImpl;

@SpringBootTest
public class RegisterServiceImplTest {

	@Autowired
	RegisterServiceImpl registerServiceImpl;
	
	//we use mockbean to mock the nature so that in real it cannot impact on database. 
	@MockBean
	EmployeeRepository employeeRepository;
	
	@Test
	public void testCaseForGetEmpInfo() {
		System.out.println("test ...");
		//Optional<Emp> empOp =Mockito.mock(Optional.class);
		Emp  em=new Emp(100,"Hello",78458,"chennai");
		Mockito.when(employeeRepository.findById(101)).thenReturn(Optional.of(em));
		EmpDTO edto=registerServiceImpl.getEmpInfo(101);
		Assertions.assertNotNull(edto);
	}

	//registerEmpInfo
	@Test
	public void testCaseForregisterEmpInfo() {
		System.out.println("test ...");
		Emp  em=new Emp(100,"Hello",78458,"chennai");
		Mockito.when(employeeRepository.save(Mockito.any(Emp.class))).thenReturn(em);
		EmpDTO  emDTO=new EmpDTO(100,"Hello",78458,"chennai");
		EmpDTO edto=registerServiceImpl.registerEmpInfo(emDTO);
		Assertions.assertNotNull(edto);
	}

}