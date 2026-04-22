public class MaxBlock {
    public static void main(String[] args){

        String str = "abbCCCddBBBxx";
        int count = 1;
        int max = 1;

        for (int i = 0; i < str.length() - 1; i++){

            if (str.charAt(i) == str.charAt(i + 1)){
                count++;
            } else {
                count = 1;
            }

            if (count > max){
                max = count;
            }
        }

        System.out.println(max);
    }
}