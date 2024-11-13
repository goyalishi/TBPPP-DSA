public class Search2DMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row=matrix.length-1;
        int col=matrix[0].length-1;
        // int strt=matrix[0][col];
        // int end=matrix[row][0];
        int i=0,j=matrix[0].length-1;

        while((i<=row && i>=0)&&(j>=0 && j<=col)){
            if(matrix[i][j]>target){
                j--;
            }
            else if(matrix[i][j]<target) i++;
            else{
                return true;
            }

        }
        return false;

    }
}
