public class SoultionPalindromeWithException {
    public static boolean isPalindrome(String string) {
        // init a count of number of palindrome exceptions
        int countOfExceptions = 0;
        // init two pointers for the palindrome
        int i = 0, j = string.length()-1;
        // while they are not pointing either to the same char index or have not crossed over each other
        while ( i < j) {
            // get the char at the index from each pointer
            char a = string.charAt(i);
            char b = string.charAt(j);
            // if they are the same, then continue the while loop
            if (a==b) {
                // increment/decrement the index
                i++;
                j--;
            } else {
                // if they are not the same, increment the palindrome exception counter
                countOfExceptions++;
                // if palindrome exception counter > 1, then return false
                if (countOfExceptions>1) {
                    return false;
                }
                if ((i+1)<=j && string.charAt(i+1)==b) {
                    i++;
                } else {
                    j--;
                }
            }
        }

        //while loop finished - then it is a palindrome. return true
        return true;
    }
}
