package egovframework.example.main.controller;

import javax.servlet.http.HttpSession;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import egovframework.example.main.service.member.MemberService;
import egovframework.example.main.valueobject.memberSignupVO;

@Controller
@RequestMapping("/member")
public class MemberController {
	
	@Resource(name = "memberService")
    private MemberService memberService;

	 @GetMapping("/login")
	 public String showLoginPage() {
		System.out.println("로그인페이지 접근성공");

	    return "loginPage";
	 }
	 
	 @PostMapping("/login")
	 public String login(Model model, HttpSession session, @RequestParam String userId, @RequestParam String password) {
	     System.out.println("로그인 메서드 호출됨 - userId: " + userId + ", password: " + password);
	     
	     // 이미 로그인한 경우, 메인 페이지로 리다이렉트
	     if (session.getAttribute("userInfo") != null) {
	         System.out.println("이미 로그인된 사용자입니다.");
	         return "redirect:/main";  
	     }
	     
	     int result = memberService.login(session, userId, password);
	     System.out.println("로그인 결과: " + result); // 결과 확인
	     System.out.println("세션에 저장된 userInfo: " + session.getAttribute("userInfo"));

	     if (result == 1) {
	         session.setAttribute("userId", userId); // 여기서 userId 저장
	         System.out.println("로그인 성공, 메인 페이지로 리다이렉트합니다.");
	         return "redirect:/main"; // 로그인 성공 시 메인 페이지로 이동
	     } else {
	         System.out.println("로그인 실패: 존재하지 않는 아이디거나 비밀번호가 틀렸습니다.");
	         model.addAttribute("errorMessage", "존재하지 않는 아이디거나 비밀번호가 틀렸습니다.");
	         return "loginPage"; // 로그인 페이지로 이동
	     }
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
            
            return "signupPage";
        }

        
        return "redirect:/main";
    }
	
	@PostMapping("/checkUserId")
	@ResponseBody
	public String checkUserId(@RequestParam String userId) {
		return String.valueOf(memberService.isUserExists(userId));
	}
	
	@PostMapping("/checkEmail")
	@ResponseBody
	public String checkEmail(@RequestParam String email) {
		return String.valueOf(memberService.isEmailExists(email));
	}
	
	

	@GetMapping("/logout")
	public String logout(Model model, HttpSession session) {
		session.invalidate();
		
		return "main";
	}	
}