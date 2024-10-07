package egovframework.example.main.service.inquiry.Impl;

import java.util.List;

import org.egovframe.rte.psl.dataaccess.mapper.Mapper;

import egovframework.example.main.valueobject.inquiryVO;

@Mapper("inquiryServiceMapper")
public interface InquiryServiceMapper {
	void insertInquiry(inquiryVO vo);
	List<inquiryVO> selectAllInquiries(); 
}
