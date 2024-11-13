public class Leet_1870 {
    public boolean isPossible(double hr,int[]dist,int mid){

        double tot=0;
        for(int i=0;i<dist.length;i++){
            double t=(double)(dist[i])/mid;
            if(t==0.0 || i==dist.length-1)
                tot+=t;
            else tot+=Math.ceil(t);
            if(tot>hr)return false;

        }

        if(tot<=hr) return true;
        else return false;


    }
    public int minSpeedOnTime(int[] dist, double hour) {
        int st=1;
        int end=10000000;

        int speed=0;

        while(st<=end){
            int mid=st+(end-st)/2;
            if(isPossible(hour,dist,mid)){
                speed=mid;
                end=mid-1;
            }
            else st=mid+1;
        }

        if(speed==0)
            return -1;
        else return speed;
    }
}
