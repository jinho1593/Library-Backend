package egovframework.example.cmmn.bcrypt;

public interface EncryptHelper {
	
	String encrypt(String password);
	
	boolean isMatch(String password, String hashed);
}
