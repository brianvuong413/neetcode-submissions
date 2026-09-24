/**
 * Definition of Interval:
 * public class Interval {
 *     public int start, end;
 *     public Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */

class Solution {
    public boolean canAttendMeetings(List<Interval> intervals) {
        // sort the list first by 
        Interval[] arr = intervals.toArray(new Interval[0]);
        Arrays.sort(arr, (a, b) -> Integer.compare(a.start, b.start));
        for (int i = 1; i < arr.length; i++) {
            System.out.println(arr[i].start);
            if (arr[i].start < arr[i - 1].end) {
                return false; // overlap found
            }
        }
        return true;
    }


}
