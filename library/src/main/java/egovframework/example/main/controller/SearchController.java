package egovframework.example.main.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import egovframework.example.main.service.search.SearchService;
import egovframework.example.main.valueobject.bookVO;

@Controller
@RequestMapping("/search")
public class SearchController {
	
	@Resource(name = "searchService")
    private SearchService searchService;
	
	@GetMapping
	public String searchResults(@RequestParam("query") String title, Model model) {
		
		try {
	        System.out.println("검색어: " + title);

	        List<bookVO> searchResults = searchService.searchBooks(title);
	        System.out.println("검색 결과: " + searchResults);

	        model.addAttribute("searchResults", searchResults);
	        model.addAttribute("query", title);

	        return "searchPage";
	    } catch (Exception e) {
	        // 오류 메시지 모델에 추가
	        model.addAttribute("errorMessage", "검색 중 오류가 발생했습니다: " + e.getMessage());
	        return "searchPage"; // 동일한 페이지로 이동하여 오류 메시지를 표시
	    }
	}
}
