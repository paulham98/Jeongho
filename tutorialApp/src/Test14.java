import java.util.Scanner;

public class Test14 {
    public static void main(String[] args) {
        //이차원 배열: 안에 요소의 크기 같은것만 넣을수 있다(정방형이라고함)
        Scanner sc = new Scanner(System.in);
        int temp =0;
        int temp2 = 0;
        int[][] arr= new int[3][2];
        for(int j = 0; j<arr.length; j++) {
            System.out.println((j + 1) + "번학생의 점수를 입력합니다.");
            for (int i = 0; i < arr[j].length; i++) {
                System.out.print((i + 1) + "번째 시험 성적 입력 :");
                arr[j][i] = sc.nextInt();
            }
            for (int k = 0; k < arr[j].length; k++) {
                temp += arr[j][k];
                temp2 = temp / arr[j].length;
            }
        }
            System.out.println("총점:"+temp+" 평균:"+temp2);
            System.out.println();
            for(int a=0; a<arr[0].length;a++) {
                int sum = 0;
                System.out.print((a+1)+"번째 시험의 총점은 :");
                for (int i = 0; i < arr.length; i++) {
                    sum += arr[i][a];
                }
                System.out.println(sum);
            }
    }
}
