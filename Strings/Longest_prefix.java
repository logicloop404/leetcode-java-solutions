
/*
Problem: Longest Common Prefix (LeetCode 14)

Approach:
1. Assume the first string is the common prefix.
2. Compare it with every other string.
3. Keep removing the last character until it matches.
4. Return the remaining prefix.

Time Complexity: O(n × m)
Space Complexity: O(1)

where:
n = Number of strings
m = Average length of a string
*/
class Solution {
    public String longestCommonPrefix(String[] strs) {
        if( strs == null || strs.length == 0 ){
            return "";
        }
        String prefix=strs[0];
        for(int i=1;i<strs.length;i++){
            while(!strs[i].startsWith(prefix)){
                prefix=prefix.substring(0,prefix.length()-1);

                if(prefix.isEmpty()){
                    return "";
                }
            }
        }
        return prefix;

    }
}