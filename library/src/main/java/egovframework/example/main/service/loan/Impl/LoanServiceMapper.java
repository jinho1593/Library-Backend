package egovframework.example.main.service.loan.Impl;

import org.egovframe.rte.psl.dataaccess.mapper.Mapper;

import egovframework.example.main.valueobject.loanVO;


@Mapper("loanServiceMapper")
public interface LoanServiceMapper {
	void insertLoan(loanVO VO);
}
