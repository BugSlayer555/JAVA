import java.util.Scanner;
import java.util.Arrays;
public class Arrays1{
    public static void main(String args[]){


        Scanner scan = new Scanner(System.in);
        
        int row1 = scan.nextInt();
        int colum1 = scan.nextInt();
        int[][] arr = new int[row1][column1];
        for(int i=0;i<row1;i++){
            for(int j=0;j<column1;i++){
                arr[i][j] = scan.nextInt();
            
            }
        }    
       
        
        for(int i=4;i>=0;i--){
            System.out.print(arr[i]+" ");
        }
    }
}