package Arrays;

public class CeilinginaSortedArray {
    public int ceiling(int[] arr,int target){
        int s=0;
        int e=arr.length-1;
        while(s<e){
            int mid=(s+e)/2;
            if(target>arr[mid]){
                s=mid+1;
            }
            else if(target<arr[mid]){
                e=mid-1;
            }else{
                return mid;
            }
        }
        return e;
    }
}
