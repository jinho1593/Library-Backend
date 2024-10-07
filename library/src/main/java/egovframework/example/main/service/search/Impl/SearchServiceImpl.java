package egovframework.example.main.service.search.Impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egovframework.example.main.service.search.SearchService;
import egovframework.example.main.valueobject.bookVO;

@Service("searchService")
public class SearchServiceImpl implements SearchService{
	
	@Resource(name = "searchServiceMapper")
    private SearchServiceMapper DAO;
	
	@Override
    public List<bookVO> searchBooks(String title) {
            return DAO.selectBooksByTitle(title);
    }
}
