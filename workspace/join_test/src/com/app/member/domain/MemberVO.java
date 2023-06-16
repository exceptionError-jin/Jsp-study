package com.app.member.domain;

public class MemberVO {
	private Long memberId;
	private String memberIdentification;
	private String memberPassword;
	private String membeName;
	private String memberBirth;
	private String memberPhone;
	private String memberEmail;
	
	public MemberVO() {;}

	

	public Long getMemberId() {
		return memberId;
	}



	public void setMemberId(Long memberId) {
		this.memberId = memberId;
	}



	public String getMemberIdentification() {
		return memberIdentification;
	}



	public void setMemberIdentification(String memberIdentification) {
		this.memberIdentification = memberIdentification;
	}



	public String getMemberPassword() {
		return memberPassword;
	}



	public void setMemberPassword(String memberPassword) {
		this.memberPassword = memberPassword;
	}



	public String getMembeName() {
		return membeName;
	}



	public void setMembeName(String membeName) {
		this.membeName = membeName;
	}



	public String getMemberBirth() {
		return memberBirth;
	}



	public void setMemberBirth(String memberBirth) {
		this.memberBirth = memberBirth;
	}



	public String getMemberPhone() {
		return memberPhone;
	}



	public void setMemberPhone(String memberPhone) {
		this.memberPhone = memberPhone;
	}



	public String getMemberEmail() {
		return memberEmail;
	}



	public void setMemberEmail(String memberEmail) {
		this.memberEmail = memberEmail;
	}

	


	@Override
	public String toString() {
		return "MemberVO [memberId=" + memberId + ", memberIdentification=" + memberIdentification + ", memberPassword="
				+ memberPassword + ", membeName=" + membeName + ", memberBirth=" + memberBirth + ", memberPhone="
				+ memberPhone + ", memberEmail=" + memberEmail + "]";
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((memberId == null) ? 0 : memberId.hashCode());
		return result;
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
		if (memberId == null) {
			if (other.memberId != null)
				return false;
		} else if (!memberId.equals(other.memberId))
			return false;
		return true;
	}
}
