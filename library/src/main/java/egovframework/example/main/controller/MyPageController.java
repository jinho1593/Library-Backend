package egovframework.example.main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/mypage")
public class MyPageController {

	@GetMapping("/my")
	   public String mainPage() {
	      System.out.println("접근성공");
	      return "mypage";
	   }
	
	@GetMapping("/loanStatus")
	   public String loanStatus() {
	      System.out.println("접근성공");
	      return "loan-status";
	   }
	
	@GetMapping("/reservationStatus")
	   public String reservationStatus() {
	      System.out.println("접근성공");
	      return "reservation-status";
	   }
	
	@GetMapping("/bookshelf")
	   public String bookshelf() {
	      System.out.println("접근성공");
	      return "bookshelf";
	   }
}
