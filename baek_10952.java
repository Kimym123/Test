package baekjoon;

import java.util.Scanner;

import Jump2Java.sum;

public class baek_10952 {
	
	public static int SUM(int a, int b) {
		return a+b;
	}
	
	public static void main(String[] args) {
		
		int a, b;
		
		System.out.println("�� ���� ������ �Է��Ͻÿ� : ");
		Scanner SC= new Scanner(System.in);
		a = SC.nextInt();
		b = SC.nextInt();
		
		System.out.println(SUM(a,b)); 
		
		
	}
	

}
