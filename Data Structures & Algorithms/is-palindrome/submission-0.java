class Solution {
    public boolean isPalindrome(String s) {


      String v=s.trim().toUpperCase();

      v=v.replaceAll("[^a-zA-Z0-9]","");

      String vcopy="";


      for(int i=v.length()-1;i>=0;i--){

        vcopy+=v.charAt(i);
      }

      if(v.equals(vcopy)) return true;

      return false;
        
    }
}
