import java.util.Scanner;
public class ArithmeticOp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("초를 입력해 주세요 :");
        int time = sc.nextInt();
        int second = time % 60;
        int minute = (time / 60) % 60;
        int hour = (time / 60) / 60;
        System.out.println(time +"초는 "+hour+"시간 "+minute+"분 "+second+"초입니다.");
    }
}
