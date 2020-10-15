package baekjoon;

import java.util.Scanner;

// 손익분기점 문제이다.

public class baec_1712 {
	public static void main(String[] args){
		int a, b, c;
		//a는 회사에서 지출하는 월 고정 비용
		//b는 제품 하나 생산하는데 들어가는 재료비와 인건비. 가변 비용
		//c는 제품의 소비자정가 
		
		System.out.println("고정비용, 제품비용, 소비자정가를 차례대로 입력하시오 : ");
		
		Scanner SC = new Scanner(System.in);
		a=SC.nextInt();
		b=SC.nextInt();
		c=SC.nextInt();
		
		int x, y;
		// x는 판매 마진
		// y는 손익 분기점 판매개수
		x= c-b;
		y= (a/x)+1;
		
		System.out.println(y);

	}
}
