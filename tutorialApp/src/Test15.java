import java.util.Scanner;

public class Test15 {//중요 예상해보기
    static int f1() {
        System.out.println("확인1");
        return 10;
    }
    static void f2(int a) {
        System.out.println("확인2");
        a +=10;
    }
    static int f3(int a, int b) {
        System.out.println("확인3");
        return a+b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=f1();//확인1 출력하고 리턴값인 10 해주고 자료형 int니까 에러x a=10
        int b=f1();// 위에랑 똑같이 b=20
        f2(a);//아무것도 리턴하지는 않지만 f2메소드에서 출력만 함
        System.out.println("확인 4");
        int c =f3(a,b);// f3메소드 해주고 int c= 20(리턴값)
        System.out.println("확인 5");
        System.out.println("a="+a);
        System.out.println("b="+b);
        System.out.println("c="+c);
    }
}
