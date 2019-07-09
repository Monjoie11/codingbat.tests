package edu.cnm.deepdive;

import java.util.Arrays;

public class Array2 {

  public boolean either24(int[] nums) {
    boolean found2 = false;
    boolean found4 = false;
    for (int i = 0;  i < nums.length-1); i++) {
      if ((nums[i] == 2 && nums[i + 1] == 2) && (nums[j] == 4 && nums[j - 1] == 4)) {
        return false;
      } else if (nums[i] == 2 && nums[i + 1] == 2) {
        return true;
      } else if (nums[j] == 4 && nums[j-1] == 4){
        return true;
      }
    }

    return false;
  }



  public int[] pre4(int[] nums) {
    int[] x {};
    for(int i = 0; i < nums.length; i++){
      if(nums[i]==4){
        x = Arrays.copyOf(nums, i);
        break;
      }
    }
    return x;
  }
}

    public int[] pre4(int[] nums) {
//      int j = 0;
//      for(i = 0, int k = 0; (k <= j && i < nums.length); i++){
//        j++
//        if(nums[i] == 4){
//          break;
//        }
//      }
//      int dums[j];
//      for(; ; k++ ){
//
//      }
//      private static
//    }
  }
}
