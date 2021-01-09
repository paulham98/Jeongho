import java.util.EnumSet;
import java.util.Scanner;

public class Test6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0; //총합
        int cnt = 0; //평균
        while(true) {
            System.out.print("정수입력: ");
            int num =sc.nextInt();
            if(num == 0) {
                break;
            }
            sum += num;
            cnt++;
        }
        double avg = sum/cnt;
        System.out.println("총합 :"+sum + ". 평균은 :" + avg);
     }
}
