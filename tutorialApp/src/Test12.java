public class Test12 {
    public static void main(String[] args) {
        //[가장 큰 정수 찾기]
        int[] data = {2,3,1,5,4};
        int min=data[0];
        int temp = 0;
        for(int i =1;i<data.length;i++) {
            if(min>data[i]) {
                min=data[i];
                temp= i;
            }
        }
        System.out.println("최솟은"+min+"입니다. ");
        System.out.println("최속값의 index:"+temp);
    }
}
