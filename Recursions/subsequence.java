public class subsequence {

    static void printSubsequence(String str, int index, String current) {
        if (index == str.length()) {
            System.out.println(current);
            return;
        }
        printSubsequence(str, index + 1, current + str.charAt(index));
        printSubsequence(str, index + 1, current);
    }

    public static void main(String[] args) {
        String input = "abc";
        printSubsequence(input, 0, "");
    }
}