public class array2 {

  /*
  Given an array length 1 or more of ints, return the difference between the
  largest and smallest values in the array. Note: the built-in Math.min(v1, v2)
  and Math.max(v1, v2) methods return the smaller or larger of two values.
  */
  public static int bigDiff(int[] nums) {
    int min = nums[0];
    int max = nums[0];
    for(int i=1; i<nums.length;i++) {
      if(nums[i] < min) {
        min = nums[i];
      }
    }
    for(int i=1;i<nums.length;i++) {
      if (nums[i] > max) {
        max = nums[i];
      }
    }
    return(max - min);
  }

  /*
  Return the "centered" average of an array of ints, which we'll say is the
  mean average of the values, except ignoring the largest and smallest values
  in the array. If there are multiple copies of the smallest value, ignore just
  one copy, and likewise for the largest value. Use int division to produce
  the final average. You may assume that the array is length 3 or more.
  */

  public static int centeredAverage(int[] nums) {
    if (nums[0] == nums[nums.length-1]) {
      return nums[0];
    }
    int min = nums[0];
    int minIn = 0;
    int max = nums[0];
    int maxIn = 0;
    for(int i=1; i<nums.length;i++) {
      if(nums[i] < min) {
        min = nums[i];
        minIn = i;
      }
    }
    for(int i=1;i<nums.length;i++) {
      if (nums[i] > max) {
        max = nums[i];
        maxIn = i;
      }
    }
  int ans = 0;
  int num = (nums.length-2);;
  for(int i=0; i<=(nums.length-1);i++) {
    if ( (i != minIn) && (i != maxIn)) {
      ans  += nums[i];

    }
  }
  return (ans / num) ;
  }


  public static void main( String[] args) {
    System.out.println(bigDiff(new int[] {10, 3, 5, 6}));
    System.out.println(centeredAverage(new int[] {1, 2, 3, 4, 100}));
    System.out.println(centeredAverage(new int[] {-10, -4, -2, -4, -2, 0}));
  }

}
