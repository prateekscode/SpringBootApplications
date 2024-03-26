package com.india.spring.service;

import java.util.List;

import com.india.spring.dto.EmpDTO;
import com.india.spring.entity.Emp;

public interface RegisterService {
	public EmpDTO registerEmpInfo(EmpDTO empDTO);
	public EmpDTO registerEmpInfo1(EmpDTO empDTO);
	public EmpDTO getEmpInfo(int eid);
	public List<Emp> getEmpInfoByName(String name);
	public List<Emp> getEmpInfoByNameAndPhone(String name,long phone);
	public String deleteEmpInfo(int eid);
	public List<Emp> getEmpInfoByStartName(String name);
	public Iterable<Emp> getAllEmpInfo();

}