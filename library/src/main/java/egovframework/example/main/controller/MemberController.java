package egovframework.example.main.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import egovframework.example.main.service.member.MemberService;
import egovframework.example.main.valueobject.memberSignupVO;

@Controller
@RequestMapping("/member")
public class MemberController {
	
	@Resource(name = "memberService")
    private MemberService memberService;

	@GetMapping("/login")
	public String login() {
	   System.out.println("로그인페이지 접근성공");
	   return "loginPage";
	}
	   
	@GetMapping("/signup")
	public String signupView() {
	   System.out.println("회원가입페이지 접근성공");
	   return "signupPage";
	}
	
	@PostMapping("/signup")
    public String SignupExec(@ModelAttribute memberSignupVO vo, Model model) {
        try {
            memberService.signupExec(vo); // 회원가입 수행
            System.out.println("회원가입 성공: " + vo.getUserId());
        } catch (Exception e) {
            System.err.println("회원가입 중 오류 발생: " + e.getMessage());
            e.printStackTrace();
            // 예외가 발생하면 회원가입 페이지로 다시 이동
            return "signupPage";
        }

        // 회원가입 성공 시 리다이렉트를 사용하여 메인 페이지로 이동
        return "redirect:/main";
    }
}