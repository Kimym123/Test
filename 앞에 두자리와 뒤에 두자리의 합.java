import java.util.*;

public class Test {
	public static void main(String[] args) {
		int num=0;
		int sum=0;
		
		System.out.println("���ڸ� �� �Ǵ� ���ڸ� �� ���ڸ� �Է��ϼ��� : ");
		Scanner SC= new Scanner(System.in);
		num = SC.nextInt();
		
		if (num >= 1000 && num<10000) {
			sum = (num/100) + (num%100);
			System.out.print(sum);
		}
		
		else if (num >= 100 && num<1000) {
			sum = (num/10) + (num%10);
			System.out.print(sum);
		}
		else
			System.out.println("���ڸ� �� �Ǵ� ���ڸ� ���� �Է����ּ���.");
	}

}
