import java.util.Scanner;

public class Test7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int a= sc.nextInt();
//        for(int i = 1; i<=a; i++) {
//            System.out.print(i);
//        }
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = a+b;
        int d = b-a;
        for(int q =a; q<=b; q++) {
            System.out.print(q);
        }
        System.out.println();
        System.out.println(c +" "+ d);
        for(int i = d; d<c; d++) {
            System.out.print(d);
        }
    }
}
