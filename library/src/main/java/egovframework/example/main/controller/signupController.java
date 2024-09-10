package egovframework.example.main.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/signup")
public class signupController {

    @GetMapping("/page")
    public String signupPage() {
    	System.out.println("회원가입 접근성공");
        return "signupPage";
    }
}
