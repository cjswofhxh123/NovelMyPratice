package com.kh.practice;

import java.util.Scanner;

public class NovelRun {
	public static void main(String[] args) {
		NovelFunction no  = new NovelFunction();
		finish :
		
			while(true) {
				int choice = no.printMenu();
				switch(choice) {
				case 1 : 
					no.NovelrentalInput();
					break;
				case 2 :
					no.Novelrantalreturn();
					break;
				case 3 :
					no.printAllNovel();
					break;
				case 4 :
					no.removeNovelrantal();
					break;
				case 5 :
					no.modifyNovelInfo();
					break;
				case 6 :
					System.out.println("프로그램이 종료되었습니다.");
					break finish;
				default : 
					System.out.println("해당 메뉴는 존재하지 않습니다!");
					break;
				}
			}
		}		
	}