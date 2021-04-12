import java.math.*;
import java.util.Scanner;
class Calc{
    public static int abs(int a) { return a>0 ? a: -a;}
    public static int max(int a, int b) { return (a>b) ? a: b;}
    public static int min(int a, int b ) { return (a>b) ? b: a;}
}
class Rectangle{
    int width;
    int height;
    public int getArea(){
        System.out.println(width*height);
        return width*height;
    }
    public int get(){
        return (2*(width+height));
    }
}
public class CalEx {
    public static void main(String[] args) {
//        System.out.println(Calc.abs(-5));
//        System.out.println(Calc.max(10, 8));
//        System.out.println(Calc.min(-3, -8));
//        System.out.println(Math.abs(-5));
//        System.out.println(Math.max(10,8));
//        System.out.println(Math.min(-10,-8));
        Scanner sc = new Scanner(System.in);
        Rectangle rec = new Rectangle();
        System.out.println("세로: ");
        rec.height = sc.nextInt();
        System.out.println("가로: ");
        rec.width = sc.nextInt();

        System.out.println("사각형의 둘레는"+ rec.get()+"cm 입니다. ");
    }
}
