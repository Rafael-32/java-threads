public class Threads1 extends Thread{
    public void run(){
        System.out.println("Hello I am thread");
    }
    public static void main(String []args){
        Thread th = new Thread();
        th.start();
    }
}