import java.util.Scanner;

public class codeup_java_1064 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int min = (a<b? a:b)<c? (a<b?a:b):c;
        System.out.println(min);
        sc.close();
    }
}
