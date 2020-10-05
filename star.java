
class star{
	public static void main(String[] args) {
		//문제 1번
		
		for (int i=1;i<=8;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
		
		System.out.print("===================================\n");
		
		//문제 2번
		
		for (int i=1 ; i<=7; i++) {
			
			if (i>4) {
				for (int j=1; j<=8-i;j++) {
					System.out.print("*");
				}
			}
			
			
			else {
				for (int j = 1; j<=i; j++) {
					System.out.print("*");
				}
			}
			
			System.out.print("\n");
		}
		
		
		System.out.print("===================================\n");
		
		//문제 3번
		
		for (int i=0;i<6;i++) {
			for(int j=1;j+i<7;j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
		
		System.out.print("===================================\n");
		
		// 문제 4번
		
		for (int i=1;i<101;i++) {
			if (i%2==1) {
				System.out.print(i);
				System.out.print("\n");
			}
		}
		
		System.out.print("===================================\n");

		// 문제 5번
		
		for (int i=1;i<101;i++) {
			if (i%2==0 && i%3==0){
				System.out.print(i);
				System.out.print("\n");
			}
		}
		
		System.out.print("===================================\n");

		// 문제 6번
		
		for (int i=1;i<=11;i++) {
			if(i>=6) {
				for (int j=1;j<=i-5;j++) {
					System.out.print("*");
				}
			}
			
			else {
				for (int j=1;j<=7-i;j++) {
					System.out.print("*");

				}
			}
			System.out.print("\n");
		}
		
		
	}
}