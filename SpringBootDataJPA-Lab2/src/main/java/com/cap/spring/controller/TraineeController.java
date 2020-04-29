package com.cap.spring.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.cap.spring.model.Customer;
import com.cap.spring.model.Trainee;
import com.cap.spring.service.CustomerService;
import com.cap.spring.service.TraineeService;


@Controller
public class TraineeController {
	
	@Autowired
	TraineeService ts;
	@Autowired
	CustomerService cs;
	@Autowired
	Trainee t;
	
	@RequestMapping("/")
	public String show() {
		return "login";
	}
	
	@RequestMapping("/login")
	public String loginCustomer(@ModelAttribute Customer c) {
		if (cs.findByUserPass(c.getUserName(), c.getPassword()) != null) {
			return "home";
			}
		else {
			return "login";
			}	
		}
	
	@GetMapping("/form")
	public ModelAndView form() {
		ModelAndView mv=new ModelAndView("form");
		mv.addObject("trainee", t);
		return mv;
	}
	
	@PostMapping("/save")
	public String save(@ModelAttribute("trainee") Trainee theTrainee) {
		ts.addTrainee(theTrainee);
		return "home";
	}
	
	@RequestMapping("/delete")
	public String delete() {
		return "delete";
	}
	
	@GetMapping("/deleteTrainee")
	public String deleteTrainee(@RequestParam int traineeid, Model m) {
		ts.deleteTrainee(traineeid);
		m.addAttribute(ts.retrieve());
		return "home";
	}
	
	@RequestMapping("/modify")
	public String modify() {
		return "modify";
	}
	
	@PostMapping("/updateTrainee")
	public String updateTrainee(@RequestParam int traineeid,Model m) {
		m.addAttribute(ts.editTrainee(traineeid));
		return "/";
	}
	
	@GetMapping("/update")
	public ModelAndView update(@RequestParam int traineeid, Model m) {
	ModelAndView mv=new ModelAndView("update");
	mv.addObject(ts.editTrainee(traineeid));
	mv.addObject("updateTrainee", t);
	return mv;
		}
	
	@RequestMapping("/retrieve")
	public String retrieve() {
		return "retrieve";
	}
	
	@RequestMapping("/retrieveTrainee")
	public String retrieveTrainee(@RequestParam Model m) {
		m.addAttribute(ts.retrieve());
		m.addAttribute("ReTrainee", t);
		return "retrieveTrainee";
	}
	

	@GetMapping("/allDetails")
	public String listTrainees(Model theModel) {
		List<Trainee> theTrainees = ts.retrieve();
		theModel.addAttribute("trainees", theTrainees);
		return "retrieveAll";

	}

}

