import java.util.Scanner;
public class Switch {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your Operation: ");
        System.out.println("1: Addition");
        System.out.println("2:Substraction");
        System.out.println("3:Multiplication");
        System.out.println("4:Division");
        int ch = sc.nextInt();
        System.out.println("Enter Your First Number: ");
        int a = sc.nextInt();
        System.out.println("Enter Your Second Number: ");
        int b = sc.nextInt();
        switch(ch){
            case 1:
                System.out.println("Addition of the number is:"+(a+b));
                break;
            case 2:
                System.out.println("Substraction of the number is:"+(a-b));
                break;
            case 3:
                System.out.println("Multiplication of the number is:"+(a*b));
                break;
            case 4:
                System.out.println("Division of the number is:"+(a/b));
                break;
            default:
                System.out.println("Invalid Input");

            }
        }
    }

