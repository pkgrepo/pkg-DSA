package recursion;

public class _8_palindrom {
    public static void main(String[] args){
        String str = "MADAM";
        System.out.println("Is "+str+" palindrome: "+ checkPalindrome(str));
    }

    private static boolean checkPalindrome(String str) {
        int index = 0;
        int len = str.length();
        return checkRecurPalindrome(index, str, len);
    }

    private static boolean checkRecurPalindrome(int index, String str, int len) {
        if(index >= len/2 ){
            return true;
        }
        if(str.charAt(index) != str.charAt(len - index - 1)){
            return false;
        }
        return checkRecurPalindrome(index +1, str, len);
    }
}
