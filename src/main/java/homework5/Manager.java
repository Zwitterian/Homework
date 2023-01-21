package homework5;

import org.w3c.dom.ls.LSOutput;

public class Manager extends Employees {


    public Manager(String name, int id, String title, String dateOfBirth, int salary, String address) {
        super(name, id, Consts.Manager_Type, dateOfBirth, Consts.Manager_Default_Salary, address);
    }


    public void hire() {
        System.out.println(String.format("Manager %s just hired a new employee.", name));
    }

    public void fire() {
        System.out.println(String.format("Manager %s just fired an employee.", name));
    }
}
