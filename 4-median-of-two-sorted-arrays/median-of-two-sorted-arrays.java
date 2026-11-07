
import java.util.*;

class Solution {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int m = nums1.length;
        int n = nums2.length;

        int[] result = new int[m + n];

        
        for (int i = 0; i < m; i++) {
            result[i] = nums1[i];
        }

        
        for (int j = 0; j < n; j++) {
            result[m + j] = nums2[j];
        }

        
        Arrays.sort(result);

        int total = result.length;


        if (total % 2 == 1) {
            return result[total / 2];
        } 
        else {
            int mid1 = result[total / 2 - 1];
            int mid2 = result[total / 2];

            return (mid1 + mid2) / 2.0;
        }
    }
}
