package Arrays;

public class MajorityElement {
    public int majorityElement(int[] nums) {
        int minLength=nums.length/2;
        int ele=0;
        int cnt=0;
        for(int i=0;i<nums.length;i++){
            if(cnt==0){
                cnt++;
                ele=nums[i];
            }
            else if(nums[i]==ele){
                cnt++;
            }
            else{
                cnt--;
            }
        }
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==ele){
                count++;
            }
        }
        if(count>minLength){
            return ele;
        }
        return -1;
    }
}
