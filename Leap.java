import java.util.Scanner;
public class Leap {
    public static void main(String[] args){
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the Year");
            int a=sc.nextInt();
            if(a%4==0 || a%400==0 && a%100!=0){
                
                    System.out.println("Leap Year");
            }
            else{
                System.out.println("This is not a Leap Year");
            }
    }
}
