package chap03;

public class CheckOverflowExample {

	public static void main(String[] args) {
		try {
			int result = safeAdd(200, 20);
			System.out.println(result);
		}   catch(ArithmeticException e) {
			System.out.println(" �����÷ο찡 �߻��Ͽ� ��Ȯ�ϰ� ����Ҽ� ���� ");
		}

	}
	
	public static int safeAdd(int left, int right) {
		if((right>0)) {
			if(left>(Integer.MAX_VALUE - right)) {
				throw new ArithmeticException(" �����÷ο� �߻� ");
			}
		} else {
			if(left>(Integer.MIN_VALUE - right)) {
				throw new ArithmeticException(" �����÷ο� �߻� ");
			}
		}
		return left + right;
	}
}