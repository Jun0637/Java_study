package chap03;

public class BitReverseOperatorExaple {

	public static void main(String[] args) {
		
		int v1 = 10;
		int v2 = ~ v1;
		int v3 = ~ v1+1;
		
		System.out.println(toBinaryString(v1) + " (������ : " + v1 + " )") ;
		System.out.println(toBinaryString(v2) + " (������ : " + v2 + " )") ;
		System.out.println(toBinaryString(v3) + " (������ : " + v3 + " )") ;
		System.out.println();
		
		int v4 = 10;
		int v5 = ~ v4;
		int v6 = ~ v4+1;

	}

	    System.out.println(toBinaryString(v4) + " (������ : " + v1 + " )") ;
}
