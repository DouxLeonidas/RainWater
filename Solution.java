public class Solution {
  public int getVolume(int[] island) {
    /*

    Ex. 1,3,2,4,1,3,1,4,5,2,2,1,4,2,2


                0
           0111001110
         010101001110
         00010100001000
        000000000000000
    */
    int[] water = waterDistribution(island);
    int res = 0;
    for(int w : water) {
      res += w;
    }
    return res;
  }

  public int[] waterDistribution(int[] island) {
    int[] volume = new int[island.length];
    if (island.length <= 2) return volume;
    int left = 0;
    int right = island.length - 1;
    while (left == 0) left++;
    while (right == 0) right++;
    int leftMax = island[left];
    int rightMax = island[right];
    while (left <= right) {
      if (island[left] < island[right]) {
        if (island[left] > leftMax) {
          leftMax = island[left];
        } else {
          volume[left] = leftMax - island[left];
        }
        left++;
      } else {
        if (island[right] > rightMax) {
          rightMax = island[right];
        } else {
          volume[right] = rightMax - island[right];
        }
        right--;
      }
    }
    return volume;
  }
}