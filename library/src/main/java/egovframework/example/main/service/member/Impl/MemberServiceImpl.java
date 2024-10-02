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
        try {
            // 사용자 존재 여부 확인
            if (DAO.isUserExists(vo.getUserId())) {
                // 사용자 존재 시 처리 로직
                System.out.println("해당 사용자가 이미 존재합니다.");
                return; // 사용자가 이미 존재할 경우 더 이상 처리하지 않고 메서드 종료
            }

            // 회원가입 수행
            DAO.insertMember(vo);
            System.out.println("회원가입이 완료되었습니다.");

        } catch (Exception e) {
            // 예외 발생 시 로그를 출력하거나 예외를 처리할 수 있습니다.
            System.err.println("회원가입 중 오류 발생: " + e.getMessage());
            e.printStackTrace();
        }
    }
}

