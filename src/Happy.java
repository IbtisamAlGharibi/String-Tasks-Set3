public class Happy {
    public static void main(String[] args){
        String str = "xxggyygxx";
        boolean happy = true;

        if (happy ==true){
            for (int i =0; i<str.length();i++){
                if (str.charAt(i)=='g'&& str.charAt(i+1)=='g'){
                    System.out.println(true);
                }
            }
        }else {
            happy=false;
            System.out.println(happy);
        }

    }
}
