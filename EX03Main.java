package project07;

import java.util.Scanner;

public class EX03Main {
	static Scanner sc = new Scanner(System.in);
	static EX03[] MEMBER = new EX03[100];
	
	  
	
	public boolean member_create(String id, String name, int pw, int number) {
		for(int i = 0; i< MEMBER.length; i++) {
			if(MEMBER[i] == null) {
				MEMBER[i] = new EX03(id, name, pw, number);
				return true;
			}
		}
		return false;
	}
	
public static void main(String[] args) {
	while(true) {
		System.out.println("메인 화면");
		System.out.println("0. 회원가입");
		System.out.println("1. 로그인");
		System.out.println("2. 종료");
		
		int selectMenu = EX03Main.sc.nextInt();
		
		switch(selectMenu) {
		case 0:// 회원가입
			input();
			break;
		case 1:// 로그인
			rogin();
			break;
		case 2://프로그램 종료
			System.out.println("프로그램을 종료합니다.");
			System.exit(0);
			break;
		default:
			System.out.println("잘못 입력했습니다.");
			System.out.println("다시 선택하세요.");
		
		}
	}
}


private static void rogin() {// 로그인하기
	while(true) {
		System.out.println("로그인");
		System.out.println("1. 아이디입력");
		System.out.println("2. 비밀번호 입력");
		System.out.println("3. 이전 메뉴 돌아가기");
		System.out.println("선택>");
		
		int selectSubMenu = sc.nextInt();

		switch(selectSubMenu) {
		case 1:// 아이디입력
			int membertId = in();
			if(membertId == -1) {
				System.out.println("아이디를 조회할 수 없습니다.");
			}else {
				MEMBER[membertId].info();
			}
			
			break;
		case 2:// 비밀번호 입력
			int membertpw = in();
			if(membertpw == -1) {
				System.out.println("아이디를 조회할 수 없습니다.");
			}else {
				MEMBER[membertpw].info();
			}
			break;
		case 3:
			System.out.println("이전 메뉴로 돌아갑니다.");
			return;
		default:
			System.out.println("잘못 입력했습니다.");
			System.out.println("다시 선택하세요.");
		}
	
	
	
	
	}
	
}






private static void input() {
		System.out.println("회원가입");
		System.out.println("1. 아이디 입력");
		 String id = EX03Main.sc.nextLine();
		System.out.println("2. 비밀번호 입력");
		 String pw = EX03Main.sc.nextLine();
		System.out.println("3. 이름 입력");
		String name = EX03Main.sc.nextLine();
		System.out.println("4. 전화번호 입력");
		String number = EX03Main.sc.nextLine();
		
		MEMBER member = new MEMBER(id,pw,name,number);
		return member;
	}
}

