package homework3;

public class HomeworkRepeat {
    public static void main(String[] args) {
        HomeworkRepeat homeworkRepeat = new HomeworkRepeat();
//        homeworkRepeat.charactersFB("fig");
//        homeworkRepeat.charactersFB("dib");
//        homeworkRepeat.charactersFB("fib");
//        homeworkRepeat.s ("changes");
//        homeworkRepeat.s ("change");
//        homeworkRepeat.s ("dudes");
//        homeworkRepeat.s ("magic");
        homeworkRepeat.max("max snacks");
        homeworkRepeat.max("pax snacks");
        homeworkRepeat.max("paz snacks");
    }
    public void charactersFB (String word){
        int length = word.length();
        if (word.charAt(0) == 'f' && word.charAt(length-1) == 'b') {
            System.out.println("FizzBuzz");
        }
        else if (word.charAt(0) == 'f'){
            System.out.println("Fizz");
        }
        else if (word.charAt(word.length()-1) == 'b'){
            System.out.println("Buzz");

        }
    }
    public void s (String s){
        if (s.charAt(s.length()-1) == 's'){
            System.out.println(true);
        }
        else {
            System.out.println(false);
        }
    }
    public  void max (String max){
        if (max.charAt(1) == 'a' && max.charAt(2) == 'x') {
            System.out.println(true);
        }
        else {
            System.out.println(false);
        }
    }

}
