package algorithms.twopointers;
//6:45am-7:29am- 24.April.2026
//07:21am-07:46am - 25.April.2026
public class ValidPalindrome2 {
    public static void main (String [] args) {

        String str = "A man, a plan, a canal: Panama";
        System.out.println(str);
        System.out.println(validPalidrome(str));
    }
    public static boolean validPalidrome(String str){

        String reverse = "";
        int left = 0;
        int right = str.length() - 1;

        StringBuilder sb = new StringBuilder(str);
        System.out.println(sb.reverse());

        while (left < right) {
            char convertLeft = str.charAt(left);
            char convertRight = str.charAt(right);

            if (!Character.isLetterOrDigit(convertLeft)) {
                left++;
                continue;
            }

            if (!Character.isLetterOrDigit(convertRight)) {
                right--;
                continue;
            }

            if (Character.toLowerCase(convertLeft) != Character.toLowerCase(convertRight)){
                return false;
            }


            left++;
            right--;
        }

        return true;
    }

}
