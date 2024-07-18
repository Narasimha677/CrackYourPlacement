package Arrays;

public class SetMatrixZeroes {
    public void setZeroes(int[][] matrix) {
        int col0=1;
        for(int r=0;r<matrix.length;r++){
            for(int c=0;c<matrix[r].length;c++){
                if(matrix[r][c]==0){
                    matrix[r][0]=0;
                    if(c!=0){
                        matrix[0][c]=0;
                    }
                    else{
                        col0=0;
                    }

                }
            }
        }
        for(int i=1;i<matrix.length;i++){
            for(int j=1;j<matrix[i].length;j++){
                if(matrix[0][j]==0 || matrix[i][0]==0){
                    matrix[i][j]=0;
                }
            }
        }
        if(matrix[0][0]==0){
            for(int i=0;i<matrix[0].length;i++){
                matrix[0][i]=0;
            }
        }
        if(col0==0){
            for(int i=0;i<matrix.length;i++){
                matrix[i][0]=0;
            }
        }

    }
}
