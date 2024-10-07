package egovframework.example.main.service.search.Impl;

import java.util.List;

import org.egovframe.rte.psl.dataaccess.mapper.Mapper;

import egovframework.example.main.valueobject.bookVO;

@Mapper("searchServiceMapper")
public interface SearchServiceMapper {
	 List<bookVO> selectBooksByTitle(String title);
}
