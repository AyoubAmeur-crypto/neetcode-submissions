class Solution {
    public int characterReplacement(String s, int k) {



        int[] tab = new int[26];


        int left =0;


        int mostFrequent =0;


        int length = 0;


        for(int i=0;i<s.length();i++){


            tab[s.charAt(i) - 'A']+=1;


            mostFrequent = Math.max(mostFrequent,tab[s.charAt(i) - 'A']);

            while((i-left+1)-mostFrequent > k){

                tab[s.charAt(left) - 'A']-=1;
                left++;
            }

            length = Math.max(length,i-left+1);
        }


        return length;





        }





        
        
        
        }

        


        

        


      


    

