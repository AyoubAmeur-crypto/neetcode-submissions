class Solution {
    public int characterReplacement(String s, int k) {


        // create 26 uppercase table

        // we loop over each element then increment the one that's got repeated

        // length s - most frequent + k <= total lengh

        // drop the left 


        // max length




        int[] count = new int[26];


        int left =0;


        int mostFrequent=0;
        int maxLength = 0; 


        for(int i=0; i<s.length();i++ ){

            count[s.charAt(i) - 'A']++;


            mostFrequent=Math.max(mostFrequent,count[s.charAt(i) - 'A']);



            while((i-left+1) - mostFrequent > k){

                count[s.charAt(left) - 'A']--;

                left+=1;

            }





            maxLength = Math.max(maxLength,i-left+1);






        }

        return maxLength;

       








        
    }
}
