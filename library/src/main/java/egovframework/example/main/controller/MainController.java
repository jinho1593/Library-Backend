package egovframework.example.main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

   // 생성자
   public MainController() {
      System.out.println("MainController 생성자 호출됨");
   }

   @GetMapping("/main")
   public String mainPage() {
      System.out.println("접근성공");
      return "main";
   }
}