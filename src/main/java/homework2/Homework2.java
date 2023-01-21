package homework2;

public class Homework2 {
    public static void main(String[] args) {
        Homework2 loop = new Homework2();
       // loop.numbers(100);
       // loop.countNumbers(1, 4);
        loop.numbersTemplate(9);
    }

    public void numbers(int numbers) {
        for (int i = 1; i <= numbers; i++) {
            if (i % 2 == 0 && i % 3 == 0) {
                System.out.println(i + " is divisible by 2 and 3");
            } else if (i % 3 == 0) {
                System.out.println(i + " is divisible by three");
            } else if (i % 2 == 0) {
                System.out.println(i + " is even");

            } else  {
                System.out.println(i + " is odd");
            }

        }


    }

    public void countNumbers(int a, int b) {
        int sum = 0;
        for (int g = a; g <= b; g++) {

            sum = sum + g;
        }
        System.out.println(sum);
    }


    public void numbersTemplate(int rows) {
        for (int i = 1; i <= rows; i++) {
            for (int j = 9; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }


}
