public class Test16 {
    static int add(int a,int b) {
        System.out.println("확인1");
        return a+b;
    }
    static int add(int a,int b,int c) {
        System.out.println("확인2");
        return a+b+c;
    }
    static double add(double a,double b) {
        System.out.println("확인3");
        return a+b;
    }
    public static void main(String[] args) {
//기능이 서로 유사한 함수들의 이름을 동일하게 정의할수 있다.
//단, 서로의 매개변수 개수 or 타입 or 반환값의 타입이 달라야한다. => overLoading 오버로딩이라고함
// 이름은 같은데 기능을 다르게할때 가능한 상황이많은데 매개변수와 타입 반환값이 다를때만을 오버로딩이라고함
//  이름이 같은 메소드에 기능을 적재하는것 ======>이름같 기능 다름,유사 =>오버로딩

        // 기능이 서로 유사한 함수들의 이름을 동일하게 정의할수있다!
        // 단, 서로의 '매개변수 개수or타입' or '반환값의 타입'이 달라야한다.
        // [오버로딩]★★★
            int a=10;
            int b=20;
            int c=30;
            int num1=add(a,b);
            int num2=add(a,b,c);
            System.out.println(num1+" "+num2);



            double x=1.2;
            double y=2.3;
            double num3=add(x,y);
            System.out.println(num3);


            int kim=10;
            double lee=3.14;
            System.out.println(kim);
            System.out.println(lee);

        }
}
