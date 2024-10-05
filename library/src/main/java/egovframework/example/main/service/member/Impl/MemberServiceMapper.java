package egovframework.example.main.service.member.Impl;

import org.egovframe.rte.psl.dataaccess.mapper.Mapper;

import egovframework.example.main.valueobject.memberAllVO;
import egovframework.example.main.valueobject.memberSignupVO;

@Mapper("memberServiceMapper")
public interface MemberServiceMapper {
	void insertMember(memberSignupVO vo);
	boolean isUserExists(String userId);
	boolean isEmailExists(String email);
	memberAllVO login(String userId);
}
