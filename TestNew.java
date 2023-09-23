public class TestNew {
    static float b = 2.4f;
    public static void main(String [] args){
        var a =10;
        int p =89765;
        
        int c = Integer.reverse(p);
        String binaryString = Integer.toBinaryString(c);
        
        int d = Integer.parseInt("10100101011110101", 2);
        int e = Integer.parseInt("7654321");
        System.out.println(d);
        System.out.println(e);
    }
}