package chap04;

import java.util.Scanner;

public class DowileExample {

	public static void main(String[] args) {
		
		System.out.println("�޼����� �Է��ϼ���");
		System.out.println("���α׷��� �����Ϸ��� q�� �Է��ϼ���");
		
		Scanner scanner = new Scanner(System.in);
		String inputString;
		
		do {
			System.out.println(">");
			inputString = scanner.nextLine();
			System.out.println("������������");
		} while(! inputString.equals("q"));
		
		
		
		System.out.println(" ");
		System.out.println("���α׷� ����");

	}

}