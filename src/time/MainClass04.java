package time;

import java.util.Scanner;

public class MainClass04 {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	TimeService ser = new TimeService();
	int num;
	
	
	while(true) {
		System.out.println("1. 시작 시간 설정");
		System.out.println("2. 시작 시간 확인");
		System.out.println("3. 종료 시간 설정");
		System.out.println("4. 종료 시간 확인");
		System.out.println("5. 사용 시간 가져오기");
		System.out.print(">>>");
		num = input.nextInt();
		
		switch(num) {
		case 1:
			ser.setStTime();
			break;
		case 2:
			ser.printStTime();
			break;
		case 3:
			ser.setEndTime();
			break;
		case 4:
			ser.printEndTime();
			break;
		case 5:
			ser.useTime();
			break;
		}
	}
	
	
}
}
