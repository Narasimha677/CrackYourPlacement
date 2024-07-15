package Arrays;

public class FindTheDuplicateNumber {
    public int findDuplicate(int[] nums) {
        int i=0;
        int possAns=-1;
        while(i<nums.length){
            if(nums[i]==i+1){
                i++;
                continue;
            }
            if(nums[i]==nums[nums[i]-1]){
                possAns=nums[i];
                i++;
            }else{
                swap(nums,i,nums[i]-1);
            }

        }
        return possAns;
    }
    public void swap(int[] arr,int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
