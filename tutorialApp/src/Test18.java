class Point{
    String color;
    int x;
    int y;
    Point(){
        this("검정",0,0);//자기자신.본인==생성자
//        this.color="검정";
//  ->    this.x=0;
//        this.y=0;
        System.out.println(this.color+"("+this.x+","+this.y+")");
    }
    Point(int a, int b){
        this.color="검정";
    this.x+=a;
    this.y+=b;
    }
    Point(String color){
        this.color=color;
        this.x=0;
        this.y=0;
    }
    Point(String color, int a, int b){
        this.color=color;
        this.x=a;
        this.y=b;
    }
    void move() {
        this.x++;
        this.y++;
    }
    void move(int a) {
        this.x+=a;
        this.y+=a;
    }
    void move(int a, int b){
        this.x+=a;
        this.y+=b;
    }
    void show() {
        System.out.println(this.color+"("+this.x+","+this.y+")");
    }
}
public class Test18 {
    public static void main(String[] args) {
        Point p1=new Point(10,20);
        Point p2=new Point("빨강");//문제있음
        Point p3=new Point("분홍",1,2);
        Point p4=new Point();

        p1.move();
        p2.move(100);
        p3.move(11,22);

        p1.show();
        p2.show();
        p3.show();
        p4.show();

    }
}
