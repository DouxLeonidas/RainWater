class Main {
  public static void main(String[] args) {
    System.out.println("Rain Water");
    Solution sol = new Solution();
    Island[] island = new Island[3];
    island[0] = new Island(new int[]{1,3,2,4,1,3,1,4,5,2,2,1,4,2,2});
    island[1] = new Island(new int[]{0,1,4,6,4,2,3,4,3,2,3,1,0,0});
    island[2] = new Island(new int[]{0,8,0,1,4,7,0,0,2,8,5,1,2,0});
    
    for (int i = 0; i < island.length; i++) {
      System.out.println();
      island[i].draw();
      System.out.println("Solution: " +
                          sol.getVolume(island[i].getHeights()));
    }
  }
}