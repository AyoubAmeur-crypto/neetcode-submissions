class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {


        // inserting new interval + merge + sort

        // sortedmERGED

        // add -> newInterval


        // loop over intervals

        //sortedmerged.get(sortedmerged.size() -1)[1] >=  intervals[i][0]

        //




        List<int []> allElements = new ArrayList<>();

        List<int []> merged = new ArrayList<>();


        allElements.add(newInterval);


        


        for(int i=0;i<intervals.length;i++){

            allElements.add(intervals[i]);


        }

        Collections.sort(allElements,(a,b)-> Integer.compare(a[0],b[0]));

        merged.add(allElements.get(0));

        for(int i=1;i<allElements.size();i++){


            if(merged.get(merged.size()-1)[1] >= allElements.get(i)[0]){

                merged.get(merged.size()-1)[1] = Math.max(merged.get(merged.size()-1)[1],allElements.get(i)[1]);
            }else{

                merged.add(allElements.get(i));
            }
        }


        return merged.toArray(new int[merged.size()][]);
        
    }
}
