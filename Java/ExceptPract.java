//
////Write a Java program that reads a list of integers from the user and throws an exception if any
//// numbers are duplicates.
//
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Scanner;
//
//
//class DuplicateFound extends Exception{
//    DuplicateFound(String message){
//        super(message);
//    }
//}
//public class ExceptPract {
//    public static void main(String[] args) {
//        try {
//            Scanner sc = new Scanner(System.in);
//            System.out.println("How many numbers you want");
//            int n = sc.nextInt();
//            System.out.println("Enter the numbers");
////            int[] number = new int[n];
//            List<Integer> list = new ArrayList<>();
//            for (int i = 0; i < n; i++) {
//                int num = sc.nextInt();
//                checkDuplicate(list, num);
//                list.add(num);
//            }
//            System.out.println("no is not duplicate");
//        }catch (Exception e){
//            System.out.println(e);
//        }
////        System.out.println("no is not duplicate");
//
//    }
////    public static void checkDuplicate(int[] number,int num,int indexval) throws DuplicateFound {
////        for (int i = 0; i < indexval; i++)
////            if (number[i] == num) {
////                throw new DuplicateFound("number found duplicate   " + num);
////            }
////    }
//   public static void checkDuplicate(int number,int num) throws DuplicateFound {
////    for (int i = 0; i < indexval; i++)
//       List<Integer> st = new ArrayList<>();
//        if (number.Contains()) {
//            throw new DuplicateFound("number found duplicate   " + num);
////        }
//}
//    }
//
//
//
//
//
////import java.util.Scanner;
////
////class CmpairNumber extends Exception{
////    CmpairNumber(String Message){
////        super(Message);
////    }
////}
////public class ExceptPract{
////    public static void main(String[] args) {
////
////        for(int i=0;i<=10;i++) {
////            Scanner sc = new Scanner(System.in);
////            System.out.println("enter integer u want");
////            int Number = sc.nextInt();
////            System.out.println(Number);
////
////            for(int j=0;j<=i;j++){
////                if(Number==j){
////                    System.out.println("");
////                }
////            }
////        }
//
////        try{
////            CheckNumber();
////        }catch (Exception e){
////            System.out.println(e);
////        }
//
////    }
////    public static void CheckDuplicate() throws CmpairNumber{
////       for(int i=0;i<=10;i++) {
////            Scanner sc = new Scanner(System.in);
////            System.out.println("enter integer u want");
////            int Number = sc.nextInt();
////            System.out.println(Number);
////              int num = Number;
////             if(Number== num){
////                 throw new CmpairNumber("No is a Same");
////             }
////            }
////    }
//
//
//
//
//// Write a Java program to create a method that takes a string as input and throws an exception if
//// the string does not contain vowels.
//
////import java.util.Scanner;
////
////class checkStringException extends Exception{
////    checkStringException(String message){
////        super(message);
////            }
////
////}
////public class ExceptPract{
////    public static void main(String[] args) {
////       try{
////           Scanner sc = new Scanner(System.in);
////           System.out.println("enter a stringp");
////           String st = sc.nextLine();
//////           String st = "pratik";
////           CheckVowels(st);
////           System.out.println(st+"has a vowels");
////       }catch (Exception e){
////           System.out.println(e);
////       }
////    }
////    public static void CheckVowels(String st) throws checkStringException{
////        boolean hasVowels = false;
////       for(int i=0;i<=st.length()-1;i++){
////           char ch = st.charAt(i);
////           if(ch == 'a' || ch == 'e' || ch =='i' || ch =='o' || ch=='u'){
////             hasVowels = true;
////             break;
////           }
////       }
////       if(!hasVowels){
////           throw new checkStringException(st + "doesent have any vowels");
////       }
////    }
////
////
////}
//
//
//
//
//
//
//
//
//
//
//
//
//
//
////class checkevenOddException extends Exception{
////    checkevenOddException(String message){
////        super(message);
////    }
////}
////
////public class ExceptPract{
////    public static void main(String[] args) {
////        try{
////            int number = 10;
////            chekEven(number);
////            System.out.println(number);
////        }catch (Exception e){
////            System.out.println(e);
////        }
////    }
////    public static void chekEven(int number) throws checkevenOddException{
////        if(number%2 != 0){
////            throw new checkevenOddException(number + "no is not even, odd no is not allowed");
////        }
////    }
////}
//
//
//
//
////import java.io.FileInputStream;
////import java.io.FileNotFoundException;
////import java.sql.SQLOutput;
////
//// class OddEvenNumberException extends Exception{
////     OddEvenNumberException(String message){
////        super(message);
////        }
////        }
////public class ExceptPract {
////
////
////    public static void main(String[] args) {
////        ExceptPract ep = new ExceptPract();
////        ep.reader();
//////        try{
//////            int n = 7;
//////            checkEven(n);
//////            System.out.println(n);
//////        }catch(OddEvenNumberException e){
//////            System.out.println(e);
//////        }
////    }
////    public static void checkEven(int number) throws OddEvenNumberException {
////        if (number % 2 != 0) {
////            throw new OddEvenNumberException(number + " is odd. Odd numbers are not allowed.");
////        }
////    }
////
////    public void reader(){
////   try {
////       FileInputStream fl = new FileInputStream("C:\\Users\\pratikw\\Documents\\sqghjdata.txt");
//////       System.out.println("File not found exception handled");
////   }
////   catch(Exception e){
////       System.out.println(e);
////        }
////    }
////}
