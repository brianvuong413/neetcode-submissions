class Solution {
    public int[] plusOne(int[] digits) {
        int carryOver = 1;
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = digits.length-1; i >=0; i--) {
            if (digits[i] + carryOver > 9) {
                ans.add(0, (digits[i] + carryOver)%10);
                carryOver = 1;
            }
            else {
                ans.add(0, digits[i] + carryOver);
                carryOver = 0;
            }

        }
        if (carryOver > 0)
            ans.add(0, carryOver);
        return  ans.stream().mapToInt(Integer::intValue).toArray();
    }
}
