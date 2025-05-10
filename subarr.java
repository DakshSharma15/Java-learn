public class subarr {
    public static int maxSubarr(int [] arr) {
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;
        for(int num:arr){
            currSum+=num;
            maxSum = Math.max(maxSum, currSum);
            if(currSum<0){
                currSum=0;
            }
        }
      return maxSum;  
    }
    public static void main(String[] args) {
        int[] arr = {-2, -3, 4, -1, -2, 1, 5, -3};
        System.out.println(maxSubarr(arr));
    }

}
