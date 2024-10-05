package egovframework.example.main.service.member.Impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egovframework.example.main.service.member.MemberService;
import egovframework.example.main.valueobject.memberSignupVO;



@Service("memberService")
public class MemberServiceImpl implements MemberService {

    @Resource(name = "memberServiceMapper")
    private MemberServiceMapper DAO;

    @Override
    public void signupExec(memberSignupVO vo) {
            // 회원가입 수행
            DAO.insertMember(vo);
            System.out.println("회원가입이 완료되었습니다.");
    }

	@Override
	public boolean isUserExists(String userId) {
		return DAO.isUserExists(userId);
	}

	@Override
	public boolean isEmailExists(String email) {
		return DAO.isEmailExists(email);
	}
    
    
}

