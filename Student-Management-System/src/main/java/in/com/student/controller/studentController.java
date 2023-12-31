package in.com.student.controller;




import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;


import in.com.student.entity.Studententity;
import in.com.student.service.studentService;
import jakarta.servlet.http.HttpSession;





@Controller
public class studentController {
	
	@GetMapping("/")
	public String studenthome() {
		return "home.html";
	}
	
	@Autowired
	private studentService service;
	@PostMapping("/register")
	public String studentregister( @ModelAttribute Studententity s ,HttpSession session) {
		    
			service.addStudent(s);
			session.setAttribute("message", "New Student Added Successfully");
			return "redirect:/";
		
		
	}
	@GetMapping("/addstudent")
	public String addStudentPage() {
		return "index";
	}
	@GetMapping("/editstudent/addstudent")
	public String editAddStudentPage() {
		return "index";
	}

	@GetMapping("/viewstudent")
	public String viewStudentPage(Model model ) {
		List<Studententity> std= service.viewStudent();
		model.addAttribute("s",std);
		return "view";
	}
	@GetMapping("/editstudent/viewstudent")
	public String editeditstudentViewstudentiewStudentPage(Model model ) {
		List<Studententity> std= service.viewStudent();
		model.addAttribute("s",std);
		return "view";
	}
	
	
	@GetMapping("/editstudent/{id}")
	public String edit(@PathVariable int id,Model model) {
		Studententity s = service.editStudent(id);
		model.addAttribute("s",s);
		return "editstudent";
	}
	
	@PostMapping("/update")
	public String update(@ModelAttribute Studententity e,Model model, HttpSession session) {
		service.addStudent(e);
		 session.setAttribute("message", "Successfully Updated !");

		return "redirect:/viewstudent";
		
	}
	@GetMapping("/delete/{id}")
	public String delete(@PathVariable int id, HttpSession session) {
		service.deleteStudent(id);
		session.setAttribute("message", "Successfully Deleted !");
		return "redirect:/viewstudent";
	}
	
}

