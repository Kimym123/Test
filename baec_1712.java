package baekjoon;

import java.util.Scanner;

// ���ͺб��� �����̴�.

public class baec_1712 {
	public static void main(String[] args){
		int a, b, c;
		//a�� ȸ�翡�� �����ϴ� �� ���� ���
		//b�� ��ǰ �ϳ� �����ϴµ� ���� ����� �ΰǺ�. ���� ���
		//c�� ��ǰ�� �Һ������� 
		
		System.out.println("�������, ��ǰ���, �Һ��������� ���ʴ�� �Է��Ͻÿ� : ");
		
		Scanner SC = new Scanner(System.in);
		a=SC.nextInt();
		b=SC.nextInt();
		c=SC.nextInt();
		
		int x, y;
		// x�� �Ǹ� ����
		// y�� ���� �б��� �ǸŰ���
		x= c-b;
		y= (a/x)+1;
		
		System.out.println(y);

	}
}
