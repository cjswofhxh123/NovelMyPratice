package com.kh.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NovelFunction {
	List<Novel> nList;
	
	public NovelFunction() {
		nList = new ArrayList<Novel>();
	}	
	
	public int printMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("소설 대여 프로그램");
		System.out.println("1. 소설 대여하기");
		System.out.println("2. 소설 반납하기 ");
		System.out.println("3. 소설대여정보 전체출력하기 ");
		System.out.println("4. 대여소설 삭제하기");
		System.out.println("5. 대여소설 수정하기");
		System.out.println("6. 프로그램 종료하기 ");
		System.out.print("메뉴 입력 : ");
		int choice = sc.nextInt();
		return choice;
	}
//	public int NovelrentalInfo() {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("대여할 소설번호을 선택하세요.");
//		while(true) {
//		int novelInfo = sc.nextInt();
//		switch (novelInfo) {
//		case 1 :
//			System.out.println("소설1을 선택햇습니다.");
//			break;
//		case 2 :
//			System.out.println("소설2을 선택햇습니다.");
//			break;
//		case 3 :
//			System.out.println("소설3을 선택햇습니다.");
//			break;
//		case 4 :
//			System.out.println("소설4을 선택햇습니다.");
//			break;
//
//		}
//		return NovelrentalInput();
//	}

//	}
	public void NovelrentalInput() {
		Scanner sc = new Scanner(System.in);
		System.out.println("대여할 소설이름을 입력하세요");
		String novelBook = sc.next();
		System.out.println("고객님의이름을 입력하세요 :");
		String rentalName = sc.next();
		System.out.println("고객님의 아이디를 입력하세요 : ");
		String rentalId = sc.next();
		System.out.println("고객님의 비밀번호를 입력하세요 : ");
		String rentalPw = sc.next();
		System.out.println("고객님의 전화번호를 입력하세요 : ");
		int rentalNumber = sc.nextInt();
		System.out.println("고객님의 이메일을 입력하세요 : ");
		String rentalEmail = sc.next();
		System.out.println("고객님의 주소를 입력하세요 : ");
		sc.nextLine();	// 개행 제거
		String rentalAddress = sc.nextLine();
		Novel nel = new Novel(novelBook,rentalName,
				rentalId,rentalPw,
				rentalNumber,rentalEmail,
				rentalAddress); 
		nList.add(nel);
		
	}
	public void Novelrantalreturn(){
		System.out.println("소설을 반납하시겟습니까 ");
		Scanner sc = new Scanner(System.in);
		System.out.print("반납할 소설을 선택하세요 : ");
		String novelBook = sc.nextLine();
		for(Novel nel : nList) {
			if(nel.getnovelBook().equals(novelBook)) {
				System.out.printf("반납할 %s 이름 : " + nel.getnovelBook());
			}if(true){
					System.out.println("소설을반납하엿습니다.");
				}
			break;	
		}
		
	}

			
	public void printAllNovel() {
		// 1번째 노래 -> 곡명 : 보고싶다, 가수명 : 김범수
		for(int i = 0; i < nList.size(); i++) {
			Novel novel = nList.get(i);
			System.out.printf("대여한책은 %s이고, 아이디는 %s이며,비밀번호는 %s이고,이름은 %s이고, 이메일은 %s이며, 주소는 %s입니다."
					, (i+1)
					, novel.getnovelBook()
					, novel.getRentalId()
					, novel.getRentalPw()
					,novel.getRentalName()
					,novel.getRentalNumber()
					,novel.getRentalEmail()
					,novel.getrentalAddress());
		}
	}
	public void removeNovelrantal() {
		Scanner sc = new Scanner(System.in);
		System.out.print("삭제할 소설 입력 : ");
		String novel = sc.nextLine();
		for(int i = 0; i < nList.size(); i++) {
			Novel novel1 = nList.get(i);
			if(novel1.getnovelBook().equals(novel)) {
				// mList에서 삭제
				nList.remove(i);
				System.out.println();
				break;	// 삭제 했으면 그만 나와
			
		}
			}
	}
	public void modifyNovelInfo() {
		Scanner sc = new Scanner(System.in);
		System.out.print("수정할 소설이름 입력 : ");
		String Novelbook = sc.nextLine();
		System.out.print("수정할 정보 입력(이름) : ");
		String NovelName = sc.nextLine();
		System.out.print("수정할 정보 입력(아이디) : ");
		String NovelId = sc.nextLine();
		System.out.print("수정할 정보 입력(비밀번호) : ");
		String NovelPw = sc.nextLine();
		System.out.print("수정할 정보 입력(전화번호) : ");
		int NovelNumber = sc.nextInt();
		System.out.print("수정할 정보 입력(이메일) : ");
		String NovelEmail = sc.nextLine();
		System.out.print("수정할 정보 입력(주소) : ");
		String Noveladdress = sc.nextLine();
		Novel modNovel = new Novel(Novelbook, NovelName,NovelId,
				NovelPw,NovelNumber,NovelEmail,Noveladdress);
		for(int i = 0; i < nList.size(); i++) {
			 Novel Novel1 = nList.get(i);
			if(Novel1.getnovelBook().equals(Novelbook)) {
				nList.set(i, modNovel);			
			}
}

}
}