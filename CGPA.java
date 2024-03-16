import java.util.Scanner;
public class CGPA {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your Marks: ");
        int a=sc.nextInt();
        int ch = a/10;
        switch(ch){
            case 10:
            case 9:
                System.out.println("O");
                break;
            case 8:
                System.out.println("A");
                break;
            case 7:
                System.out.println("B");
                break;
            default:
                System.out.println("Invalid Choice");

        }
    }
}
