import java.util.*;
class MyThread extends Thread{
    public void run(){
        int count =1;
        while(true){
            System.out.println(count++ + " My Thread");
        }
    }
}

public class ThreadTest{
    public static void main(String[] args) throws Exception{
        MyThread t = new MyThread();
        //t.setDaemon(true);
        t.start();

        int count=1;

        while(true){
            System.out.println(count++ + " Main");
            Thread.yield(); // Gives other threads some time to execute
        }
        /*Thread mainThread = Thread.currentThread();
        mainThread.join(); / Wait for other threds to complete
        */

        /*try{
            Thread.sleep(10);
        }catch(Exception e){
        }*/
    }
}