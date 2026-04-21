public class SumDigits {
    public static void main(String[] args){

        String str = "aa1bc2d3";
        int sum = 0;

        for (int i =0; i<str.length()-1;i++){
          boolean check = Character.isDigit(str.charAt(i));
            if (check=true){
                sum = sum +str.charAt(i);
            }

        }


    }
}
