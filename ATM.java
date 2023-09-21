public class ATM {
    
    synchronized public void checkBalance(String name){
        System.out.println(name+" Checking");
        try{
           Thread.sleep(1000); 
        }catch(Exception e){
            
        }
        System.out.println(name+" Balance");
    }
    
    synchronized public void withdraw(String name, int amount){
        System.out.println(name+" withdrawing");
        try{
            Thread.sleep(1000); 
        }catch(Exception e){

        }
        System.out.println(name+ " "+amount);
    }
}