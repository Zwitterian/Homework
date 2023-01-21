package homework5;

public abstract class Employees {
    String name;
    int id;
    String title;
    String dateOfBirth;
    int salary;
    String address;


    public Employees(String name, int id, String title, String dateOfBirth, int salary, String address) {
        this.name = name;
        this.id = id;
        this.title = title;
        this.dateOfBirth = dateOfBirth;
        this.salary = salary;
        this.address = address;


    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String toString() {
        String txt = String.format("Name: %s, ID: %d, Title: %s, Birth Date: %s, Salary: %d$, Adress: %s", name, id, title, dateOfBirth, salary, address);
        return txt;
    }
    public void receiveSalary(){
        System.out.println(String.format("%s just recieved a salary of %d$.", name, salary));
    }
}
