import java.util.Scanner;
import java.util.Arrays;
public class program {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the Size: ");
        int x = scanner.nextInt();
        int[] arr = new int[x];
        System.out.println("Enter the numbers: ");
        for(int i=0;i<x;i++){
            arr[i]=scanner.nextInt();
        }
        System.out.println("Enter the operation: ");
        System.out.println("1:Maximum");
        System.out.println("2:Minimum");
        System.out.println("3:Average");
        int y=scanner.nextInt();
        Arrays.sort(arr);
        int count =0;
        switch (y) {
            case 1:
                System.out.println("Maximum number is: "+arr[x-1]);
                break;
            case 2:
                System.out.println("Minimum number is: "+arr[0]);
                break;
            case 3:
                for(int i=0;i<x;i++){
                    count+=arr[i];
                }
                System.out.println("Average is: "+count/x);
                break;
            default:
                System.out.println("Invaild");
                break;
        }

    }
}
