package homework5;

public class Accountant extends Employees{
    public Accountant(String name, int id, String title, String dateOfBirth, int salary, String address) {
        super(name, id, Consts.Accountant_Type, dateOfBirth, Consts.Accountant_Default_Salary, address);
    }
    public void newAccount (){
        System.out.println(String.format("Accountant %s just opened a new account.", name));
    }
    public void closeAccount (){
        System.out.println(String.format("Accountant %s just closed an account.", name));
    }
    public void createReport () {
        System.out.println(String.format("Accountant %s will prepare the report.", name));
    }
}
