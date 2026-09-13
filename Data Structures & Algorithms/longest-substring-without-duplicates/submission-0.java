class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 0)
            return 0;
        int left = 0;
        int right = 0;
        int max = 0;
        int curr = 0;
        HashSet<Character> set = new HashSet<>();
        while ((left <= right) && (right < s.length())){
            //System.out.println(left + " " + right + " count: " + curr);
            if (!set.contains(s.charAt(right))) {
                //System.out.println("in the if, " + s.charAt(right));
                set.add(s.charAt(right));
                max = Math.max(max, curr++);
                
            } else {      

                max = Math.max(max, curr);
                while(s.charAt(left) != s.charAt(right)) {
                    //System.out.println("in while b4 \n" + "s.charAt(" + left + "): " + s.charAt(left));
                    set.remove(s.charAt(left));
                    curr--;
                    left++;
                    //System.out.println("after \n" + "s.charAt(" + left + "): " + s.charAt(left) + "\n count: " + curr + " lef: " + left);
                }

                left++;
            }
            right++;
        }
        return max;
    }
}
