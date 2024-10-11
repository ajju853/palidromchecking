public class palidromchecker{
    public static boolean ispalidrom(String str){
        int left = 0;
        int right = str.length()-1;
        while (left < right) {
            if(str.charAt(left) != str.charAt(right)){
                return false;
            }

            left++;
            right--;
        }

        return true;
    }
    public static void main(String args[]){
        String input = "madam";
        boolean palidrom = ispalidrom(input);
        if(palidrom){
            System.out.println(input + " : yes this is a palidrom");
        }else{
            System.out.println(input + " : sorry to say this is not a palidrom");
        }

    }
}