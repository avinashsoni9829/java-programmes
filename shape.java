public class shape {
       private  int l , b , h;
       public void setData(int l , int b , int h) {
           this.l = l ;
           this.b = b;
           this.h = h;

       }  
       
       public void show(){
           System.out.println("length = " + l);
           System.out.println("breadth = " + b);
           System.out.println("height = " + h);

       }

       public static void main(String[] args){
           shape rectangle = new shape();
           rectangle.setData(12,10,15);
           rectangle.show();
                
       }


}
