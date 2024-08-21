import java.util.*;
public class PercentageCalculator {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter your math marks");
         int math = sc.nextInt();
        System.out.println("Enter your chem marks");
        int chem = sc.nextInt();
        System.out.println("Enter your bio marks");
        int bio = sc.nextInt();
        System.out.println("Enter your science marks");
        int science = sc.nextInt();
        System.out.println("Enter your physic marks");
        int physic = sc.nextInt();

        int Total = math + chem + bio + science + physic;
        System.out.println(Total);
        int percentage = Total / 5 ;

        System.out.println("Total percentage= "+ percentage + "%");

         if (percentage>=90){
             System.out.println("You Got ! Grade 1");
         } else if (percentage<90 && percentage >80) {
             System.out.println("You Got ! Grade 2");
         }
         else if (percentage<80 && percentage >70) {
             System.out.println("You Got ! Grade 3");
         }else if (percentage<70 && percentage >60) {
             System.out.println("You Got ! Grade 4");
         }else if (percentage<60 && percentage >40) {
             System.out.println("You Got ! Grade 5");
         }else if (percentage<40) {
             System.out.println("Sorry! You are fail");
         }
    }
}
