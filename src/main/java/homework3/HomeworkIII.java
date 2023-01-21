package homework3;

public class HomeworkIII {
    public static void main(String[] args) {

        String word = "Alexei";
        String res = "Kim";
        String fullName = word + res;
        fullName = fullName + "Jr.";
        System.out.println(word + word + word);
        String tripleWord = "";
        tripleWord = word;
        System.out.println(tripleWord);
        System.out.println(tripleWord + word);

        HomeworkIII homeworkIII = new HomeworkIII();
        homeworkIII.addChars("dog");
        homeworkIII.addChars("red");
        homeworkIII.addChars("xy");
        homeworkIII.maxStart("max snacks");
        homeworkIII.maxStart("pax");
        homeworkIII.maxStart("paz snacks");
        homeworkIII.changeWord("fiz");
        homeworkIII.changeWord("dib");
        homeworkIII.changeWord("fib");
        homeworkIII.bibString("xycbib");
        homeworkIII.bibString("b9b");
        homeworkIII.bibString("bac");
        homeworkIII.stringTimes("Hi", 2);
        homeworkIII.stringTimes("Hi", 3);
        homeworkIII.stringTimes("Hi", 1);
        homeworkIII.isPlural("changes");
        homeworkIII.isPlural("change");
        homeworkIII.isPlural("dudes");
        homeworkIII.isPlural("magic");


    }

    public String addChars(String str) {
        System.out.println(str.charAt(str.length() - 1) + str + str.charAt(str.length() - 1));
        return str;
    }

    public boolean maxStart(String str) {
        boolean success = false;
        if (str.startsWith("ax", 1)) {

            success = true;
        }
        System.out.println(success);
        return success;


    }

    public void changeWord(String str) {
        //string startwith and endwith
        if (str.startsWith("f") && str.endsWith("b")) {
            System.out.println("FizzBuzz");
        } else if (str.startsWith("f")) {
            System.out.println("Fizz");
        } else if (str.endsWith("b")) {
            System.out.println("Buzz");
        } else {
            System.out.println(str);
        }
    }

    public void bibString (String bib){
        int length = bib.length();
        boolean success = false;
        for (int i = 0; i < length-2; i++){
            if (bib.charAt(i) == 'b' && bib.charAt(i+2) == 'b')
            {success = true;
            }


        }
        System.out.println(success);
    }

    public void stringTimes(String word, int n) {
        String newWord = "";
        for (int i = 0; i < n; i++) {
            newWord = newWord + word;


        }
        System.out.println(newWord);
    }

    public void isPlural(String word) {
        String lastLetter = "s";
        if (word.endsWith("s")) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }

}
