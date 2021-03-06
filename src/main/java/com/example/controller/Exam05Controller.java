package com.example.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.domain.Member;
import com.example.repository.MemberRepository;

@Controller
@RequestMapping("/exam05")
public class Exam05Controller {

	@Autowired
	private MemberRepository repository;

	@RequestMapping("")
	public String index() {
		return "exam05";
	}

	@RequestMapping("/result")
	public String findByName(String name, Model model) {

		model.addAttribute("name", repository.findByName(name));

		List<Member> nameList = repository.findByName(name);

		model.addAttribute("names", nameList);

		return "exam05-result";
	}
}