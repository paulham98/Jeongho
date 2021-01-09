import java.util.Random;

public class Test13 {
    public static void main(String[] args) {
//알고리즘 1:
// 정렬을 하는이유:탐색을 용이하게 하기위함!
        //1~10 => [1 2 3 4 5 6 7 8 9 10]
        //->[10 1 3 4 5 2 6 9 8 7] 이러면 찾기 힘드니까
        //: 버블 정렬(거품 정렬)
//        int[] data = {5, 3, 4, 2, 1};
//        for (int a = 0; a < data.length ; a++) {
//            //비교수행자체를 (데이터개수)번==N회전 정
//            for (int i = 0; i < data.length - 1; i++) {
//                //비교하는행위는(데이터개수 -1)번
//                if (data[i] > data[i + 1]) {
//                    //[교환]->임시저장변수
//                    int temp = data[i];
//                    data[i] = data[i + 1];
//                    data[i + 1] = temp;
//                }
//            }
//            for(int i =0; i<data.length; i++) {
//                System.out.print(data[i]+ " ");
//            }
//            System.out.println();
//        }
        int[] arr = new int[5];
        Random rand = new Random();
        for(int i = 0; i<arr.length;i++) {
            arr[i] = rand.nextInt(90)+10;//10부터 90개!->10~99
        }
        for(int i = 0; i<arr.length;i++) {
        System.out.print(arr[i]+ " ");
        }
        System.out.println();
        for(int a = 0; a<arr.length;a++) {
            for(int i =0;i<arr.length-1;i++) {
                if(arr[i]>arr[i+1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
            for(int i =0; i<arr.length; i++) {
              System.out.print(arr[i]+ " ");
            }
            System.out.println();
        }

    }
}
