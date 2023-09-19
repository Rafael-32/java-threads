import java.util.*;
class MyThread extends Thread{
    public void run(){
        int count =1;
        while(true){
            System.out.println(count++);
        }
    }
}

public class ThreadTest{
    public static void main(String[] args) throws Exception{
        MyThread t = new MyThread();
        t.setDaemon(true);
        t.start();

        /*Thread mainThread = Thread.currentThread();
        mainThread.join();*/

        /*try{
            Thread.sleep(10);
        }catch(Exception e){
        }*/
    }
}