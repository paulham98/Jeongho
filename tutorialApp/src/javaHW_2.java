//Math.random()을 이용해서 1부터 6사이의 임의의 정수
//를 변수 value에 저장하는 코드를 완성하라.
import java.util.Random;

public class javaHW_2 {
    public static void main(String[] args) {
        Random rand = new Random();
        int value = rand.nextInt(6);
        ++value;
        System.out.println(value);
    }
}
