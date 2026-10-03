class Solution {
    public int lengthOfLongestSubstring(String s) {


    // goal : to find the lonest substirng and send it length

    // define left index and rigt index and alo maxLength = 0

    // hashSet

    // condition if the charchter is repated we gonna increment the left and clear the hashset the calculate the maxLENGTH RIGHT-LEFT + 1 



    int left =0;

    int maxlength=0;

    Set<Character> words = new HashSet<>();


    for(int i=0;i<s.length();i++){

        while(words.contains(s.charAt(i))){

            words.remove(s.charAt(left));

            left+=1;


        }

        words.add(s.charAt(i));

        maxlength = Math.max(maxlength,i-left+1);
    }


    return maxlength;


       








        
    }
}
