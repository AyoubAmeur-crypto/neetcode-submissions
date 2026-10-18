class Solution {
    public int[][] merge(int[][] intervals) {


        // goal : to merge overlapping elements if they not overlapped no neeed to merge them then finally return a list of intrvals that has non overlapping elements



        // steps 

        // List<int[]> mergedIntervals = new arrayList<>();


        // loop ontervals

        // if(intervals[i][1] >= intervals[i+1][0]){


            // mergedIntervals.add(new int[intervals[i][0],Math.max(intervals[i][1],intervals[i+1][1]))
        
        
        //}

        // mergedIntervals.add(intervals[i])

        




        List<int[]> mergedintervals = new ArrayList<>();

        Arrays.sort(intervals ,(a,b)-> Integer.compare(a[0],b[0]));

        mergedintervals.add(intervals[0]);


        for(int i=0;i<intervals.length  ;i++){


          if( mergedintervals.get(mergedintervals.size() - 1)[1] < intervals[i][0]){

                mergedintervals.add(intervals[i]);
            }else{

                

                mergedintervals.get(mergedintervals.size() - 1)[1] = Math.max(intervals[i][1],mergedintervals.get(mergedintervals.size() - 1)[1]);
                
            }
            

        }


        return mergedintervals.toArray(new int[mergedintervals.size()][]);


        
    }
}
