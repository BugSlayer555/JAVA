import java.util.Scanner;
public class Greater {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println(-(-20));
        System.out.println("Enter Your Number: ");
        int a=sc.nextInt();
        System.out.println("Enter Your Second Number: ");
        int b=sc.nextInt();
        int c;
        int d;
        if(a>100){
            c = a-100;
        }
        else{
            c = 100-a;
        }
        if(b>100){
            d=a-100;
        }
        else{
            d=100-a;

        }
        if(c>d){
            System.out.println(b);
        }
        else{
            System.out.println(a);
        }
    }
}
