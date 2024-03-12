package com.india.spring.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.india.spring.dto.*;

@RestController
public class RegisterController {

	@RequestMapping(value = "/regn", method = RequestMethod.POST)
	public ResponseEntity<Object> registerEmpInfo(@RequestParam("eid") int eid, @RequestParam("name") String name,
			@RequestParam("phone") long phone, @RequestParam("city") String city) {
		System.out.println("registerEmpInfo--ResponseEntity");
		System.out.println(eid + "\t" + name + "\t" + phone + "\t" + city);
		return null;
	}
	
	@RequestMapping(value = "/regn1", method = RequestMethod.POST)
	public ResponseEntity<Object> registerEmpInfo1(@RequestBody EmpDTO obj) {
		System.out.println("registerEmpInfo1--ResponseEntity");
		System.out.println(obj.getEid()+"\t"+obj.getName()+"\t"+obj.getPhone()+"\t"+obj.getCity());
		return new ResponseEntity<>(obj,HttpStatus.CREATED);
	}
}