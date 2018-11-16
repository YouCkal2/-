package ������;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class ActiveCal extends SameCal { //���� ����
	private String CompleteDate = null;
	private String Adoption = null;
	
	@Override
	public String sameCal(String Adoption,int num) {
		DateFormat dateFormat = new SimpleDateFormat("yyyy MM dd");
		Date date = null;
		try {
			date = dateFormat.parse(Adoption);
		} catch(ParseException e) {
			e.printStackTrace();
		}
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		cal.add(Calendar.DATE, num);
		
		CompleteDate = dateFormat.format(cal.getTime());
	return CompleteDate;
	}
	
	public void ASShow() { //������
		Scanner s = new Scanner(System.in);
		System.out.println("�Կ� ��¥�� �Է����ּ���. (���� YYYY MM DD)");
		Adoption = s.nextLine();
		String result = sameCal(Adoption,36);
		System.out.println("����� ��¥�� "+result+"�Դϴ�.");
	}
	
	public void ASShow(int num) { //���Ϳ�
		Scanner s = new Scanner(System.in);
		System.out.println("�Կ� ��¥�� �Է����ּ���. (���� YYYY MM DD)");
		Adoption = s.nextLine();
		String result = sameCal(Adoption,num);
		System.out.println("����� ��¥�� "+result+"�Դϴ�.");
	}
}