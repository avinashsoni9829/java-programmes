abstract class  Person{
     abstract void show();
}

class Student extends Person {
     void show(){
          System.out.println("hi!");
     }
}

public class AbstractClasses{
     public static void main(String[] args)
     {
          Student obj = new Student();
          obj.show();

     }
}