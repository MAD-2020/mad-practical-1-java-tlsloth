import java.util.Scanner;

public class Question2
{
  public static void main(String[] args)
  {
    /**
     * Prompts user for height and weight, calculate and print out the height and weight of the user
     * 
     * Hint: in.nextDouble() to read double
     */
     
    Scanner in = new Scanner(System.in);
    System.out.print("Enter your Height: ");
    double height = in.nextDouble();
    System.out.print("Enter your Weight: ");
    double weight = in.nextDouble();
    double bmi = weight/(height*height);
    String reply = String.format("Your bmi is %.2f.",bmi);
    System.out.print(reply);

  }
}
