package egovframework.example.main.service.search;

import java.util.List;

import egovframework.example.main.valueobject.bookVO;

public interface SearchService {
	 public List<bookVO> searchBooks(String title);
}
