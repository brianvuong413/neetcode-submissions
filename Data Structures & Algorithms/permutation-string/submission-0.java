class Solution {
    public boolean checkInclusion(String s1, String s2) {
        String sorted1 = helper(s1);
        String sorted2 = "";
        int l = 0;
        for (int r = s1.length() - 1; r < s2.length(); r++) {
            sorted2 = helper(s2.substring(l++, r+1));
            //System.out.println(l + " " + r);
            //System.out.println(sorted1 + " " + sorted2);
            if (sorted1.equals(sorted2))
                return true;
        }
        return false;
    }
    public String helper(String s) {
        char[] c = s.toCharArray();
        Arrays.sort(c);
        return new String(c);
    }
}
