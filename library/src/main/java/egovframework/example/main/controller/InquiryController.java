package egovframework.example.main.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import egovframework.example.main.service.inquiry.InquiryService;
import egovframework.example.main.valueobject.inquiryVO;

@Controller
@RequestMapping("/inquiry")
public class InquiryController {

	@Resource(name = "inquiryService") 
	private InquiryService inquiryService;

	@GetMapping("/register")
	public String showInquiryRegister() {
		System.out.println("문의등록페이지 접근성공");
		return "inquiryRegister";
	}
	
	@PostMapping("/register")
	public String inquiryRegister(@ModelAttribute inquiryVO vo, Model model) {
		System.out.println("문의 등록 요청");
		
	    inquiryService.register(vo);
	    System.out.println("문의 등록 요청: " + vo.toString());
	    
	    List<inquiryVO> inquiryList = inquiryService.getAllInquiries();
	    model.addAttribute("inquiryList", inquiryList);
	    
	    System.out.println("문의 등록 완료");
		
		return "inquiry";
	}
}
