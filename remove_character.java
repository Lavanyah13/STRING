public class Solution {
  
    public static String removeAllOccurrencesOfChar(String str, char ch) {
     
        String s1=new String();
        int len=str.length();
        int temp=(int)ch;
        for(int i=0;i<len;i++)
        {
            if((int)str.charAt(i)==temp)
               continue;
            s1+=str.charAt(i);

        }
        return s1;
    }
}
