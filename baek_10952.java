package baekjoon;

import java.util.Scanner;

import Jump2Java.sum;

public class baek_10952 {
	
	public static int SUM(int a, int b) {
		return a+b;
	}
	
	public static void main(String[] args) {
		
		int a, b;
		
		System.out.println("두 개의 정수를 입력하시오 : ");
		Scanner SC= new Scanner(System.in);
		a = SC.nextInt();
		b = SC.nextInt();
		
		System.out.println(SUM(a,b)); 
		
		
	}
	

}
