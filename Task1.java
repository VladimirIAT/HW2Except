//Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), 
//и возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению 
//приложения, вместо этого, необходимо повторно запросить у пользователя ввод данных.
import java.util.InputMismatchException;
import java.util.Objects;
import java.util.Scanner;

public class Task1 {
   public static void main(String[] args)
   {
      boolean flag = true;
      while (flag == true) {
         System.out.print("Input number type float: ");
         Scanner console = new Scanner(System.in);

         try {
            float a = console.nextFloat();
            System.out.println(a);
            flag = false;
         } catch (InputMismatchException e) {
            e.printStackTrace();
            System.err.println("Entered value is not an float");
         }  
      } 
   }  
}


