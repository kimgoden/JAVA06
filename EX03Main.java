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
		System.out.println("���� ȭ��");
		System.out.println("0. ȸ������");
		System.out.println("1. �α���");
		System.out.println("2. ����");
		
		int selectMenu = EX03Main.sc.nextInt();
		
		switch(selectMenu) {
		case 0:// ȸ������
			input();
			break;
		case 1:// �α���
			rogin();
			break;
		case 2://���α׷� ����
			System.out.println("���α׷��� �����մϴ�.");
			System.exit(0);
			break;
		default:
			System.out.println("�߸� �Է��߽��ϴ�.");
			System.out.println("�ٽ� �����ϼ���.");
		
		}
	}
}


private static void rogin() {// �α����ϱ�
	while(true) {
		System.out.println("�α���");
		System.out.println("1. ���̵��Է�");
		System.out.println("2. ��й�ȣ �Է�");
		System.out.println("3. ���� �޴� ���ư���");
		System.out.println("����>");
		
		int selectSubMenu = sc.nextInt();

		switch(selectSubMenu) {
		case 1:// ���̵��Է�
			int membertId = in();
			if(membertId == -1) {
				System.out.println("���̵� ��ȸ�� �� �����ϴ�.");
			}else {
				MEMBER[membertId].info();
			}
			
			break;
		case 2:// ��й�ȣ �Է�
			int membertpw = in();
			if(membertpw == -1) {
				System.out.println("���̵� ��ȸ�� �� �����ϴ�.");
			}else {
				MEMBER[membertpw].info();
			}
			break;
		case 3:
			System.out.println("���� �޴��� ���ư��ϴ�.");
			return;
		default:
			System.out.println("�߸� �Է��߽��ϴ�.");
			System.out.println("�ٽ� �����ϼ���.");
		}
	
	
	
	
	}
	
}






private static void input() {
		System.out.println("ȸ������");
		System.out.println("1. ���̵� �Է�");
		 String id = EX03Main.sc.nextLine();
		System.out.println("2. ��й�ȣ �Է�");
		 String pw = EX03Main.sc.nextLine();
		System.out.println("3. �̸� �Է�");
		String name = EX03Main.sc.nextLine();
		System.out.println("4. ��ȭ��ȣ �Է�");
		String number = EX03Main.sc.nextLine();
		
		MEMBER member = new MEMBER(id,pw,name,number);
		return member;
	}
}

