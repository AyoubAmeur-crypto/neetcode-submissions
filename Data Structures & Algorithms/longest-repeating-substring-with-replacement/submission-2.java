class Solution {
    public int characterReplacement(String s, int k) {



        // goal here is to get the longest substirng that has one ditinct charchter
        // by using the k we try to get the longuest one 


        // int[] tab = new int[26]

        //int left = 0

        // int right = s.length()

        // for(int i =0 : i<s.length();i++)

        // while((right-left) - s.charAt(i) > k){

        // left++;}


        // return (left-right)


        int left =0;


        int[] tab = new int[26];

        int mostFrequent =0;

        int length =0;


        for(int i=0;i<s.length();i++){


            tab[s.charAt(i) - 'A']+=1;


            mostFrequent = Math.max(mostFrequent,tab[s.charAt(i) - 'A']);


            while((i-left+1) - mostFrequent > k){
                tab[s.charAt(left) - 'A']-=1;

                left++;

            }


            length = Math.max(length,i-left+1);





        }








                 return length;


        }





        
        
        
        }

        


        

        


      


    

