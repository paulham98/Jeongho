import java.util.Scanner;

public class codeup_java_1063 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = (a>b) ? a:b;
        System.out.println(c);
    }
}
