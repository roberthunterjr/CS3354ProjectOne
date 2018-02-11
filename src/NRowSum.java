public class NRowSum {
    public static void main(String[] args) {
        System.out.println("Hello There");
        String userInput = MyUtil.getInput("Please enter your row number");
        System.out.println("The sum of your Row is "+ getInt(Integer.parseInt(userInput)));
    }

    public static int getInt(int row_num) {
        return (2 * row_num * row_num * row_num) + row_num;
    }
}
