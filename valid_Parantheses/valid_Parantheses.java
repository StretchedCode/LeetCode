/**
 * valid_Parantheses
 */
public class valid_Parantheses {

    public static void main(String[] args) {
        String test = "()[]";
        System.out.println(isValid(test));
    }  

    public static Boolean isValid(String s){

        int j = 0;
        for (int i = 1; i < s.length(); i++){

            if (i == s.length() - 1){
                return true;
            }
            

            String test = s.substring(j, i);

            if (test.equalsIgnoreCase("(")){

                if (s.substring(i, i + 1).equalsIgnoreCase(")")){

                    j += 2;
                    i += 2;
                    continue;
                }
                else{
                    return false;
                }
            }

            else if (test.equalsIgnoreCase("{")){

                if (s.substring(i, i + 1).equalsIgnoreCase("}")){

                    j += 2;
                    i += 2;
                    continue;
                }
                else{
                    return false;
                }
            }

            else if (test.equalsIgnoreCase("[")){

                if (s.substring(i, i + 1).equalsIgnoreCase("]")){
                    j += 2;
                    i += 2;
                    continue;
                }
                else{
                    return false;
                }
            }
        }


        return false;
    }
}