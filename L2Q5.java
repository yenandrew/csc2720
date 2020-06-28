//Import arrays class
import java.util.Arrays; 
//Main class setup.
class Main {
  public static void main(String[] args) {
    //sample array using one provided by class
    int[] testcase = {0, 5, 10};
    //Verify with a test case where modify the arguments
    System.out.print(binary(testcase, 10));
  }
  //Linear search method setup
  public static int linear(int[] lin, int num) {
    //Initzlize index and set value to -1 if number cannot be found
    //Index can be changed later if found index
    int index = -1;
    //Setup a for loop to go through the array and find numbers that match.
    for (int i = 0; i < lin.length; i++){
      //If statement to see if array content matches num
       if (lin[i] == num){
         //Setting index to i as it is the current index postion
         index = i;
       }
    }  
    //shows the point of the index location
    return index;
  }
   //Binary search method setup
  public static int binary(int[] bin, int num) {
    //Initzlize index and set value to -1 if number cannot be found
    //Index can be changed later if found index
    int index = -1;
    //Initzlize lower and upper values
    int low = 0;
    int up = bin.length;
    //Sort array as binary needs to be sorted to work.
    Arrays.sort(bin);
    //While loop
    while (low != up){
      //Intalize m as mid point, and set m to midpoint of array divided by 2.
      int m= (low + up) / 2;
      //Check if bin at index i is equal to num
      if (bin[m] == num){
      return m;
      }
      //escape condition to prevent infinate loop
      else if(low + 1 ==  up){
        break;
      }
      //If num is too high set bin as upper bound
      if (bin[m] > num){
      up = m;
      }
      //If num is too low set bin as lower bound
      if (bin[m] < num){
      low = m;  
      }
    }
    //shows the point of the index location
    return index;
  }
}

