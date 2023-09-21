public class SCThread1 {
    public static void main(String[] args){
        ATM atm = new ATM();
        Customer c1 = new Customer("Smith",atm,100);
        Customer c2 = new Customer("John",atm,200);
        c1.start();
        c2.start();
    }
}