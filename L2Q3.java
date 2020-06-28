// Import the scanner for the assignment.
import java.util.Scanner; 
//main class statement, presents the main class for the assignment
class Main { 
  public static void main(String[] args) { 
    //Create a Scanner object to see what user inputs.
    Scanner scan = new Scanner(System.in); 
    //Prints instruction for user to enter their name.
    System.out.print("What is your name? ");
    //Provides input area for user
    String name = scan.nextLine(); 
    //Provides a while loop which checks if user did not enter text
    //Since it is a string, must use name.equals instead of ==
    while (name.equals("")){
      System.out.print("What is your name? ");
      //Provides input area for user
      name = scan.nextLine();  
    }
    //Prints name with Hello and exclamation mark.
    System.out.println("Hello, " + name + "!");
  }
}