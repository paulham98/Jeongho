import java.util.Scanner;

public class Test10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[] arr = new int[a];
//        for(int i = 0; i<arr.length;i++) {
//            int b = sc.nextInt();
//            arr[i] = b;
//            System.out.print(arr[i]);
//        }
        int sum = 0;
        double avg = 0;
        for (int i = 0; i < arr.length; i++) {
            do {
                System.out.print((i+1) +"번 학생의 점수 입력:");
                arr[i] = sc.nextInt();
            } while (arr[i] < 0 || 100 < arr[i]);
        }
        for(int i =0; i<arr.length; i++) {
            sum += arr[i];
            avg = sum % a;
            if (arr[i] > avg) {
                System.out.print("["+(i+1)+"}");
            }
                    }
        System.out.println("학생은 평균이상의 점수를 받았습니다.");
        System.out.println("총점:"+sum+"평균:"+avg);
    }
}
