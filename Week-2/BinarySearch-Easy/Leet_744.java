public class Leet_744 {
    public char nextGreatestLetter(char[] letters, char target) {
        int strt=0;
        int end=letters.length-1;
    
        while(strt<=end){
            int mid=strt+(end-strt)/2;
            if(letters[mid]> target) end=mid-1;
            else if(letters[mid]<=target) strt=mid+1;   
            }
        
            if(strt==letters.length) return letters[0];
            else return letters[strt];
        }
}
