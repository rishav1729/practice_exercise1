import java.util.Scanner;
import java.util.regex.*;
public class emailValidation {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter email id: ");
      String email = sc.next();
      //Regular expression to accept valid email id
      String regex = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+[.]+[a-zA-Z]+$";
      //Creating a pattern object
      Pattern pattern = Pattern.compile(regex);
      //Creating a Matcher object
      Matcher matcher = pattern.matcher(email);
      //Verifying whether given phone number is valid
      if(matcher.matches()) 
         System.out.println("Valid mail id");
       else 
         System.out.println("Invalid mail id");
      
   }
}