import java.util.Scanner;
public class Reverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your Number: ");
        int res=0;
        int d=0;
        int n=sc.nextInt();
        while(n!=0){
            d = n%10;
            res=res*10+d;
            n = n/10;
        }
        System.out.println("Reversed Number is: "+res);
    }
}
