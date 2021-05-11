class Solution45{
    public int solution(int[] absolutes, boolean[] signs){
        int result =0;
        for(int i = 0; i< absolutes.length; i++ ){
            if(!signs[i]) absolutes[i] *= -1;
            result += absolutes[i];
        }
        System.out.println(result);
        return result;
    }
}
public class Programmers1_45 {
    public static void main(String[] args) {
        Solution45 sol = new Solution45();
        int[] absolutes = { 4, 7, 12};
        boolean[] signs = {true, false, true};
        sol.solution(absolutes, signs);
    }
}
