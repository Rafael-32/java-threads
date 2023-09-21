import java.util.*;
import java.lang.*;

public class Customer extends Thread{
    ATM atm;
    String name;
    int amount;
    
    Customer(String n, ATM a, int amt){
        this.name=n;
        this.atm=a;
        this.amount=amt;
    }
    
  public  void useATM(){
        atm.checkBalance(name);
        atm.withdraw(name,amount);
    }

    public void run(){
        useATM();
    }
}