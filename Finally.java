package 수행평가;

import java.util.*;

public class Finally {

	public static void main(String[] args) {
		int answer = 0;
		
		System.out.println("실행하고 싶은 프로그램의 숫자를 눌러주세요.");
		System.out.println("1. 현역용 계산기");
		System.out.println("2. 공익용 계산기");
		System.out.println("3. D-day 계산기");
		
		Scanner a = new Scanner(System.in);
		answer = a.nextInt();
		
		if(answer == 1) {
			ActiveCal Act = new ActiveCal();
			Act.ASShow();
		} 
		
		else if(answer == 2) {
			ActiveCal Social = new ActiveCal();
			Social.ASShow(28);
		}
		
		else if(answer == 3) {
			D_day Dday = new D_day();
			Dday.hmmshow();
		}
		
		else {
			System.out.println("경고 : 1,2,3외에 다른 숫자를 누르지 마세요.");
		}
	
	}

}
