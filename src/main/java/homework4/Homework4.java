package homework4;

import java.util.*;

public class Homework4 {

    public String[] getDay(int day) {
        String[] daysOfTheWeek = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        if (day == 1) {
            System.out.println(daysOfTheWeek[0]);
        } else if (day == 2) {
            System.out.println(daysOfTheWeek[1]);
        } else if (day == 3) {
            System.out.println(daysOfTheWeek[2]);
        } else if (day == 4) {
            System.out.println(daysOfTheWeek[3]);
        } else if (day == 5) {
            System.out.println(daysOfTheWeek[4]);
        } else if (day == 6) {
            System.out.println(daysOfTheWeek[5]);
        } else if (day == 7) {
            System.out.println(daysOfTheWeek[6]);
        }
        return daysOfTheWeek;
    }

    public String getToyById(int id) {
        HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
        hashMap.put(12, "Batmobile");
        hashMap.put(45, "Light Saber");
        hashMap.put(6, "Wonder Woman");
        hashMap.put(201, "Hello Kitty Bag");
        hashMap.put(56, "Junior QA Analyst Doll");
        if (id == 12) {
            System.out.println(hashMap.get(12));
        } else if (id == 45) {
            System.out.println(hashMap.get(45));
        } else if (id == 6) {
            System.out.println(hashMap.get(6));
        } else if (id == 201) {
            System.out.println(hashMap.get(201));
        } else if (id == 56) {
            System.out.println(hashMap.get(56));
        } else {
            System.out.println("No such Toy.");
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Toy ID: ");
        int ids = Integer.parseInt(scanner.next());
        if (ids == 12) {
            System.out.println(hashMap.get(12));
        } else if (ids == 45) {
            System.out.println(hashMap.get(45));
        } else if (ids == 6) {
            System.out.println(hashMap.get(6));
        } else if (ids == 201) {
            System.out.println(hashMap.get(201));
        } else if (ids == 56) {
            System.out.println(hashMap.get(56));
        } else {
            System.out.println("No such Toy.");
        }

        return String.valueOf(hashMap);


    }

    public void arrayListOfStrings() {
        ArrayList<String> names = new ArrayList<String>();
        names.add("Steve");
        names.add("Tim");
        names.add("Lucy");
        names.add("Steve");
        names.add("Pat");
        names.add("Angela");
        names.add("Tom");
        names.add("Tim");
        names.add("Anna");
        names.add("Lucy");

        Set<String> s = new LinkedHashSet<>(names);
        System.out.println(s);

    }
}





