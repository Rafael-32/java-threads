import java.lang.*;
public class Producer extends Thread{
    InterThreadData d ;
    Producer(InterThreadData dat){
        this.d=dat;
    }
    
    public void run(){
        int i =1;
        try{
            while(true){
                d.set(i);
                System.out.println("Producer: "+i);
                i++;
            }
        } catch(Exception e){
            System.out.println("Producer Thread Interrupted: "+e);
        }
        
    }
}