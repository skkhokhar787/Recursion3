public class Permutations {
    public static void printPerm (String str, String permuted) {
        // Base case: if the string is empty, print the permutation
        if (str.isEmpty()) {
            System.out.println(permuted);
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            String newStr = str.substring(0, i) + str.substring(i + 1);
            printPerm(newStr, permuted + currentChar);
        }
    }
    public static void main (String [] args) {
        String str = "abc";
        printPerm(str, "");

    }
}
