import java.util.*;

class InsufficientBalExc extends Exception{
    public InsufficientBalExc(String message){
        super(message);
    }
}

class Account{
    private int accNo;
    private double bal;

    public Account(int accNo, double bal){
        this.accNo=accNo;
        this.bal=bal;
    }

    public void deposit(double amount){
        bal=bal+amount;
        System.out.println("Money deposited successfully");
    }

    public void withdraw(double amount) throws InsufficientBalExc{
        if(amount>bal){
            throw new InsufficientBalExc("Not enough balance");
        }

        bal=bal-amount;
        System.out.println("Money withdrawn successfully");
    }

    public void showbal(){
        System.out.println("Current balance: "+bal);
    }
}


class User{
    private int userId;
    private String name;

    public User(int userId, String name){
        this.userId= userId;
        this.name= name;
    }

    public void showUserDetails(){
        System.out.println("User Id: "+userId);
        System.out.println("User Name: "+name);
    }
}


class EmpDetails{
    private int empId;
    private String empName;

    public EmpDetails(int empId, String empName){
        this.empId= empId;
        this.empName= empName;
    }

    public void ShowEmpDetails(){
        System.out.println("Employee Id: "+empId);
        System.out.println("Employee Name: "+empName);
    }
}

class Other{
    public void showBAnkInfo(){
        System.out.println("Welcome to ABC Bank");
        System.out.println("Bank timing: 9AM to 5PM");
    }
}

public class bankManSys {

    public static void main(String[]args){

        Scanner sc= new Scanner(System.in);

        User user= new User(1, "Raj");
        Account acc= new Account(101, 50000);
        EmpDetails employee= new EmpDetails(201,"Satya");
        Other other= new Other();

        other.showBAnkInfo();
        user.showUserDetails();
        employee.ShowEmpDetails();

        System.out.println("Enetr amount to deposit: ");
        double depositAmount= sc.nextDouble();
        acc.deposit(depositAmount);

        System.out.println("Enter amount to withdraw");
        double withDrawAmt= sc.nextDouble();

        try{
            acc.withdraw(withDrawAmt);
        }
        catch(InsufficientBalExc e){
            System.out.println("Exception: "+e.getMessage());
        }

        acc.showbal();
        sc.close();

    }

    
}


