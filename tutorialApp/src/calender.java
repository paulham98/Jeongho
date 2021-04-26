import java.util.Calendar;
public class calender {
    calender(int r){
    }
    public static void main(String[] args) {
//        calender cal = new calender();
        //매주 월요일이 몇일인지, 15일은 무슨 요일인지
        Calendar cal = Calendar.getInstance();//  인스턴스가 가진 정보의 날짜는 3월 14일
        String[] calDay = {"일", "월", "화","수","목","금","토"};
        int mon = cal.get(Calendar.MONTH)+1;
        int day = cal.get(Calendar.DATE);
        int hour = cal.get(Calendar.HOUR_OF_DAY);
        int min = cal.get(Calendar.MINUTE);
        int date = cal.get(Calendar.DAY_OF_WEEK); // 1~7; sun ~ saturday
        int week = cal.get((Calendar.WEEK_OF_MONTH));
        String[][] calDate = {{"1","일"},{"2","월"},{"3","화"}, {"4","수"}, {"5","목"}, {"6","금"}, {"7","토"}};
        System.out.println(mon+"월 "+day+ "일"+hour+"시 "+min+"분");
        //3월 15일은 월요일이야, 14일은 일요일
        System.out.println(date);
        while(mon+1 <= 12){
            if(date % 7 == 2){
                System.out.println((mon+1)+"월"+week+"번째주 월요일은"+day+"일 입니다.");
            }
            if(day == 15){
                System.out.println("15일은"+date+"요일 입니다.");
            }
            day++;
            date++;
            mon++;

        }

    }
}
