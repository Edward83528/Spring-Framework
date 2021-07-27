package gov.vghtpe.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import gov.vghtpe.model.Student;

@Controller
public class StudentController {

	@GetMapping("/student")
	public ModelAndView student(){
		return new ModelAndView("student", "command", new Student());
	}
	
	@PostMapping("/addStudent")
	public String addStudent(@ModelAttribute Student student, Model model){
		
		model.addAttribute("student", student);
		
		return "result";
		
	}
	
}
