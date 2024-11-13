public class BadVersion {

    public boolean isBadVersion(int n) {
        //API that returns true if the version is bad at at leetcode
        return true;
    }
    public int firstBadVersion(int n) {
        int start=1;
        int end=n;
        int frstbadVer=0;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(isBadVersion(mid)){
                frstbadVer=mid;
                end=mid-1;
            }
            else
                start=mid+1;
        }

        return frstbadVer;
    }
}
