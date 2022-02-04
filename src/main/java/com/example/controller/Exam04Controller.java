package com.example.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.domain.User;
import com.example.form.UserForm;

@Controller
@RequestMapping("/exam04")
public class Exam04Controller {

	@Autowired
	private HttpSession session;

	@ModelAttribute
	public UserForm setUpForm() {
		return new UserForm();
	}

	@RequestMapping("")
	public String index() {
		return "exam04";
	}

	@RequestMapping("/input")
	public String input(@Validated UserForm userForm, BindingResult result, RedirectAttributes redirectAttributes,
			Model model) {
		if (result.hasErrors()) {
			return index();
		}

		User user = new User();
		user.setName(userForm.getName());
		user.setAge(userForm.getIntAge());
		user.setComment(userForm.getComment());

		session.setAttribute("user", user);

		return "exam04-result";
	}
}
