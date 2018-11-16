package 수행평가;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class ActiveCal extends SameCal { //수료 계산기
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
	
	public void ASShow() { //현역용
		Scanner s = new Scanner(System.in);
		System.out.println("입영 날짜를 입력해주세요. (형식 YYYY MM DD)");
		Adoption = s.nextLine();
		String result = sameCal(Adoption,36);
		System.out.println("수료식 날짜는 "+result+"입니다.");
	}
	
	public void ASShow(int num) { //공익용
		Scanner s = new Scanner(System.in);
		System.out.println("입영 날짜를 입력해주세요. (형식 YYYY MM DD)");
		Adoption = s.nextLine();
		String result = sameCal(Adoption,num);
		System.out.println("수료식 날짜는 "+result+"입니다.");
	}
}