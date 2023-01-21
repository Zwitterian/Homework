package homework5;

public class Clerk extends Employees{

    public Clerk(String name, int id, String title, String dateOfBirth, int salary, String address) {
        super(name, id, Consts.Clerk_Type, dateOfBirth, Consts.Clerk_Default_Salary, address);
    }

  public void callCustomers (){
      System.out.println(String.format("Clerk %s just called a customer.", name));
  }
  public void answerCalls (){
      System.out.println(String.format("Clerk %s just answered to an incoming call.", name));
  }




}
