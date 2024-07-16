package Arrays;

import java.util.HashMap;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> eleDetails=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int secEle=target-nums[i];
            if(eleDetails.containsKey(secEle)){
                int secIndex=eleDetails.get(secEle);
                return new int[]{secIndex,i};
            }
            eleDetails.put(nums[i],i);
        }
        return new int[]{-1,-1};
    }
}
