public class SearchInRotatedSortedArr {
    public int search(int[] nums, int target) {
         
         int st=0;
         int end=nums.length-1;
         
         while(st<=end){
             int mid=st+(end-st)/2;
             
             if(nums[mid]==target){
                 return mid;
             }
 
             //Checking which half is sorted
             else if(nums[st]<=nums[mid]){     // ie left half is sorted
                 if(nums[st]<=target && target<nums[mid]){
                     end=mid-1;
                 }
 
                 else{
                     st=mid+1;
                 }
             }
 
             else{                          // right half is sorted
                 if(nums[mid]<target && target<=nums[end]){
                     st=mid+1;
                 }
                 else{
                     end=mid-1;
                 }
             }
         }
             
         return -1;
     }
}
