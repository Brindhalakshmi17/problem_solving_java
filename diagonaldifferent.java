public class diagonaldifferent {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        int sum1 = 0;
        int sum2 = 0;
        for(int i = 0; i < arr.length; i++){
            sum1 += arr[i][i];
            sum2 += arr[i][arr.length - i - 1];
    
}
  int diff=Math.abs(sum1-sum2);
  System.out.println(diff);
    }
}