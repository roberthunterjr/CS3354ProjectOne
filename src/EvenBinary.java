import java.util.ArrayList;

public class EvenBinary {
    public static void main(String[] args) {
        System.out.println("Hello There");
        String userInput = MyUtil.getInput("Please enter your binary string");
        getEvens(userInput);
    }

    /**
     * The getEvens function splits an input string into a superset of substrings before
     * parsing each substring as a binary representation of an integer.
     * If the integer is even, the count is increased.
     *
     * Does not ignore duplicate values. 0 is considered an even number.
     * @param input String: The input string in binary format. Ex: 10010
     * @return Int: The number of evens found
     */
    public static int getEvens(String input) {
        int i, j, tempInt;
        int subCount = 0;
        int strlength = input.length();

        System.out.print("Substrings: ");
        for( i = 0; i < strlength; i++) {
            for(j = i + 1; j <= strlength; j++) {
                tempInt = Integer.parseInt(input.substring(i,j));
                if(tempInt % 2 == 0) {
                    subCount++;
                }
                System.out.print(input.substring(i, j) + ",");
            }
        }
        System.out.println("\nYour string "+input+" contains "+subCount+ " even numbers");
        return subCount;
    }
}
