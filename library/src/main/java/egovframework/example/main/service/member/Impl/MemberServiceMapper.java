package egovframework.example.main.service.member.Impl;

import org.egovframe.rte.psl.dataaccess.mapper.Mapper;

import egovframework.example.main.valueobject.memberSignupVO;

@Mapper("memberServiceMapper")
public interface MemberServiceMapper {
	boolean isUserExists(String userId);
	
	void insertMember(memberSignupVO vo);

}
