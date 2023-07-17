package com.songchanyeong.service;

import java.util.List;

import com.songchanyeong.vo.EmployeeCommonDto;
import com.songchanyeong.vo.Employees;


public interface EmployeeService {

	List<EmployeeCommonDto> getEmployeesList(EmployeeCommonDto dto);
	EmployeeCommonDto getEmployees(int employeeId);
	int register(Employees emp);

}