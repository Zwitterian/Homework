package homework5;

public class MainEmployees {
    public static void main(String[] args) {
        Manager manager = new Manager("John Smith", 1, "Manager", "09.09.1977", 10000, "New York");
        System.out.println(manager.toString());
        manager.receiveSalary();
        manager.hire();


        Clerk clerk1 = new Clerk("Sara Johns", 2, "Clerk", "04.12.1984", 3000, "New York");
        System.out.println(clerk1.toString());
        clerk1.callCustomers();
        clerk1.toString();

        Clerk clerk2 = new Clerk("Tiffany Maylies", 3, "Clerk", "11.07.1976", 3000, "New York");
        System.out.println(clerk2.toString());
        clerk2.answerCalls();
        clerk2.receiveSalary();

        Clerk clerk3 = new Clerk("Emily Spike", 4, "Clerk", "04.08.1976", 3000, "New York");
        System.out.println(clerk3.toString());
        clerk3.answerCalls();


        Accountant accountant1 = new Accountant("Andrew Goff", 5, "Accountant", "03.11.1971", 5000, "New York");
        System.out.println(accountant1.toString());
        accountant1.closeAccount();

        Accountant accountant2 = new Accountant("Smith Lewed", 6, "Accountant", "12.01.1961", 5000, "New York");
        System.out.println(accountant2.toString());
        accountant2.createReport();

        Accountant accountant3 = new Accountant("Susan Stolckhom", 7, "Accountant", "11.01.1992", 5000, "New York");
        System.out.println(accountant3.toString());
        accountant3.newAccount();

        Accountant accountant4 = new Accountant("Eve Janes", 8, "Accountant", "07.04.1987", 5000, "New York");
        System.out.println(accountant4.toString());
        accountant4.newAccount();

        Accountant accountant5 = new Accountant("Lard Ashper", 9, "Accountant", "01.11.1974", 5000, "New York");
        System.out.println(accountant5.toString());
        accountant5.createReport();
    }
}
