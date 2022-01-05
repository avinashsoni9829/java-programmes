public class Wrapper {
    public static void main(String[] args){

        // value of return wrapper class value
        Integer a = Integer.valueOf("123");
        // store the number in binary format 
        Integer b = Integer.valueOf("101010", 2);
        Double d = Double.valueOf("3.14");
        // pareseInt return Int value not Integer wrapper class value
        
        int aa = Integer.parseInt("123");
        // intvalue return the integer value 
        int e = a.intValue();

        
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("d = " + d);
        System.out.println("aa = " + aa);
        System.out.println("e  = " + e);

        

    }
}
