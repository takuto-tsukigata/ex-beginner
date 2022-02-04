package com.example.controller;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/exam03")
public class Exam03Controller {

	@Autowired
	public ServletContext application;

	@RequestMapping("")
	public String index() {
		return "exam03";
	}

	@RequestMapping("/result")
	public String result(int num1, int num2, int num3) {
		int total = num1 + num2 + num3;
		double tax = (num1 + num2 + num3) * 1.1;
		application.setAttribute("total", total);
		application.setAttribute("tax", tax);
		return "exam03-result";
	}

}