import java.io.Console;
import java.util.Scanner;

public class Practice
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      Console cons = System.console();

      System.out.print("Testing: ");
      String response = in.nextLine();

      System.out.println("Response is: " + response);

      String username = cons.readLine("Username: ");
      char[] password = cons.readPassword("Password: ");

      System.out.print(password.toString() + username);
      in.close();
   }
}
