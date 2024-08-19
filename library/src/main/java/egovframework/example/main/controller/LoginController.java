package egovframework.example.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginController {
	
	private final JdbcTemplate jdbcTemplate;
	
	   @Autowired
	   public LoginController(JdbcTemplate jdbcTemplate) {
		  this.jdbcTemplate = jdbcTemplate;
	      System.out.println("MainController 생성자 호출됨");
	   }

	   @GetMapping("/test")
	   public String mainPage() {
	      System.out.println("접근성공");
	      return "test";
	   }
	   
	   @PostMapping("/checkTest")
	   public String checkTestData(Model model) {
		   
		   System.out.println("디비연동시작");
		   
		   String sql = "SELECT number From test";
		   
		   try {
			   Integer number = jdbcTemplate.queryForObject(sql, Integer.class);
			   model.addAttribute("message", number);
		   } catch (Exception e) {
			   model.addAttribute("message", e.getMessage());
			   e.printStackTrace();
		   }
		   
		   System.out.println("디비연동완료");
		   
		   return "test";
		   
	   }
}