class KthLargest {
    private PriorityQueue<Integer> que;
    int k;
    public KthLargest(int k, int[] nums) {
        this.k = k;
        this.que = new PriorityQueue<>();
        for (int i = 0; i < nums.length; i++) {
            que.add(nums[i]);
        }
    }
    
    public int add(int val) {
        que.add(val);
        while (que.size() > k)
            que.poll();
        
        return que.peek();
    }
}
