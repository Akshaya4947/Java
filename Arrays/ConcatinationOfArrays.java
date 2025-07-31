import java.util.*;
public class ConcatinationOfArrays{
    public static void main(String[] args) {
        int []nums = {1,2,1};
        int []ans = new int[2*nums.length];
        for(int i=0;i<nums.length;i++){
            ans[i]=nums[i];
        }
        int index = nums.length;
        for(int i=0;i<nums.length;i++){
            ans[index]=nums[i];
            index++;
        }
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i] + " ");
        }
    } 
}