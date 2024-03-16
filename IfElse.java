import java.util.Scanner;
class IfElse {
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Your Operation: ");
            System.out.println("1: Addition");
            System.out.println("2: Substraction");
            System.out.println("3: Multiplication");
            System.out.println("4: Division");
            int sign=sc.nextInt();
            System.out.println("Enter Your First Number: ");
            int a=sc.nextInt();
            System.out.println("Enter Your Second Number: ");
            int b=sc.nextInt();

            if(sign==1){
                System.out.println("Addition of Both Number is: "+(a+b));
            }
            else if(sign==2){
                System.out.println("Substraction of Both Number is: "+(a-b));
            }
            else if(sign==3){
                System.out.println("Multiplication of Both Number is: "+(a*b));
            }
            else if(sign==4){
                System.out.println("Division of Both Number is: "+(a/2b));
            }
            else{
                System.out.println("Invaild Input");
            }

        }    
}
