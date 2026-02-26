package Mid;
// Given a string s, find the length of the longest substring without duplicate characters.

 

// Example 1:

// Input: s = "abcabcbb"
// Output: 3
// Explanation: The answer is "abc", with the length of 3. Note that "bca" and "cab" are also correct answers.
// Example 2:

// Input: s = "bbbbb"
// Output: 1
// Explanation: The answer is "b", with the length of 1.
// Example 3:

// Input: s = "pwwkew"
// Output: 3
// Explanation: The answer is "wke", with the length of 3.
// Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
 

// Constraints:

// 0 <= s.length <= 5 * 104
// s consists of English letters, digits, symbols and spaces.


class Problem3lengthOfLongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        int max =0 ;
        for(int i=0;i<s.length() ;i++){
            Set<Character> cset = new HashSet<>();
            int j=i;
            int count = 0;
            while(j<s.length() && !cset.contains(s.charAt(j)) ){
                cset.add(s.charAt(j));
                count++;
                j++;
            }
            if(max<count){
                max=count;
            }
            cset.clear();
        }
        return max;
    }
}