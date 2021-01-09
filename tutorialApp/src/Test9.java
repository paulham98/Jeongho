import java.util.Scanner;

public class Test9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int cnt = 0;
        int sum = 0;
        for(int i = 0; i<a; i++) {//홀수의 총합 짝수 입력한 횟수
            System.out.print("정수입력 :");
            int b = sc.nextInt();
            if(b<0) {
                System.out.println("재입력!");
                i--;
                //continue;
            }
            if(b%2==1) {
                sum += b;
            }
            if(b%2==0) {
                cnt++;
            }
        }
        System.out.println("짝수를 입력한 횟수:" +cnt);
        System.out.println("홀수의 총합 :"+sum);
    }
}
