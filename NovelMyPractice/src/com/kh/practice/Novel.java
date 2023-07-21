package com.kh.practice;

public class Novel {
	
	String novelBook;
	String rentalName;//빌리는 사람이름
	String rentalId;//빌리는 사람아이디
	String rentalPw;//빌리는 사람비밀번호
	int rentalNumber;//빌리는 사람전화번호 
	String rentalEmail;//빌리는 사람이메일
	String rentalAddress;//빌리는 사람주소
	
	public Novel() {
		
	}
	public Novel(String novelBook, String rentalName,
			String reantalId,
			String rentalPw,int rentalNumber,
			String rentalEmail,String rentalAddress) {
		this.novelBook = novelBook;
		this.rentalName = rentalName;
		this.rentalId = reantalId;
		this.rentalPw = rentalPw;
		this.rentalNumber = rentalNumber;
		this.rentalEmail  = rentalEmail;
		this.rentalAddress= rentalAddress;
	}
	//getter 메소드
	
	public String getnovelBook () {
		return this.novelBook;
	}	
	public String getRentalName() {
		return this.rentalName;
	}
	public String getRentalId() {
		return this.rentalId;
	}
	public String getRentalPw() {
		return this.rentalPw;
	}
	public int getRentalNumber() {
		return this.rentalNumber;
	}
	public String getRentalEmail() {
		return this.rentalEmail;
	}
	public String getrentalAddress() {
		return this.rentalAddress;
	}
	//setter 메소드
	
	public void setNovelBook(String novelBook) {
		this.novelBook = novelBook;
	}
	public void setRentalName(String rentalName) {
		this.rentalName = rentalName;
	}
	public void setRentalId(String rentalId) {
		this.rentalId =rentalId;
	}
	public void setRentalPw(String rentalPw) {
		this.rentalPw =rentalPw;
}
	public void setRentalNumber(int rentalNumber) {
		this.rentalNumber =rentalNumber;
}
	public void setRentalEmail(String rentalEmail) {
		this.rentalEmail =rentalEmail;
}
	public void setRentalAdress(String rentalAddress) {
		this.rentalAddress = rentalAddress;
}
	@Override
	public String toString() {
		return "novelBook : " + this.novelBook + ", "
				+ "rentalName: " + this.rentalName + ", "
				+ "rentalId :"  +this.rentalId +", "
				+ "rentalNumber :" + this.rentalNumber + ", "
				+ "rentalEmail :" + this.rentalEmail + ", "
				+ "rentalAddress :" + this.rentalAddress;

	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return (this.novelBook+this.rentalName+this.rentalId
				+this.rentalNumber+this.rentalEmail+this.rentalAddress).hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Novel) {
			Novel std = (Novel)obj;
			return this.hashCode() == std.hashCode();
		}else {
			return false;
		}
	}
}


