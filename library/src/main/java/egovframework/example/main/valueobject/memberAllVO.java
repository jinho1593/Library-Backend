package egovframework.example.main.valueobject;

public class memberAllVO {
	
	private String userId;
	private String password;
	private String name;
	private String email;
	private String phone;
	
	public String getUserId() { return userId; }
	public void setUserId(String userId) { this.userId = userId; }
	
	public String getPassword() { return password; }
	public void setPassword(String password) { this.password = password; }
	
	public String getName() { return name; }
	public void setName(String name) { this.name = name; }
	
	public String getEmail() { return email; }
	public void setEmail(String email) { this.email = email; }
	
	public String getPhone() { return phone; }
	public void setPhone(String phone) { this.phone = phone; }

	@Override
    public String toString() {
        return "memberAllVO{" +
                "name='" + name + '\'' +
                ", userId='" + userId + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                '}'; // 비밀번호는 포함하지 않음
    }

}
