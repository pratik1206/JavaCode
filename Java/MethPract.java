import java.util.Scanner;

public class MethPract {

    public static void main(String[] args) {
//        getTotal();
//        System.out.println(isEven());


//    public static void getTotal(){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the 2 number for total");
//        System.out.println("Enter 1st no");
//        int a = sc.nextInt();
//        System.out.println("Enter 2nd no");
//        int b = sc.nextInt();
//
//        int Total = a + b;
//        System.out.println("Total of 2 no are "+Total);
//    }


//    public static Boolean isEven(){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the input");
//        int eve = sc.nextInt();
//
//        if (eve%2==0){
//            return true;
//        }else
//            return false;
//
//    }


        int num = 6;
        boolean flag = false;
        for (int i = 2; i < num / 2; i++) {
            if(num%i==0){
                flag = true;
                break;
            }
        }
        if (!flag){
            System.out.println("its a prime number");
        }else{
            System.out.println("its not a prime number");
        }
    }
}
