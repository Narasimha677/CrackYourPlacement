package Arrays;

public class SearchinRotatedSortedArray {
    public int search(int[] nums, int target) {
        int pivot=pivot(nums);
        int ans=binarySearch(nums,target,0,pivot);
        if(ans==-1){
            ans=binarySearch(nums,target,pivot+1,nums.length-1);
        }
        return ans;


    }
    public int binarySearch(int[] nums,int target,int s,int e){
        while(s<=e){
            int mid=(s+e)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(target>nums[mid]){
                s=mid+1;
            }
            else{
                e=mid-1;
            }
        }
        return -1;
    }
    public int pivot(int[] nums){
        int start=0;
        int end=nums.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(mid<nums.length-1 && nums[mid]>nums[mid+1]){
                return mid;
            }
            if(mid>0 && nums[mid]<nums[mid-1]){
                return mid-1;
            }
            if(nums[start]<nums[mid]){
                start=mid;
            }
            else{
                end=mid-1;
            }
        }
        return -1;
    }
}
