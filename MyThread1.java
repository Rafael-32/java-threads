import java.util.*;

public class MyThread1 extends Thread{
    MyData d;
     MyThread1(MyData dat){
        this.d =dat;
    }
    public void run(){
        d.display("Hello World");
    }
}