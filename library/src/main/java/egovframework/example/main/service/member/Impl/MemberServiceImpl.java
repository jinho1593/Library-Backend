package egovframework.example.main.service.member.Impl;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Service;

import egovframework.example.cmmn.bcrypt.EncryptHelper;
import egovframework.example.main.service.member.MemberService;
import egovframework.example.main.valueobject.memberAllVO;
import egovframework.example.main.valueobject.memberSignupVO;

@Service("memberService")
public class MemberServiceImpl implements MemberService {
	
	@Resource(name = "encrypt")
	public EncryptHelper encryptHelper;

    @Resource(name = "memberServiceMapper")
    private MemberServiceMapper DAO;

    @Override
    public void signupExec(memberSignupVO vo) {
    	vo.setPassword(encryptHelper.encrypt(vo.getPassword()));
    	
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
    
	@Override
	public int login(HttpSession session, String userId, String password) {
		memberAllVO vo = DAO.login(userId);
				
		if (vo == null) {
			System.out.println("정보없음");
			return -1;}
		else {
			if(encryptHelper.isMatch(password, vo.getPassword())) {
				session.setAttribute("userInfo", vo);
				
				System.out.println("로그인 성공");
				return 1;
		
			} else {
				System.out.println("로그인 실패");
				return 0;
			}
		}
	}
    
}

