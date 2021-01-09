/*클래스
1)객체지향언어에서의 기본단위
2)객체화,인스턴스
3)붕어빵클 ->붕어빵
4)클래스:객체 =1:N
 */
class Circle{
    String name;//멤버->객체끼리 값 공유하지않는다
    int radius;//멤버변수, 속성, 필드
    void show(){
        System.out.println(name+"는(은) 반지름이"+radius+"입니다.");
    }
    //Circle()가 생략되어있는건데 이를 생성자라고함
    //생성자.객체화 기본생성자= 디폴트 생성자(생략되있는거) 생성자 오버로딩하면 생략 불
    Circle(){//생성자를 따로 만들어주면 기본 생성자는 디폴트 생성자로 생략시킬수 없음
        System.out.println("기본 생성자");
    }
    Circle(String name, int radius){// 생성자 오버로딩
        this.name = name ;
        this.radius=radius;
    }
}
class Car{
    String name;
    int speed;
    int maxSpeed;
    Car(String name){
        this.name = name;
        System.out.println("이름:"+name);
    }
    Car(String name, int maxSpeed){
        this.name = name;
        this.speed=0;
        this.maxSpeed=maxSpeed;
    }

    void show() {
        System.out.println(this.name+"님의 자동차 현재속도는"+this.speed+", 제한속도는"+this.maxSpeed+"입니다.");
    }
    void speedUp(int a){
        this.speed+=a;
        if(this.speed>this.maxSpeed){
            System.out.println("경고");
            this.speed=this.maxSpeed;
        }
    }
    void speedDown(){
        this.speed-=20;
        if(this.speed<0){
            System.out.println("이미 정지상태입니다.");
        }else System.out.println("속도 :"+this.speed);
    }
    void speedDown(int b){
        this.speed-=b;
        if(this.speed<0){
            System.out.println("이미 정지상태입니다.");
        }else System.out.println("속도 :"+this.speed);
    }
}
public class Test17 {
    public static void main(String[] args) {
       //객체             //생성자->이름은 객체와 이름이 같아야한다
        Circle c1 = new Circle();//Circle()함수는 위에 클래스에 생략되어있는것
        Circle c2 = new Circle("피자",20);
        c1.name="피자";
        c1.radius=20;
        c1.show();
        c2.show();

        Car car1 = new Car("아무무");
        Car car2= new Car("카타리나",150);
        car1.speed=0;
        car1.maxSpeed=100;


        car2.speedUp(60);
        car2.show();
        car2.speedDown();
        car2.speedDown();
        car2.speedDown(30);
        car2.speedDown();
    }
}
