package com.marketkurly.member.dao;


// 회원 정보 DTO - 저장소

public class MemberDTO {
	private String userid;
	private String userpw;
	private String username;
	private String useremail;
	private String userphone;
	private String useraddress;
	private String userbirth;
	private String locbasic;
	
	public String getLocbasic() {
		return locbasic;
	}
	public void setLocbasic(String locbasic) {
		this.locbasic = locbasic;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getUserpw() {
		return userpw;
	}
	public void setUserpw(String userpw) {
		this.userpw = userpw;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getUseremail() {
		return useremail;
	}
	public void setUseremail(String useremail) {
		this.useremail = useremail;
	}
	public String getUserphone() {
		return userphone;
	}
	public void setUserphone(String userphone) {
		this.userphone = userphone;
	}
	public String getUseraddress() {
		return useraddress;
	}
	public void setUseraddress(String useraddress) {
		this.useraddress = useraddress;
	}
	public String getUserbirth() {
		return userbirth;
	}
	public void setUserbirth(String userbirth) {
		this.userbirth = userbirth;
	}
	
}
