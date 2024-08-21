package Java8;

interface Enjoy{
    public void Runner();
}

public class PracticeLambda {
    public static void main(String[] args) {

        Enjoy eng = () -> {
            System.out.println("this is run method");
        };

        Runnable emp = () -> {

           for (int i=0;i<=5;i++){
               System.out.println(i+100);
//               Thread.sleep(2000);
               try {
                   Thread.sleep(2000);
               }catch (Exception e) {
                   System.out.println(e);
               }
           }
        };

        Thread th = new Thread(emp);
        th.start();

        Thread th1 = new Thread(emp);
        th1.start();
    }
}
