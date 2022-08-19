class Main {
  public static void main(String[] args) {
  
  int[] nums = {2,5};

  boolean result = no23(nums);

  System.out.println(result);
  }

/*
Exercise 8: No23
Create a method of type boolean called no23 that takes in an integer array “nums”. Given an int array length 2, return true if it does not contain a 2 or 3.
no23([4, 5]) → true
no23([4, 2]) → false
no23([3, 5]) → false
*/

  public static boolean no23(int[] nums) {
//  <code>
    // create a boolean and return at bottom/end
    boolean isNot2Or3 = false;
      if(nums[0]==2 || nums[1]==2){
        return isNot2Or3;
      } else if(nums[0]==3 || nums[1]==3){
        return isNot2Or3;

      }
    //return (nums[i]==2) || (nums[3]==3)
    isNot2Or3 = true;
    return isNot2Or3;
  }

}

//Having trouble solving the problems? After you have made a resonable effort,
//here is a solution: https://vimeo.com/566816556/9ee11eb8ad