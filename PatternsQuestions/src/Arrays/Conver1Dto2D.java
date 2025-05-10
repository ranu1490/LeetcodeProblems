package Arrays;

public class Conver1Dto2D {
    public int[][] construct2DArray(int[] original, int m, int n) {
        if(original.length != m*n)
            return new int[0][0];

        int [][] res=new int[m][n];
        int i=0,j=0;
        for(int num:original){
            res[i][j++]=num;
            if(j==n){
                i++;
                j=0;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Conver1Dto2D conver1Dto2D = new Conver1Dto2D();
        int [] original = {1,2,3,4};
        conver1Dto2D.construct2DArray(original,2,2);

    }
}
