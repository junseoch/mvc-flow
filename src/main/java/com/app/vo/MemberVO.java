package com.app.vo;

import java.util.Objects;

public class MemberVO {

	private Long id;
	private String MemberEmail;
	private String MemberPassword;
	private String MemberName;
	
	public MemberVO() {;}

	public MemberVO(Long id, String memberEmail, String memberPassword, String memberName) {
		super();
		this.id = id;
		MemberEmail = memberEmail;
		MemberPassword = memberPassword;
		MemberName = memberName;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMemberEmail() {
		return MemberEmail;
	}

	public void setMemberEmail(String memberEmail) {
		MemberEmail = memberEmail;
	}

	public String getMemberPassword() {
		return MemberPassword;
	}

	public void setMemberPassword(String memberPassword) {
		MemberPassword = memberPassword;
	}

	public String getMemberName() {
		return MemberName;
	}

	public void setMemberName(String memberName) {
		MemberName = memberName;
	}

	@Override
	public String toString() {
		return "MemberVO [id=" + id + ", MemberEmail=" + MemberEmail + ", MemberPassword=" + MemberPassword
				+ ", MemberName=" + MemberName + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MemberVO other = (MemberVO) obj;
		return Objects.equals(id, other.id);
	}
	
	
}
