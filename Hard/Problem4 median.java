 package Hard;

// 4. Median of Two Sorted Arrays
// Solved
// Hard
// Topics
// premium lock icon
// Companies
// Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.

// The overall run time complexity should be O(log (m+n)).

 

// Example 1:

// Input: nums1 = [1,3], nums2 = [2]
// Output: 2.00000
// Explanation: merged array = [1,2,3] and median is 2.
// Example 2:

// Input: nums1 = [1,2], nums2 = [3,4]
// Output: 2.50000
// Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.
 

// Constraints:

// nums1.length == m
// nums2.length == n
// 0 <= m <= 1000
// 0 <= n <= 1000
// 1 <= m + n <= 2000
// -106 <= nums1[i], nums2[i] <= 106

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int t = nums1.length + nums2.length;
        int total =t;
        int i=0;
        int j=0;
        int gg = total/2;
         int result=0;
         int temp1=0;
         int temp2=0;
        while(total>0){
            int a=Integer.MAX_VALUE;
            int b=Integer.MAX_VALUE;

            if(i<nums1.length){
                a = nums1[i];
            }
            if(j<nums2.length){
                b=nums2[j];
            }
            if(a<b){
                result = a;
                i++;
            }
            else{
                result = b;
                j++;
            }
            total--;
            if(gg == total){
                temp1=result;
            }
            
            if(gg-1 == total){
                temp2=result;
            }
    }
    if(t%2 == 0){
        return (double)(temp1+temp2)/2; 
    }
    else{
        return (double)temp1;
    }
}
}