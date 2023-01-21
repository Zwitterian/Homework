package homework2;

public class HomeworkII {
    public static void main(String[] args) {

        HomeworkII homework = new HomeworkII();
        homework.nearHundred(93);
        homework.nearHundred(90);
        homework.nearHundred(89);
        homework.lastDigit(7, 17);
        homework.lastDigit(6, 17);
        homework.lastDigit(3, 113);
        homework.maxInt(1, 2, 3);
        homework.maxInt(1, 3, 2);
        homework.maxInt(3, 2, 1);
        homework.seven(7, 4);
        homework.seven(4, 1);
        homework.seven(2, 5);
        homework.answerCell(false, false, false);
        homework.answerCell(false, false, true);
        homework.answerCell(true, false, false);
        homework.answerCell(true, true, false);
        homework.answerCell(true, true, true);
        homework.equalSlices(11, 5, 2);
        homework.equalSlices(11, 5, 3);
        homework.equalSlices(8, 3, 2);
        homework.equalSlices(8, 3, 3);
        homework.equalSlices(24, 12, 2);
    }

    public void nearHundred(int n) {
        boolean first = true;
        boolean second = false;
        if (n >= 90) {
            System.out.println(first);
        } else {
            System.out.println(second);
        }
    }

    public void lastDigit(int a, int b) {
        if (b % 10 == a) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }

    public void maxInt(int a, int b, int c) {
        if (a > b && a > c) {
            System.out.println(a);
        } else if (b > a && b > c) {
            System.out.println(b);
        } else if (c > a && c > b) {
            System.out.println(c);
        }


    }

    public void seven(int a, int b) {
        if (a == 7 || b == 7 || a + b == 7) {
            System.out.println(7);
        }
    }

    public void answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
        if (isMorning == false && isMom == false && isAsleep == false) {
            System.out.println("answer");
        }
        else if (isMorning = true && isMom == true && isAsleep == false){
            System.out.println("answer");
        }

    }

    public void equalSlices (int numberOfSlices, int numberOfPeople, int slicesEach){
        if (numberOfPeople * slicesEach <= numberOfSlices) {
            System.out.println(true);
        }
        else if (numberOfPeople * slicesEach > numberOfSlices) {
                System.out.println(false);

        }
    }
}
