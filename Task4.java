//Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку. 
//Пользователю должно показаться сообщение, что пустые строки вводить нельзя.
import java.util.InputMismatchException;
import java.util.Scanner;

public class Task4 {
   public static void main(String[] args) throws Exception
   {
        System.out.print("Input string: ");
        Scanner console = new Scanner(System.in);
        String a = console.nextLine();  
        if (a.isEmpty()) throw new Exception("priceField is not entered.");
            
        System.out.println(a);

        
    } 
} 