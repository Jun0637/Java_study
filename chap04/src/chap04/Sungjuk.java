package chap04;

public class Sungjuk {

	public static void main(String[] args) {
		
		int score = 100;
		int num = score/10;
		if (num == 10) {
			num = 9;
		}
		switch (num) {
		case 9:
			System.out.println("A���� �Դϴ�");
			break;
		case 8:
			System.out.println("B���� �Դϴ�");
			break;
		case 7:
			System.out.println("C���� �Դϴ�");
			break;
		case 6:
			System.out.println("D���� �Դϴ�");
			break;
			
		default:
			System.out.println("F���� �Դϴ�");
		}

	}

}