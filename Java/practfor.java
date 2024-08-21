import java.util.Scanner;

public class practfor {
    public static void main(String[] args) {

//        int count = 0;
//        String st = "aaabc";
//
//        for (int i = 0; i < st.length(); i++) {
//            if (st.charAt(i) == 'a') {
//                count++;
//            }
//        }
//        int height = 3;
//        int width = 10;
//
//        for (int i=1;i<=height;i++){
//
//            for(int j=1;j<=width;j++){
//                System.out.print("#");
//            }
//            System.out.println(" ");
//        }



        Scanner sc = new Scanner(System.in);

        System.out.println("enter ur choice");

//        int sum = 0;
//        for (int i = 1; i <= 5; i++) {
//            System.out.print("Enter an integer: ");
//            int num = scanner.nextInt();
//            sum += num;
//        }
//
//        System.out.println("Total is: " + sum);
//
//        scanner.close();

        int num = sc.nextInt();
        int first = 1;
        int sec = 0;
        int next =0 ;
        for (int i=1;i<=num;i++){
            System.out.println(first);
            next = first + i;
            sec = first;




        }

    }
}
