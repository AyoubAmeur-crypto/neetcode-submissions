class Solution {
    public int characterReplacement(String s, int k) {


        // try to get the longuest distinct substring with the help of k

        // steps


        // int[] count = new int[26]

        // the max frequent element

        // the length - max frequent > k

        // left+=1

        // 


        // 



        int[] count = new int[26];

        int left=0;

        int mostFrequent = 0;

        int maxLength=0;


        for(int i=0;i<s.length();i++){

            count[s.charAt(i) - 'A']++;

            mostFrequent = Math.max(mostFrequent,count[s.charAt(i) - 'A']);


            while((i-left+1)-mostFrequent>k){

                count[s.charAt(left)-'A']--;

                left+=1;


            }


            maxLength = Math.max(maxLength,i-left+1);


        }


        return maxLength;


    }
}
