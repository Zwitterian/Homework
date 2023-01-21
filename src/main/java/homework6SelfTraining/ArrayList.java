package homework6SelfTraining;

import java.sql.SQLOutput;
import java.util.Arrays;

public class ArrayList {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.stringArray();
        arrayList.nameShuffle("Donald Trump");
        arrayList.doubleLetter("Loop");
        arrayList.doubleLetter("yummy");
        arrayList.doubleLetter("orange");
        arrayList.doubleLetter("munchkin");
        arrayList.calculateScores("A");
        arrayList.calculateScores("ABC");
        arrayList.calculateScores("ABCBACC");
        arrayList.calculateScores("ABBACCCCAC ");


    }

    public void stringArray() {
        String[] arrayList1 = {"cat", "blue", "skt", "umbrells", "paddy"};
        String[] arrayList2 = {"cat", "blue", "sky", "umbrella", "paddy"};
        int[] output = new int[arrayList1.length];
        for (int i = 0; i < arrayList1.length; i++) {

            if (arrayList1[i] == arrayList2[i]) {
                output[i] = 1;
            }
            if (arrayList1[i] != arrayList2[i]) {
                output[i] = -1;

            }

        }
        System.out.println(Arrays.toString(output));

        String[] userTypedArray = {"it", "is", "find"};
        String[] correctArray = {"it", "is", "fine"};
        int[] output2 = new int[userTypedArray.length];
        for (int i = 0; i<userTypedArray.length; i++) {
            if (userTypedArray[i] == correctArray[i]){
                output2[i] = 1;
            }
            if (userTypedArray[i] != correctArray[i]){
                output2[i] = -1;
            }
        }
        System.out.println(Arrays.toString(output2));
    }

    public void nameShuffle(String nameShuffle) {
        String firstName=nameShuffle.substring(0,nameShuffle.indexOf(" "));
        String lastName=nameShuffle.substring(firstName.length()+1, nameShuffle.length());
        String swapName=lastName+" "+firstName;
        System.out.println(swapName);
    }

    public void doubleLetter(String doubleLetter) {
        boolean success = false;
        for (int i = 0; i < doubleLetter.length(); i++) {
            if (i > 0 && doubleLetter.charAt(i) == doubleLetter.charAt(i - 1)) {
                success = true;
                if (success = true) {
                    break;
                }
            } else {
                success = false;
            }

        }
        System.out.println(success);
    }

    public void calculateScores(String ABC) {
        int A = 0;
        int B = 0;
        int C = 0;
        for (int i = 0; i < ABC.length(); i++) {
            if (ABC.charAt(i) == 'A') {
                A = A + 1;
            } else if (ABC.charAt(i) == 'B') {
                B = B + 1;
            } else if (ABC.charAt(i) == 'C') {
                C = C + 1;
            }

        }
        int[] ints = {A, B, C};
        System.out.println(Arrays.toString(ints));

    }


}


