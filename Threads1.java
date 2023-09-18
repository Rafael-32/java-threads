public class Threads1 extends Thread{
    public void run(){
        int i=1;
        while(i<=10){
            System.out.println("Hello I am thread"+i);
            i++;
        }
        
    }
    public static void main(String []args){
        Threads1 th = new Threads1();
        th.start();
    }
}