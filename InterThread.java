public class InterThread {
    public static void main(String []args){
        
        InterThreadData data = new InterThreadData();
        Producer p = new Producer(data);
        Consumer c = new Consumer(data);
        p.start();
        c.start();
    }
}