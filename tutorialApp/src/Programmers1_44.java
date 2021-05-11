import java.util.ArrayList;
import java.util.List;

public class Programmers1_44 {
    public static void main(String[] args) {
        //최댓값 구하고
        // 배열 돌려가면서 새로운게 있는지 구분
        int[] nums = {3,3,3,2,2,2};
        int answer = 0;
        int max = nums.length / 2;
        List<Integer> list = new ArrayList<>();
        for(int i =0; i< nums.length; i++) {
            if (!list.contains(nums[i]))
                list.add(nums[i]);
        }
        if(max > list.size()) answer = list.size();
        else if ( max <= list.size()) answer = max;
        System.out.println(answer);
    }
}
