import java.util.Scanner;

class Card{
    Scanner sc = new Scanner(System.in);
    String user;//사용자이름
    String name;//카드사
    int bal;//잔액
    int pw;//비밀번호
    Card(){
        System.out.println("회원가입을 해주세요.");
        System.out.print("ID :");
        String a = sc.nextLine();
        this.user = a;
        System.out.println("카드사를 선택해주세요:");
        String b = sc.nextLine();
        this.name = b;
    }
    Card(String user, String name){
        this.user = user;
        this.name = name;
        this.pw = 1234;
        this.bal = 0;
        System.out.println("사용자: "+user+"카드사: "+name);
        System.out.println("초기 비밀번호는 1234입니다. 변경해주세요!");
    }
    Card(String user, String name, int pw){
        this.user = user;
        this.name = name;
        this.pw = pw;
        System.out.println("사용자: "+user+"카드사: "+name+"잔액:"+this.bal);
        if(pw == 1234){
            System.out.println("비밀번호를 변경해주세요.");
        }

    }
    Card(String user, String name, int pw, int bal){
        this.user = user;
        this.name = name;
        this.pw = pw;
        this.bal = bal;
        System.out.println("사용자: "+user+"카드사: "+name+"잔액:"+this.bal);
    }
    void deposit(int money){
        this.bal+=money;
    }
    void pay(int price){
        if(price>=10000){
            System.out.println("비밀번호를 확인해주세요"+"\n"+"3회 이상 틀리시면 결제가 불가합니다.");
            System.out.println("PW: ");
            int c = sc.nextInt();
            if(this.pw  != c){
                for(int i=0;i<2; i++) {
                    System.out.println("올바른 비밀번호가 아닙니다. 다시 입력해주세요" + "\n");
                    System.out.print("PW: ");
                    int d = sc.nextInt();
                    if(this.pw ==d){
                        this.bal-= price;
                        break;
                    }
                    System.out.println("결제불가");

                }
            }else {
                this.bal -= price;
                System.out.println("결제되었습니다. 잔액:"+this.bal+"원");
            }
        }
        //1.만약 money가 1만원 이상의 금액이면 비믹번호 확인을 진행해주세요
        //2.2번이상 틀리면 결제할 수 없습니다.
        //3.잔액이 부족하면 결제할 수 없습니다.
    }
    void show(){
        //ㅁㅁ님 00카드 잔약은 ____원입니다.
    }
}
public class Test19 {
    public static void main(String[] args) {
//생성자 종류1.사용자이름, 카드사는 무조건 입력받아야함
//초기엔 잔액은 0원, 비밀번호는 1234로 지정
//2.사용자이름,카드사,비밀번호
//3.사용자이름,카드사,비밀번호,잔액
}
}
