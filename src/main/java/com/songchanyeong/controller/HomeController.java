package com.songchanyeong.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.songchanyeong.service.EmployeeService;
import com.songchanyeong.vo.Employees;


@Controller
public class HomeController {

	 @GetMapping("/")
	 public String home() {
		return "redirect:/emp/list";
	 }

}