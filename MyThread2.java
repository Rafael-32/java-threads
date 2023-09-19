import java.util.*;
public class MyThread2 extends Thread{
    MyData data;
    MyThread2(MyData dat){
        this.data=dat;
    }
    public void run(){
        data.display("Welcome");
    }
}