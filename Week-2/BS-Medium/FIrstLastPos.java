public class FIrstLastPos {
    public int[] searchRange(int[] nums, int target) {

        int [] indx={-1,-1};
        indx[0]=search(nums,target,true);
        if(indx[0]!=-1){
            indx[1]=search(nums,target,false);
        }

        return indx;}

        int search(int []nums,int target, boolean findFirstIndx){

            int strt=0;
            int end=nums.length-1;
            int ans=-1;  //if target not found

            while(strt<=end){
                int mid=strt+(end-strt)/2;
                if(nums[mid]<target) 
                    strt=mid+1;
                else if(nums[mid]>target)
                    end=mid-1;
                else{
                    ans=mid;
                    if(findFirstIndx)
                        end=mid-1; // for checking more possibility of finding target before mid
                    else
                        strt=mid+1; // for checking more possibility of finding target after mid     
                }   
        }
        return ans;

    }
}
