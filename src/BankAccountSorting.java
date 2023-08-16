public class BankAccountSorting {
    public static void main(String[] args) {
        // Array of bank account numbers to be sorted
        String[] accountNumbers = {"A123", "B9876", "C456", "D23456", "E12"};

        // Sort the account numbers using custom sorting logic
        sortAccountNumbers(accountNumbers);

        // Print the sorted account numbers
        for (String accountNumber : accountNumbers) {
            System.out.println(accountNumber);
        }
    }

    /**
     * Sorts an array of account numbers using bubble sort algorithm.
     * The comparison logic is based on account number length and lexicographical order.
     *
     * @param accountNumbers The array of account numbers to be sorted.
     */
    public static void sortAccountNumbers(String[] accountNumbers) {
        // Bubble sort algorithm implementation
        for (int i = 0; i < accountNumbers.length - 1; i++) {
            for (int j = 0; j < accountNumbers.length - i - 1; j++) {
                // Compare account numbers using custom comparison method
                if (compareAccountNumbers(accountNumbers[j], accountNumbers[j + 1]) > 0) {
                    // Swap account numbers if needed
                    String temp = accountNumbers[j];
                    accountNumbers[j] = accountNumbers[j + 1];
                    accountNumbers[j + 1] = temp;
                }
            }
        }
    }

    /**
     * Compares two account numbers based on their lengths and lexicographical order.
     *
     * @param a The first account number for comparison.
     * @param b The second account number for comparison.
     * @return Negative if 'a' should come before 'b', positive if 'a' should come after 'b',
     *         and 0 if they are equal in terms of sorting.
     */
    public static int compareAccountNumbers(String a, String b) {
        if (a.length() == b.length()) {
            // Compare characters lexicographically within account numbers of equal length
            for (int i = 0; i < a.length(); i++) {
                if (a.charAt(i) != b.charAt(i)) {
                    return a.charAt(i) - b.charAt(i);
                }
            }
            return 0; // Account numbers are equal
        } else {
            return a.length() - b.length(); // Account numbers differ in length
        }
    }
}