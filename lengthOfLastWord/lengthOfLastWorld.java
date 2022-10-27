/**
 * lengthOfLastWorld
 */
public class lengthOfLastWorld {

    public static void main(String[] args) {
     
        String test = "a     ";
        System.out.println(lengthOfLastWord(test));

    }

    public static int lengthOfLastWord(String s){

        int count = 0;

        for (int i = s.length(); i > 0; i--){
            
            if (s.substring(i - 1, i).equalsIgnoreCase(" ")){
                continue;
            }
            else{

                count++;


                
                
                if ( i - 2 < 0 ||s.length() == 1|| s.substring(i - 2, i - 1).equalsIgnoreCase(" ")){
                    break;
                }
            }

            

        }

        return count;
    }
}