public class CountYz {
    public static void main(String[] args){
        String str = "fez day";

        int count = 0;
        int z = str.indexOf("z");
        int y = str.indexOf("y");

        for (int i=0; i<str.length();i++){
            if (str.charAt(i) == z && str.charAt(i+1)== ' ' ||
                    str.charAt(i) == y && str.charAt(i+1)== ' '){
                count++;
            }
        }


    }
}
