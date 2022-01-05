class parent{
    static int y = 10;
}

class child extends parent {
     static
     {
          y = 2;
     }
}



public class staticInheritance {
  
    public static void main(String[] args) {
        
        System.out.println("child ka y = " + child.y);
        
        
    }
}
