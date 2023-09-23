public class InterThreadData {
    int value=0;
    boolean flag = true;
    
    synchronized void set (int v) throws Exception{
        while(flag!=true){
            wait();
        }
        value=v;
        flag=false;
        notify();
    }
    
    synchronized int get() throws Exception{
        int x=0;
        while(flag!=false){
            wait();
        }
        x=value;
        flag=true;
        notify();
        return x;
    }
}