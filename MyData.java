public class MyData {
  synchronized  void display(String name){
        for(int i=0;i<name.length();i++){
            System.out.print(name.charAt(i));
        }
    }
}