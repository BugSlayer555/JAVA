import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
class DateTime{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the date: ");
        String s = scanner.nextLine();
        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate date = LocalDate.parse(s);
        
        DateTimeFormatter outputFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String formattedDate = date.format(outputFormatter); // Format the date
        
        System.out.println("Formatted Date: " + formattedDate);
    }
}