public class Demo{

    int a =12;
    static int b = 65;
    public static void main(String [] args){
        int c = 7;
        System.out.println("Hello World");
    } 
}



class Test{

    Demo d = new Demo();
    public void meth(){
        System.out.println(d.a);
        System.out.println(Demo.b);
    }
    
}