import java.util.Scanner;
import java.time.format.DateTimeFormatter;
class DateTimeFormatter{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the date: ");
        String s = scanner.nextLine();
        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        System.out.println(s.format(df));
    }
}