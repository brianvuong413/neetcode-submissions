class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for (int num: stones) {
            maxHeap.offer(num);
        }
        int num1 = 0;
        int num2 = 0;
        while (!maxHeap.isEmpty() || maxHeap.size() > 1) {
            System.out.println(maxHeap.peek());
            num1 = maxHeap.poll();
            System.out.println(maxHeap.peek());
            if (maxHeap.peek() == null)
                return num1;
            num2 = maxHeap.poll();
            if (num1 != num2) {
                System.out.println("num1-num2" + (num1-num2));
                maxHeap.offer(num1-num2);
            }
        }
        if (maxHeap.size() == 1)
            return num1;
        else return 0;
    }
}
