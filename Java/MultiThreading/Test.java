package MultiThreading;

public class Test extends Thread{
    @Override
    public void run() {
        System.out.println("this is a run method");
        System.out.println(Thread.currentThread().getState());
        System.out.println("jgcvyjc"+Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        Test t1 = new Test();
        t1.setName("pratik");
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getPriority());
        System.out.println(Thread.currentThread().getState());
        t1.start();
        System.out.println(Thread.currentThread().getState());
        Test t2 = new Test();
        t2.start();
        System.out.println(Thread.currentThread().getState());

    }
}
