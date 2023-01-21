package homework3;

public class Homework3 {
    public static void main(String[] args) {
        Homework3 homework3 = new Homework3();
        homework3.compareStrings("Category", "Cat");
        homework3.isPalindrome("racecar");
    }

    public void compareStrings(String a, String b) {


        System.out.println(a.contains(b));

        if (a.equals(b)) {
            System.out.println("The Strings are the same");
        } else if (a == null || b == null) {
            System.out.println("Cannot compare Strings");
        }
    }

    public boolean isPalindrome(String text) {
        boolean success = false;
        String reverseText = "";
        int lastLetter = text.length() - 1;
        for (int i = lastLetter; i >= 0; i--) {
            reverseText = reverseText + text.charAt(i);
        }
        if (text.equals(reverseText)) {
            success = true;
        }
        System.out.println(success);
        return success;
    }
}



