package ������;
//����� ��¥ D-day ����

import java.util.*;
import java.text.*;

public class D_day {
		public void hmmshow() {
			Scanner s = new Scanner(System.in);
			System.out.println("����� ��¥�� �Է����ּ���. (���� YYYY MM DD)");
			String InCompleteDate = s.nextLine(); //����� ��¥ �Է�
		
			SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy MM dd");
			Date today = new Date();
			String ToDate = dateFormat.format(today);
			String TodayDate = ToDate; // ���� ��¥
		
			try {
				Date dayDate = dateFormat.parse(TodayDate);
				Date CompleteDate = dateFormat.parse(InCompleteDate);
				long difference = CompleteDate.getTime() - dayDate.getTime();
				int dday = (int)(difference / (1000*60*60*24));
			
				System.out.println("������ "+ToDate+"���̸�, ����ı��� "+dday+"�� ���ҽ��ϴ�.");
			}catch(Exception e) {
				e.printStackTrace();
		}
	}	
}
 