class Ax implements Runnable {
    @Override
    public void run() {
        for(int i = 0  ; i < 10 ; ++i){
             System.out.println("threadA" + i);
        }

    }
}

class Bx implements Runnable {
    @Override
    public void run() {
        for(int i = 0  ; i < 10 ; ++i){
             System.out.println("threadB" + i);
        }

    }
}

public class ThreadingConcept {


    public static void main(String[] args){
        Ax obj = new Ax();
        Bx obj1 = new Bx();
        Thread t1 = new Thread(obj);
        Thread t2 = new Thread(obj1);
        t1.start();
        t2.start();

    }
}