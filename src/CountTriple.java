public class CountTriple {
    public static void main(String[] args){

        String str = "abcXXXabc";
        int count = 0;

        for (int i =0; i<str.length();i++){
            if (str.charAt(i) =='x' && str.charAt(i+1) =='x' && str.charAt(i+2) =='x'){
                count++;
            }

        }
    }
}
