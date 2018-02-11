public class NRowSum {
    public static void main(String[] args) {
        System.out.println("Hello There");
        String userInput = MyUtil.getInput("Please enter your row number");
        getInt(Integer.parseInt(userInput));
    }

    /**
     * getInt provides the sum x of a  given row n that follows the pattern:
     *
     * row 1: [1,2] : sum = 3
     * row 2: [3,4,5,6] : sum = 18
     * row 3: [7,8,9,10,11,12]: sum = 57
     * row n: [.,.,.,.,.,.,] : sum = x
     *
     * @param row_num Int: The row num in question
     * @return Int: the sum of the row
     */
    public static int getInt(int row_num) {
        int sum = (2 * row_num * row_num * row_num) + row_num;
        System.out.println("The sum of Row n: "+row_num+" is "+ sum);
        return sum;
    }
}
