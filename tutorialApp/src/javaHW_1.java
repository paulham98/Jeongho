//두 개의 주사위를 던졌을 때, 눈의 합이 6이 되는 모든
//경우의 수를 출력하는 프로그램을 작성하시오.
public class javaHW_1 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6};
        int[] b = {1, 2, 3, 4, 5, 6};
        for(int i =0; i < a.length; i++){
            for(int j = 0; j < b.length; j++){
                int sum = a[i] + b[j];
                if(sum == 6) System.out.println(a[i]+" "+b[j]);
            }
        }


    }
}
