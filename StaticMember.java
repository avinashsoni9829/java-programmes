public class StaticMember{
    int x ; // instance variable 
    static int  y ; //static member variable 

    public void fun1(){
        //static int z; //  error : Non Static function me static variable define nahi ho sakte 

        x  = 4;
        y = 4;
    };
    public static void fun2(){
        //x = 4; //  error : static function me sirf static variable hi use ho sakte h 
        y = 4;

    }
    // outer class me static inner class bana sakte h  
        static class test{
        public static String coutry = "INDIA";
    }

    public static void main(String[] args){
        // StaticMember mem1 = new StaticMember();
         // mem1 has only x it cant access the y variable as it is a non static object and y is available for whole class   
        
         // in order to use static variable outside the class we need to use Classname.staticvariable not using any object of the class
        StaticMember.y = 4;
        
    
            
    }

}