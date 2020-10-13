package Jump2Java;

import java.util.Scanner;

public class Coadup {
	public static void main(String[] args) {
		int a,b,c;
		
		System.out.println("정수 세 개를 입력하세요 : ");
		Scanner SC= new Scanner(System.in);
		a = SC.nextInt();
		b = SC.nextInt();
		c = SC.nextInt();
		
		if (a%2==0) System.out.println(a);
		if (b%2==0) System.out.println(b);
		if (c%2==0) System.out.println(c);

		
	}

}
