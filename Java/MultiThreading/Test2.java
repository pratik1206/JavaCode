package MultiThreading;

public class Test2 implements Runnable {
    public static void main(String[] args) {
        Test2 t2 = new Test2();
        Thread th = new Thread(t2);
        th.start();
//        Test2 t3 = new Test2();
//        Thread th1 = new Thread(t3);
//        th1.start();
    }

    @Override
     public void run() {

        System.out.println("This is runnable interface method");
        System.out.println(Thread.currentThread().getPriority());
        System.out.println(Thread.currentThread().getName());
           synchronized (this) {
               for (int i = 0; i <= 10; i++) {
//                   System.out.println(i+1000);
                   try {
                       Thread.sleep(2000);
                   } catch (Exception e) {
                       System.out.println(e);
                   }
            System.out.println("This is thread 1sec sleep");

               }

           }
        System.out.println(Thread.currentThread().getName());
    }
}
