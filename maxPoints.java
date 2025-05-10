public class maxPoints {

    public static int maxPoints(int[]nums,int k,int n) {
        int lsum=0, rsum=0, maxsum = 0;
        for(int i =0;i<=k-1;i++){
           
            lsum=lsum+nums[i];
        }
        maxsum = lsum;
       int rindex = n-1;
        for(int i=k-1;i>=0;i--){
            lsum=lsum-nums[i]; 
            rsum=rsum+nums[rindex];
            rindex=rindex-1;
            maxsum = Math.max(maxsum,lsum+rsum);
        }
        return maxsum;

        
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6};
        int k = 3;
        int n = nums.length;

        System.out.println(maxPoints(nums, k, n));  // Output: 15
    }
}
// public class maxPoints {

//     public static int maxPoints(int[] nums, int k, int n) {
//         int lsum = 0, rsum = 0, maxsum = 0;
        
//         // Compute left sum of first k elements
//         for (int i = 0; i < k; i++) {
//             lsum += nums[i];
//         }
        
//         maxsum = lsum; // Initially, maxsum is all k elements from left
        
//         int rindex = n - 1;

//         // Sliding window approach: Remove from left and add from right
//         for (int i = k - 1; i >= 0; i--) {
//             lsum -= nums[i];   // Remove last picked left element
//             rsum += nums[rindex]; // Pick right element
//             rindex--;  // Move right index left

//             maxsum = Math.max(maxsum, lsum + rsum); // Update maxsum
//         }

//         return maxsum;
//     }

//     public static void main(String[] args) {
//         int[] nums = {1, 2, 3, 4, 5, 6};
//         int k = 3;
//         int n = nums.length;

//         System.out.println(maxPoints(nums, k, n));  // Output: 15
//     }
// }
