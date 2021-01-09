import java.util.Random;
import java.util.Scanner;

public class Test11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        Random rand = new Random();
        int[] data = new int[a];
//        for(int i =0;i<data.length; i++) {
//            data[i] = rand.nextInt(5) + 1;//0~4까지 랜덤으로 1개 뽑아주세요.
//            //0~4 - +1 -> 1~6으로 바뀜
//            // rand.nextInt(랜덤수 가짓수)+시작정수;
//        }
//        for(int i =0;i<data.length; i++) {
//            System.out.print(data[i]+" ");
//        }
        for(int b= 0; a<10; b++) {
            for(int i =0; i<data.length;i++) {
                data[i] = rand.nextInt();
            }
            System.out.print("[ ");
            for(int i=0;i<data.length;i++) {
                System.out.print(data[i]+" ");
            }
            System.out.println("]");

            int cnt=0;
            for(int c=0; c<data.length;c++) {
                for(int i=0; i<data.length;i++) {
                    if (data[i] == a) {
                        cnt++;
                    }
                    if(cnt==0){
                        continue;
                    }
                    System.out.println(a+": "+cnt);
                }
            }
        }
    }
}
