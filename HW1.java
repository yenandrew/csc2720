// Import the scanner for the assignment.
import java.util.Scanner; 
//Import Decimal Format
import java.text.DecimalFormat;
//main class statement, presents the main class for the assignment
class Main {
  public static void main(String[] args) {
    //Create a Scanner object to see what user inputs.
    Scanner scan = new Scanner(System.in); 
    //Prints instruction for user to enter their number.
    System.out.println("Enter number");
    //Provides input area for user
    int number = scan.nextInt(); 
    System.out.println("Enter base");
    int base = scan.nextInt();
    //Output
    System.out.println(sqrt(number,base));


  }
//Square root search method setup
  public static int sqrt(int num, int base) {
    //Initzlize lower and upper values and m
    int low = 0;
    int up = num;
    int m = 0;
    //While loop
    //while the value is lower than the higher value
    while (low <= up){
      
      //Intalize m as mid point, and set m to midpoint of the number divided by 2.
      m= (low + up) / 2;
      //Diag a problem
      //System.out.println(m*m);
      //Check if square is equal to num
      if (power(m, base) == num){
      return m;
      }
      //If num is too high set m as upper bound
      if (power(m, base) > num){
      up = m - 1;
      }
      //If num is too low set m as lower bound
      if (power(m, base) < num){
      low = m + 1;  
      }
      //Diagnose a problem
      //system.out.println(low+ " " + up);
    }
    //shows the square root
    return m;
  }
  
//Power method setup
  public static int power(int base, int exp) {
  //create variable answer to keep base intact
  int answer = base;
  //For loop to multiply exponent by base
    for (int i = 0; i < exp - 1; i++){
      //Update answer variable with answer * base
      answer = answer * base;
      
    }
    return answer;
  }
  
}