package first;

import java.util.Scanner;

public class switch_월표시 {
	public static void main(String[] args) {
		
		String monthStiring = "";
		int month=0;
		
		System.out.println("해당 월을 입력하시오 : ");
		Scanner SC = new Scanner(System.in);
		

		month=SC.nextInt();
		
		switch(month) {
		case 1: monthStiring = "January";
		break;
		case 2: monthStiring = "February";
		break;
		case 3: monthStiring = "March";
		break;
		case 4: monthStiring = "April";
		break;
		case 5: monthStiring = "May";
		break;
		case 6: monthStiring = "June";
		break;
		case 7: monthStiring = "July";
		break;
		case 8: monthStiring = "August";
		break;
		case 9: monthStiring = "September";
		break;
		case 10: monthStiring = "October";
		break;
		case 11: monthStiring = "November";
		break;
		case 12: monthStiring = "December";
		break;
		default: monthStiring = "Invalid month";
		break;
		}
		System.out.println(monthStiring);
	}

}
