import java.lang.Thread;
public class Consumer extends Thread{
    InterThreadData d;
    Consumer(InterThreadData dat){
        this.d=dat;
    }
    
    public void run(){
        try{
            while(true){
                System.out.println("Consumer: "+d.get());
            }    
        }catch(Exception e){
            System.out.println("Consumer Thread Interrupted: "+e);
        }
        
    }
}