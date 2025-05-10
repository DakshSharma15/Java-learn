// import java.util.*;

// public class TcsHorseProblem {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);

//         // Input values
//         System.out.println("Enter the values:");
//         int n = sc.nextInt();
//         int k = sc.nextInt();
//         System.out.println("Enter the array");
//         int[] arr = new int[n];

//         for (int i = 0; i < n; i++) {
//             arr[i] = sc.nextInt();
//         }

//         int sum = 0,  maxi = Integer.MIN_VALUE;

//         // Sliding Window or Brute Force approach
//         for (int i = 0; i < n; i++) {
//             sum = 0; // Reset sum for each new starting point

//             for (int j = i; j < n; j++) {
//                 sum += arr[j];

//                 if (sum <= k) {
//                     int m = j - i + 1;
//                     maxi = Math.max(maxi, m);
//                 } else {
//                     break; // If sum exceeds k, break out of inner loop
//                 }
//             }
//         }

//         // Print the maximum length found
//         System.out.println(maxi);

//         sc.close();
//     }
// }

// // import java.util.*;
// // public class TcsHorseProblem {
// //     public static void main(String args[]) {
// //         Scanner sc = new Scanner(System.in);

// //         // Input values
// //         int n = sc.nextInt();
// //         int k = sc.nextInt();
// //         int[] arr = new int[n];

// //         for (int i = 0; i < n; i++) {
// //             arr[i] = sc.nextInt();
// //         }

// //         int maxLength = 0; // Store the max length of valid subarray

// //         // Brute force approach using two loops
// //         for (int i = 0; i < n; i++) {
// //             int sum = 0; // Reset sum for each new subarray start

// //             for (int j = i; j < n; j++) {
// //                 sum += arr[j]; // Add element to current subarray sum
                
// //                 if (sum < k) { // Check if sum is within limit
// //                     int length = j - i + 1; // Calculate length of current subarray
// //                     maxLength = Math.max(maxLength, length); // Update maxLength
// //                 } else {
// //                     break; // Stop adding more elements if sum exceeds k
// //                 }
// //             }
// //         }

// //         System.out.println(maxLength); // Print the maximum valid subarray length

// //         sc.close();
// //     }
// // }
import java.util.*;

public class TcsHorseProblem {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int maxLength = 0;
        int left = 0, sum = 0;

        for (int right = 0; right < n; right++) {
            sum += arr[right]; // Expand window by adding element at 'right'
            
            while (sum >= k && left <= right) {
                sum -= arr[left]; // Shrink window from 'left'
                left++;
            }

            maxLength = Math.max(maxLength, right - left + 1);
        }

        System.out.println(maxLength);
        sc.close();
    }
}
