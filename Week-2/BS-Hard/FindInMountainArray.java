interface MountainArray{
   
    public int get(int index);
    public int length();
}

public class FindInMountainArray {
    public static int findPeak(MountainArray mountainArr){
        int start=0;
       int end=mountainArr.length()-1;
       
       while(start<end){
           int mid=start+(end-start)/2;
           if(mountainArr.get(mid+1)>mountainArr.get(mid))
               start=mid+1;
           else
               end=mid;
           
       }
       return start;
   }

  public static int find_Target(MountainArray mountainArr,int target,int start,int end){
      
       boolean isAsc=mountainArr.get(start)<mountainArr.get(end);
       while(start<=end){
           int mid=start+(end-start)/2;
           if(mountainArr.get(mid)==target)
                   return mid;
           if(isAsc){
               if(mountainArr.get(mid)<target) start=mid+1;
               else
                   end=mid-1;
           }
           else{
               if(mountainArr.get(mid)<target) end=mid-1;
               else
                   start=mid+1;
           }
           
       }

       return -1;

   }
   public int findInMountainArray(int target, MountainArray mountainArr) {
       int peak=findPeak(mountainArr);
       int firstTry=find_Target(mountainArr,target,0,peak);
       if(firstTry!=-1)
           return firstTry;
       else
           return find_Target(mountainArr,target,peak+1,mountainArr.length()-1);
   

        
   }
}
