package egovframework.example.main.service.member;

import javax.servlet.http.HttpSession;

import egovframework.example.main.valueobject.memberSignupVO;

public interface MemberService {
	public void signupExec(memberSignupVO vo);
	public boolean isUserExists(String userId);
	public boolean isEmailExists(String email);
	public int login(HttpSession session, String userId, String password);
}
