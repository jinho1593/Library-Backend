package egovframework.example.account.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AccountController {
	
	private final JdbcTemplate jdbcTemplate;

	
   // 생성자
	@Autowired
    public AccountController(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
        System.out.println("AccountController 생성자 호출됨");
    }

      @GetMapping("/loginPage")
      public String loginPage() {
         System.out.println("접근성공");
         return "loginPage";
      }
      
      @PostMapping("/checkTest")
      public String checkTestData(Model model) {
    	  
    	  System.out.println("디비 연동 시작");
    	  
          String sql = "SELECT idtest FROM test";
          
          try {
              Integer idtest = jdbcTemplate.queryForObject(sql, Integer.class);
              model.addAttribute("message", "DB에서 idtest 값: " + idtest);
          } catch (Exception e) {
              model.addAttribute("message", "데이터 조회 중 오류 발생: " + e.getMessage());
              e.printStackTrace();
          }

    	  System.out.println("디비 연동 완료");
    	  
          return "loginPage"; // 결과를 loginPage.jsp로 반환
      }
}
