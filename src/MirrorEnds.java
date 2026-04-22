public class MirrorEnds {
    public static void main(String[] args){
        String str = "abXYZba";
        String result = "";

        for (int i =0; i<str.length();i++){

        if (str.charAt(i) == str.charAt(str.length()-1-i)){
            result = result+str.charAt(i);

        }
        }
        System.out.println(result);


    }
}
