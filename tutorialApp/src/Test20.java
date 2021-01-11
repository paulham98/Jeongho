class Person{
    String name;
    Person(){
        System.out.println("부모 클래스의 생성자");
    }
    void hi(){
        System.out.println("안녕하세요");
    }
}
class Student extends Person{
    //자식클래스는 부모클래스 메소드를 사용가능하지만 부모클래스에서 자식클래스 메소드는 사용불가
    // 자식클래스에서 기본생성자를 만들면 부모클래스의 기본생성자를 호출한다
    int score;
    Student(){
        System.out.println("자식 클래스의 생성");
    }
    void hi(){
        //부모클래스와 함수의 이름이 같고, (인자도 같은 경우)!!!를 허용해준다.
        //-> 오버라이딩==재정의
    }
    void study(){
        System.out.println("공부중...");
    }
}
public class Test20 {
    public static void main(String[] args) {
        //과제에 비밀번호 체크 함수 넣어보기
        // return->함수 바로 종료
        // pw는 private으로 바꾸기
        //제너레이터: 변수 우클릭하고 제너레이터 클릭 게터나 세터같은 보편적인 메소드 한번에 제공자
        //오버로딩 && 오버라이딩:같은 이름의 함수선언을 허용
        //오버로딩: 인자의 타입 or 갯수가 다르다. 상속xx
        //오버라이딩: 인타의 타입 and 갯수가 동일하다 상속O
        Person p = new Person();
        Student s = new Student();
        s.hi();
        p.hi();
    }
}
