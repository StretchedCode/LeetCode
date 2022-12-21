import java.util.Arrays;

/**
 * longestCommonPrefix
 */
public class longestCommonPrefix {

    public static void main(String[] args) {
        String [] words = {"flootnute", "flow", "flucknut"};
        System.out.println(longestCommonPrefix(words));
    }

    public static String longestCommonPrefix(String[] strs) {
        
        String prefix = "";
        char checkChar = 'z';
        boolean breakCheck = false;
        Arrays.sort(strs);

        for (int i = 0; i < strs[0].length(); i++){

            if (strs.length == 1){
                prefix = strs[0];
                breakCheck = true;
            }


            if (breakCheck){
                break;
            }

            checkChar = strs[0].charAt(i);
            int count = 0;

            for (int j = 1; j < strs.length; j++){

                if (checkChar == strs[j].charAt(i)){
                   // System.out.println("Yes");
                    
                   count++;

                   if (count == strs.length - 1){
                    prefix += checkChar;
                   }
                }
                else{
                    breakCheck = true;
                    break;
                }

            }
        }

        return prefix;
    }
}