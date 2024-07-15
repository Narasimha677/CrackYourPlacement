package Arrays;

public class SortColors {
    public void sortColors(int[] nums) {
        int l=0;
        int mid=0;
        int h=nums.length-1;
        while(mid<=h){
            if(nums[mid]==0){
                swap(nums,l,mid);
                mid++;
                l++;
            }
            else if(nums[mid]==1){
                mid++;
            }
            else{
                swap(nums,h,mid);
                h--;
            }
        }


    }
    public void swap(int[] arr,int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
