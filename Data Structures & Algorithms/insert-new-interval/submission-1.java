class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {


        // inserting new interval + merge + sort

        // sortedmERGED

        // add -> newInterval


        // loop over intervals

        //sortedmerged.get(sortedmerged.size() -1)[1] >=  intervals[i][0]

        //




        List<int []> allElements = new ArrayList<>();

        for(int i=0;i<intervals.length;i++){


            if(intervals[i][1] < newInterval[0]){

                allElements.add(intervals[i]);
            }
            else if(intervals[i][0] > newInterval[1]){

                allElements.add(newInterval);

                for(int j=i;j<intervals.length;j++){

                    allElements.add(intervals[j]);
                }

                return allElements.toArray(new int[allElements.size()][]);
            }else{

                newInterval[0] = Math.min(newInterval[0],intervals[i][0]);
                newInterval[1] = Math.max(newInterval[1],intervals[i][1]);

            }
        }

        allElements.add(newInterval);


        return allElements.toArray(new int[allElements.size()][]);

        
        


        


        
    }
}
