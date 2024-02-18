/*
Accepted
*/
import java.util.ArrayList;
import java.util.Scanner;
class set_matrix_zeroes{
    public void setZeroes(int[][] matrix) {
        ArrayList<Integer> row=new ArrayList<>();
        ArrayList<Integer> col=new ArrayList<>();
        int m=matrix.length;
        int n=matrix[0].length;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j]==0){
                    row.add(i);
                    col.add(j);
                }
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(row.contains(i) || col.contains(j)){
                    matrix[i][j]=0;
                }
            }
        }
        // Print the altered Matrix
        // for(int i=0;i<m;i++){
        //     for(int j=0;j<n;j++){
        //         System.out.print(matrix[i][j]);
        //     }
        //     System.out.println("");
        // }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        int matrix[][]=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        set_matrix_zeroes cl=new set_matrix_zeroes();
        cl.setZeroes(matrix);
    }
}