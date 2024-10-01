package egovframework.example.main.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/member")
public class MemberController {

	   @GetMapping("/login")
	   public String login() {
	      System.out.println("로그인페이지 접근성공");
	      return "loginPage";
	   }
	   
	   @GetMapping("/signup")
	   public String signupView() {
	      System.out.println("로그인페이지 접근성공");
	      return "signupPage";
	   }
}