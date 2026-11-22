class Solution {
    public int characterReplacement(String s, int k) {


        // topic is sliding window

        // complexity from o(N*K) -> o(n)


        // goal : get the longuest continius substring by replacing with k

        // 2 + 2 -> 4

        // length = 0

        // steps :

        // int [] tab = new int[26]

        // count the repeition of each element then return  max = Math.max(max,tab[s.charAt(i) - 'a'])


        // go into loop

        // while(length - max > k) -> left++ 


        //length = Math.max(length,i-left+1)



        int[] tab = new int[26];


        int mostFrequent=0;


        int left = 0;

        int length=0;


       


        for(int i=0;i<s.length();i++){

            tab[s.charAt(i) - 'A']+=1;

            mostFrequent=Math.max(mostFrequent,tab[s.charAt(i) - 'A']);





            while((i-left+1) - mostFrequent > k){

                
                tab[s.charAt(left) - 'A']-=1;
                left++;

            }


            length = Math.max(length,i-left+1);


            


        }




        return length;










      


        }





        
        
        
        }

        


        

        


      


    

