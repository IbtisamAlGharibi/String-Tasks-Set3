public class MaxBlock {
    public static void main(String[] args){
        String str = "abbCCCddBBBxx";
        int count = 0;
        int max =0;

        for (int i =0; i<str.length();i++){
            if (str.charAt(i) == str.charAt(i+1)){
                count++;
            }

        }




    }
}
