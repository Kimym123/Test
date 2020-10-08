import java.util.Scanner;

public class 직각삼각형 {
	public static void main(String[] args) {
		int num = 0;
		
		System.out.println("홀수를 입력하세요 : ");
		Scanner SC = new Scanner(System.in);
		
		num = SC.nextInt();
		
		for (int i=0;i<num;i++) {
			for (int j=num-i; j>=1;j--) {
				System.out.print("*");
					}
			System.out.println();

				}
			}
		
	}

