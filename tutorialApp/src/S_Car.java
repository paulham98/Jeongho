import java.util.Scanner;
class vCar{
    protected int speed;
    protected String name;
    protected int maxSpeed;
    protected String owner;

    vCar(String name, String owner){
        this.name = name;
        this.owner = owner;
        System.out.println("자동차 이름:"+name+" 차주 이름: "+owner+"\n");
        System.out.println("속도와 제한속도를 설정해주세요");
    }
    vCar(String name){
        this.name = name;
        System.out.println("자동차 이름:"+name+"\n");
        System.out.println("차주이름과 속도, 제한속도를 설정해주세요");
    }
    public void show(){
        System.out.println(this.owner +"님의 자동차("+ name +") 현재속도는"+this.speed+
                ", 제한속도는"+this.maxSpeed+"입니다.");
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
public class S_Car {
    public static void main(String[] args) {
        vCar a = new vCar("람보르기니", "임준서");
        vCar b = new vCar("페라리", "함정호");
        a.speed = 40;
        b.speed = 50;
        a.show();
        b.show();
    }
}
