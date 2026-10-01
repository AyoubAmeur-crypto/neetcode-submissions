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


        if(intervals.size() == 1) return true;


        for(int i=0;i<intervals.size();i++){

            for(int j=i+1;j<intervals.size();j++){



                if(intervals.get(i).end > intervals.get(j).start && intervals.get(j).end > intervals.get(i).start) return false;







            }


        }


        return true;




    }
}
