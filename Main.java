import java.util.Arrays;

class Main {
  public static void main(String[] args) {
    //Test cases given and one more where all numbers are present
    int[] test1 = {0, 1, 2, 5, 8, 11, 32};
    int[] test2 = {1, 2, 3, 4, 6, 7, 8};
    int[] test3 = {0, 1, 2, 3, 4, 6, 7, 8};
    int[] test4 = {0, 1, 2, 3, 4, 5, 6, 7, 8};
    //Printing out test cases using linear search given and one more where all numbers are present
    System.out.println(MissingLin(test1));
    System.out.println(MissingLin(test2));
    System.out.println(MissingLin(test3));
    System.out.println(MissingLin(test4));
  //Printing out test cases using Binary search given and one more where all numbers are present
    System.out.println(MissingBin(test1));
    System.out.println(MissingBin(test2));
    System.out.println(MissingBin(test3));
    System.out.println(MissingBin(test4));
  }
  public static int MissingLin(int[] numberset){
    //For loop to go though array and check if index matches array
    for (int i = 0; i < numberset.length; i++){
      //logic to test if array index matches content
       if (numberset[i] != i){
         //Missing element locator
         return i;
       }
    }
    //If everything there it adds one
    return numberset.length;
  }
  public static int MissingBin(int[] numberset){
      //For loop to go though array and check if index matches array
    for (int i = 0; i < numberset.length; i++){
      //logic to test if array index matches content
       if (binary(numberset, i) != i){
         //Missing element locator
         return i;
       }
    }
    //If everything there it adds one
    return numberset.length;
  }
  public static int binary(int[] bin, int num) {
    //Initzlize index and set value to -1 if number cannot be found
    //Index can be changed later if found index
    int index = -1;
    //Initzlize lower and upper values
    int low = 0;
    int up = bin.length;
    //Sort array as binary needs to be sorted to work. (if not sorted)
    Arrays.sort(bin);
    //While Loop
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