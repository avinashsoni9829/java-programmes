public class GenericTemp{
    public <T> void printArray(T [] a){
          for(int  i = 0  ; i < a.length ; i++){ 
              System.out.println(a[i]);
          }
    }


    public static void main(String[] args){
        GenericTemp o = new GenericTemp();
        String c[] = new String[]{"INDIA","aus","nz"};
        Integer numbers[] = {19 , 828 ,838 ,2};
        o.printArray(c);
        o.printArray(numbers);
        
    }
}

