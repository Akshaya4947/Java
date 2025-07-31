import java.util.*;
public class sumOfArray{
    public static void main(String[] args) {
        int []nums = {3,4,5,6};
        int []result = runningSum(nums);
        for(int i=0;i<nums.length;i++){
            System.out.print(result[i]+ " ");
        }
    } 

    static int[] runningSum(int[] nums) {
        int sum = 0;
        int [] answer = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            answer[i]=sum;
        }
        return answer;
    }
}
