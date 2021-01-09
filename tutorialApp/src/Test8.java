import java.util.Scanner;

public class Test8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        int sum = 0;
//        for(int i = 1; i<10; i++) {
//            int a = sc.nextInt();
//            if(a>0) {
//                sum += a;
//            }
//            if(a<0) {
//                System.out.println(sum);
//                break;
//            }
//            if(a == 0) {
//                break;
//            }
//            System.out.println(sum);
//        }
//        int c= sc.nextInt(); 과제 정수 넣는 만큼 *찍기
//        for(int a =0; a<c; a++) {
//            for (int i = 0; i < c - a; i++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        int d = sc.nextInt();// *이랑 " " 해서 역으로 만들어보기
        for(int i = 0;i<d; i++) {
            if(i>=1) {
            for(int b=0; b<i; b++) {
                System.out.print(" ");
            }
        }
            for(int a = 0; a<d-i; a++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

