package edu.cnm.deepdive;

public class Array2 {

  public boolean either24(int[] nums) {
    for (int i = 0, j = 1; (j < nums.length && i < nums.length-1); i++, j++) {
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
    public int[] pre4(int[] nums) {
      int j = 0;
      for(i = 0, int k = 0; (k <= j && i < nums.length); i++){
        j++
        if(nums[i] == 4){
          break;
        }
      }
      int dums[j];
      for(; ; k++ ){

      }

    }
  }
}