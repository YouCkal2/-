package 수행평가;
//수료식 날짜 D-day 계산기

import java.util.*;
import java.text.*;

public class D_day {
		public void hmmshow() {
			Scanner s = new Scanner(System.in);
			System.out.println("수료식 날짜를 입력해주세요. (형식 YYYY MM DD)");
			String InCompleteDate = s.nextLine(); //수료식 날짜 입력
		
			SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy MM dd");
			Date today = new Date();
			String ToDate = dateFormat.format(today);
			String TodayDate = ToDate; // 오늘 날짜
		
			try {
				Date dayDate = dateFormat.parse(TodayDate);
				Date CompleteDate = dateFormat.parse(InCompleteDate);
				long difference = CompleteDate.getTime() - dayDate.getTime();
				int dday = (int)(difference / (1000*60*60*24));
			
				System.out.println("오늘은 "+ToDate+"일이며, 수료식까지 "+dday+"일 남았습니다.");
			}catch(Exception e) {
				e.printStackTrace();
		}
	}	
}
 