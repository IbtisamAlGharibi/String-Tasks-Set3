public class NotReplace {
    public static void main(String[] args){

        String str= "is test";
        String result = "";

        for (int i=0; i <str.length();i++){
            boolean check = Character.isLetter(str.charAt(i));

            if (str.charAt(i) == 'i' && str.charAt(i+1) == 's'){
               result = "is not" ;
            }

            result = result+ str.charAt(i);

        }

    }
}
