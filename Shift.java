
import java.util.Scanner;

public class Shift {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("문자열을 입력하세요 : ");
		String input = sc.nextLine();
		
		char[] arr;
		arr = input.toCharArray();
		
		for (int i=0; i<arr.length;i++) {
			if (97<=arr[i] && arr[i]<=122) {
				arr[i] = (char)(arr[i]-32);
			}
			else if (65<=arr[i] && arr[i]<=90) {
				arr[i] = (char)(arr[i]+32);
			}
		}
		
		System.out.println(arr);
		
	}

}
