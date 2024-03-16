import java.util.Scanner;
public class Multiples {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("hello");
        int a=sc.nextInt();
        for(int i =1;i<=a;i++){
            if(i%2==0 && i%4!=0){
                System.out.println(i);
            }
        } 
    }
}
