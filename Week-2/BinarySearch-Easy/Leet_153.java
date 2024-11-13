public class Leet_153 {
    public int findMin(int[] nums) {
        int st=0;
        int end=nums.length-1;
        int minm=Integer.MAX_VALUE;
        while(st<=end){
            int mid=st+(end-st)/2;

            if(nums[st]<=nums[end]){
                minm=Math.min(nums[st],minm);
                break;
            }
            if(nums[mid]>=nums[st]){
                minm=Math.min(nums[st],minm);
                st=mid+1;
            
            }
            else{
                minm=Math.min(minm,nums[mid]);
                end=mid-1;
            }
             
        }

        return minm;
    }
}
