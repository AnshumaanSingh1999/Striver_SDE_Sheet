/*
Accepted
*/
import java.util.*;
public class search_a_2d_matrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        boolean resp=false;
        int n=matrix.length;
        int m=matrix[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix[i][j]==target){
                    resp=true;
                }
            }
        }
        return resp;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int a[][]=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                a[i][j]=sc.nextInt();
            }
        }
        int target=sc.nextInt();
        search_a_2d_matrix cl=new search_a_2d_matrix();
        boolean r=cl.searchMatrix(a, target);
        String response=r?"True":"False";
        System.out.println(response);
    }
}