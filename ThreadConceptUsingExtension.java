class AA extends Thread {
    public void run() {
        for(int  i = 1 ; i < 10 ; ++i){
              System.out.println("THread in A" + i);
        }
    }
}

class BB extends Thread {
    public void run() {
        for(int i = 1 ; i < 10 ; ++i){
            System.out.println("Thread in B" + i);
        }
    }
}


public class ThreadConceptUsingExtension {
   
    public static void main(String[] args){
         AA ob1 = new AA();
         BB ob2 = new BB();
         ob1.start();
         ob2.start();
         
    }

}
