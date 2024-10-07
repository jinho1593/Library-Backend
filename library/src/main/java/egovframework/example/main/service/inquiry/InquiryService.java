package egovframework.example.main.service.inquiry;

import java.util.List;

import egovframework.example.main.valueobject.inquiryVO;

public interface InquiryService {
	
	void register(inquiryVO vo);
	List<inquiryVO> getAllInquiries();
}
