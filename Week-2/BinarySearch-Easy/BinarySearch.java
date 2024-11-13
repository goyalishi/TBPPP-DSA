public class BinarySearch {

    public int search(int[] nums, int target) {
        int strt=0;
        int end=nums.length-1;
        while(strt<=end){
            int mid=(strt+end)/2;
            if(nums[mid]==target){
                return mid;}
            else if(nums[mid]>target){
                end=mid-1;}
            else{
                strt=mid+1;
                }
            }
              return -1;

            
    }
}
