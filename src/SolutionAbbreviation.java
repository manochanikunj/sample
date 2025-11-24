public class SolutionAbbreviation {

    public static boolean validWordAbbreviation(String word, String abbr) {
        int i = 0, j = 0;
        // while loop through both strings until the end of the abbreviation is reached
        while (i < word.length() && j < abbr.length()) {
            // get the current char from both strings
            char c = word.charAt(i);
            char a = abbr.charAt(j);
            // if the chars are not digit,
            if (!Character.isDigit(a)) {
                // then return false if they do not match
                if (c!=a) {
                    return false;
                }
                // they  match, so we need to increment i and j and continue the while loop
                i++;
                j++;
                continue;
            } else {
                // if the char from abbreviation is a digit ,
                // if the digit is 0, return false since it is not allowed to have leading zeros
                if (a =='0') {
                    return false;
                }
                int num = 0;
                while (j < abbr.length() && Character.isDigit(abbr.charAt(j))) {
                    num = num * 10 + (abbr.charAt(j) - '0');
                    j++;
                }
                i += num;
            }
        }

        // return true if both counters have reached the end of their respective strings
        return i == word.length() && j == abbr.length();
    }

}
