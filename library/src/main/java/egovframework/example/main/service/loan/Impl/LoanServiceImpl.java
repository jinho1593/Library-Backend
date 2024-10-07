package egovframework.example.main.service.loan.Impl;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

import egovframework.example.main.service.loan.LoanService;
import egovframework.example.main.valueobject.loanVO;




@Service("loanService")
public class LoanServiceImpl implements LoanService{

	@Resource(name = "loanServiceMapper")
	private LoanServiceMapper loanServiceMapper;

	@Override
	public boolean loanBook(loanVO VO) {
	    try {
	        loanServiceMapper.insertLoan(VO);
	        return true;
	    } catch (Exception e) {
	        e.printStackTrace();  // 예외 로그 출력
	        return false; 
	    }
	}


}
