class Vehicle{
    int speed;
    Vehicle(){ }
    Vehicle(int a){
        this.speed=a;
    }
    void speedUp(int a){
        this.speed+=a;
    }
    void speedDown(int a){
        this.speed-=a;
    }
    void show(){
        System.out.println("현재 속도는 "+this.speed+"입니다.");
    }
}
class Bus extends Vehicle{
    int peo;
    Bus(){
        //부모클래스의 기볺생성자를호출
        //1.부모클래스에 기본생성자를 작성한다.
        //2.부모클래스의 다른생성자를 이용한다.
        super(0);
//        super.speed;
    }
    Bus(int a){
        super(a);
    }
    Bus(int a, int b){
        this.speed=a;
        this.peo=b;
    }
    void move(int a){
        this.peo+=a;
    }
    void show(){
        System.out.println("현재속도는: "+this.speed+", 현재 인원은 "+this.peo+"명 입니다.");
    }
}
public class Test21 {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle(80);
        Bus b1 = new Bus(80, 8);
        v1.show();
        b1.show();
    }
}
