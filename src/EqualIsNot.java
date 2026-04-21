public class EqualIsNot {
    public static void main(String[] args){
        String str = "This is notnot";

        int countIs = 0;
        int countNot = 0;

        for (int i =0; i<str.length();i++){
            if (str.charAt(i)== 'i' && str.charAt(i+1)== 's'){
                countIs++;
            }
            if (str.charAt(i)== 'n' && str.charAt(i+1)== 'o' && str.charAt(i+2)== 't'){
                countNot++;
            }
        }

    }
}
