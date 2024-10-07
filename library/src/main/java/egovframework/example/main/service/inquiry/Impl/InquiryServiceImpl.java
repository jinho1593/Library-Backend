package egovframework.example.main.service.inquiry.Impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egovframework.example.main.service.inquiry.InquiryService;
import egovframework.example.main.valueobject.inquiryVO;

@Service("inquiryService")
public class InquiryServiceImpl implements InquiryService{

	@Resource(name = "inquiryServiceMapper")
    private InquiryServiceMapper DAO;
	
	@Override
	public void register(inquiryVO vo) {
		DAO.insertInquiry(vo);
	}
	
	 @Override
	 public List<inquiryVO> getAllInquiries() {
	 	return DAO.selectAllInquiries(); 
	 }
}
