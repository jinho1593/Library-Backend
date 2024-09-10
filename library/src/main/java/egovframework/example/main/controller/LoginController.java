package egovframework.example.main.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

	   @GetMapping("/loginPage")
	   public String mainPage() {
	      System.out.println("로그인페이지 접근성공");
	      return "loginPage";
	   }
}