import java.util.Scanner;
class vCar{
    protected int speed = 0;
    protected String name;
    protected int maxSpeed = 0;
    protected String owner;
    protected int cost = 0;
    protected String costPf;

    vCar(String name, String owner){
        this.name = name;
        this.owner = owner;
        System.out.println("자동차 이름:"+name+" 차주 이름: "+owner);
        System.out.println("속도와 제한속도를 설정해주세요");
    }
    vCar(String name){
        this.name = name;
        System.out.println("자동차 이름:"+name);
        System.out.println("차주이름과 속도, 제한속도를 설정해주세요");
    }
    public void show(){
        System.out.println(this.owner +"님의 자동차("+ name +") 현재속도는 "+this.speed+
                "km, 제한속도는 "+this.maxSpeed+"km 입니다.");
        System.out.println("가격: "+cost+"만원 , 연비: "+costPf);
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
        vCar a = new vCar("2020 아반떼", "임준서");
        vCar b = new vCar("2021 테슬라 모델 Y", "함정호");
        vCar c = new vCar("2021 포르쉐 타이칸", "함정호");
        a.speed = 40;
        a.costPf = "14.4km/L";
        a.cost = 1570;

        b.speed = 50;
        b.costPf = "4.8km/kWh";
        b.cost = 6000;

        c.speed = 120;
        c.costPf = " 2,9km/kWh";
        c.cost = 14560;
        a.show();
        b.show();
        c.show();
    }
}
