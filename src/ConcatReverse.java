public class ConcatReverse {


    public ConcatReverse() {

    }

    public static void main (String[] args) {
        System.out.println("Hello There");
        String userInput = MyUtil.getInput("Please enter your string");
    }

    public static String reverseString(String input) {
        int strlength = input.length();
        char[] newChars = new char[strlength];
        for(int i = 0; i < strlength; i++) {
            newChars[i] = input.charAt(strlength - 1 - i);
        }
        return new String(newChars);
    }
    public static String[] splitString(String input) {
        String[] newString = new String[2];
        int strlength = input.length();
        if(strlength >= 2) {
            newString[0] = input.substring(0,(strlength/2));
            newString[1] = input.substring((strlength/2),strlength);
        } else {
            newString[0] = input;
            newString[1] = "";
        }
        return newString;
    }

    /**
     * This function takes an input string, splits it in half and reverses each
     * halve before concatenating
     * @param input String: The string to be split, reversed and concatenated
     * @return String: the concatenated string
     */
    public static String runRevCon(String input) {
        String[] strSplit = splitString(input);
        String strA = reverseString(strSplit[0]);
        String strB = reverseString(strSplit[1]);
        System.out.println("This is the string \'"+input+"\'in reverse\n\'" + strA + strB+"\'");
        return strA + strB;
    }
}
