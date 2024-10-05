package egovframework.example.main.service.member;

import egovframework.example.main.valueobject.memberSignupVO;

public interface MemberService {
	public void signupExec(memberSignupVO vo);
	public boolean isUserExists(String userId);
	public boolean isEmailExists(String email);
}
