import java.util.ArrayList;

public class EvenBinary {
    public static void main(String[] args) {
        System.out.println("Hello There");
        String userInput = MyUtil.getInput("Please enter your binary string");
        System.out.println("Your string "+userInput+" contains "+getEvens(userInput)+ " even numbers");
    }
    public static int getEvens(String input) {
        int i, j, tempInt;
        ArrayList <Integer> substrings = new ArrayList<Integer>();
        int strlength = input.length();
        for( i = 0; i < strlength; i++) {
            for(j = i + 1; j < strlength; j++) {
                tempInt = Integer.parseInt(input.substring(i,j));
                if(tempInt % 2 == 0) {
                    substrings.add(tempInt);
                }
                System.out.print(input.substring(i, j) + ",");
            }
        }
        System.out.println(" Number of Evens is "+substrings.size());
        return substrings.size();
    }
}
