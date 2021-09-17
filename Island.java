public class Island {
  int[] heights;

  public Island(int[] heights) {
    this.heights = heights;
  }

  public int[] getHeights() {
    return heights;
  }

  private int getMaxHeight() {
    int max = heights[0];
    for (int i = 1; i < heights.length; i++) {
      max = Math.max(max, heights[i]);
    }
    return max;
  }

  public void draw() {
    int h = getMaxHeight();
    int w = heights.length;
    Solution sol = new Solution();
    int[] volume = sol.waterDistribution(heights);
    for (int col = 0; col < w + 2; col++) {
      System.out.print("🟦");
    }
    System.out.println();
    for (int row = 0; row < h; row++) {
      System.out.print("🟦");
      for (int col = 0; col < w; col++) {
        if ((h - row) <= heights[col]) {
          System.out.print("🟫");
        } else if ((h - row) <= heights[col] + volume[col]) {
          System.out.print("🟩");
        } else {
          System.out.print("🟦");
        }
      }
      System.out.println("🟦");
    }
  }
  
}