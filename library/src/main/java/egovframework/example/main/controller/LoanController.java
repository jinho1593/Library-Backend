package egovframework.example.main.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import egovframework.example.main.service.loan.LoanService;
import egovframework.example.main.valueobject.loanVO;

@Controller
@RequestMapping("/loan")
public class LoanController {

    @Resource(name = "loanService")
    private LoanService loanService;

    @PostMapping("/loanBook")
    public String loanBook(@RequestParam String isbn, HttpSession session, Model model) {
        String userId = (String) session.getAttribute("userId");

        // 유저가 로그인되어 있는지 확인
        if (userId == null) {
            model.addAttribute("errorMessage", "로그인이 필요합니다.");
            return "loginPage";  // 로그인 페이지로 리다이렉션
        }

        // LoanVO 객체에 대출 정보를 설정
        loanVO loan = new loanVO();
        loan.setUserId(userId);
        loan.setIsbn(isbn);
        loan.setLoanDate(new java.util.Date());
        loan.setDueDate(calculateDueDate());
        loan.setReturnDate(null);
        loan.setExtensionCount(0);
        loan.setOverdueDays(0);

        boolean loanSuccess = loanService.loanBook(loan);

        
        if (loanSuccess) {
            model.addAttribute("message", "대출 신청이 완료되었습니다!");
        } else {
            model.addAttribute("errorMessage", "대출 신청에 실패했습니다. 이미 대출된 도서일 수 있습니다.");
        }

        return "main";  // 메인 페이지로 이동
    }

    
    private java.util.Date calculateDueDate() {
        java.util.Calendar cal = java.util.Calendar.getInstance();
        cal.add(java.util.Calendar.DAY_OF_MONTH, 14); // 14일 대출 기간
        return cal.getTime();
    }
}
