package ������;

import java.util.*;

public class Finally {

	public static void main(String[] args) {
		int answer = 0;
		
		System.out.println("�����ϰ� ���� ���α׷��� ���ڸ� �����ּ���.");
		System.out.println("1. ������ ����");
		System.out.println("2. ���Ϳ� ����");
		System.out.println("3. D-day ����");
		
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
			System.out.println("��� : 1,2,3�ܿ� �ٸ� ���ڸ� ������ ������.");
		}
	
	}

}
