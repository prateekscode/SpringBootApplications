package com.india.spring.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.india.spring.dto.EmpDTO;
import com.india.spring.entity.Emp;
import com.india.spring.repository.EmployeeRepository;
import com.india.spring.service.RegisterService;

@Service
public class RegisterServiceImpl implements RegisterService {

	@Autowired
	EmployeeRepository employeeRepository;

	@Override
	public EmpDTO registerEmpInfo(EmpDTO empDTO) {

		Emp employee = new Emp(empDTO.getEid(), empDTO.getName(), empDTO.getPhone(), empDTO.getCity());
		Emp emp = employeeRepository.save(employee);
		EmpDTO emDTO = new EmpDTO(emp.getEid(), emp.getName(), emp.getPhone(), emp.getCity());
		return emDTO;
	}

	@Override
	public EmpDTO registerEmpInfo1(EmpDTO empDTO) {
		Emp employee = new Emp(empDTO.getEid(), empDTO.getName(), empDTO.getPhone(), empDTO.getCity());
		Emp emp = employeeRepository.save(employee);
		EmpDTO emDTO = new EmpDTO(emp.getEid(), emp.getName(), emp.getPhone(), emp.getCity());
		return emDTO;
	}

	@Override
	public EmpDTO getEmpInfo(int eid) {
		Optional<Emp> empOp = employeeRepository.findById(eid);
		Emp em = empOp.get();
		EmpDTO emDTO = new EmpDTO(em.getEid(), em.getName(), em.getPhone(), em.getCity());
		return emDTO;
	}

	@Override
	public List<Emp> getEmpInfoByName(String name) {
		List<Emp> empList = employeeRepository.findByName(name);
		return empList;
	}

	@Override
	public List<Emp> getEmpInfoByNameAndPhone(String name, long phone) {
		List<Emp> empList = employeeRepository.findByNameAndPhone(name,phone);

		return empList;
	}

	@Override
	public String deleteEmpInfo(int eid) {
		employeeRepository.deleteById(eid);
		return "Record deleted succesfully";
	}

	@Override
	public List<Emp> getEmpInfoByStartName(String name) {
		
		List<Emp> empList = employeeRepository.findByNameStartWithC(name);

		return empList;
	}

	@Override
	public Iterable<Emp> getAllEmpInfo() {
		Iterable<Emp> empList = employeeRepository.findAll();
		return empList;
	}


}