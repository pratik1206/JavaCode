import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class RevNumber {
    public static void main(String[] args) {

//        wap program to reverse a number
//        int rev = 0;
//
//        int num = 12321;
//         int org = num;
//        while(num!=0){
//            rev=rev*10+ num%10;
//            num = num / 10;
//        }
//        System.out.println(rev);
//
//        if (rev==org){
//            System.out.println("its pallindrome");
//        }
//        else {
//            System.out.println("its not a pallindrome");
//        }

//        String a[] = {"java","a","c","python","c"};
//        String b[]= new String[a.length];
//        int z=0;
//        boolean flag = false;
//        for (int i=0;i<a.length;i++){
//            for (int j=i+1;j<a.length;j++){
//                if (a[i]==a[j]){
//                      flag = true;
//                    b[z]=a[i];
//                    z= +1;
//                    }
//                }
//            }
//        if (flag){
//            System.out.println("duplicate  found");
//            for ( String d : b) {
//                System.out.println("duplicate elemnt is" + d);
//            }
//        }else {
//            System.out.println("duplicate element not found");
//        }
//


        String name = "sakshi";

        int count = 0;

        for (int i = 0; i <= name.length() - 1; i++) {
            count++;
        }
        System.out.println(count);

        // program to find prime numbers
        boolean prime = true;
        int num = 3;

        for (int i = 2; i < num / 2; i++) {
            if (num % i == 0) {
                prime = false;
            }
        }
        if (prime == true) {
            System.out.println("number is prime");
        } else {
            System.out.println("number is not prime");
        }


        //program to find 2nd largest elemnt from array

        int ar[] = {1, 2, 4, 34, 6, 32, 5, 9};
        int secondlar = 0;
        for (int i = 0; i < ar.length; i++) {
            System.out.println(ar[i]);
        }

        Arrays.sort(ar);
        secondlar = ar[ar.length - 2];
        System.out.println("Second largest elemnt is " + secondlar);


        // java program to find factorial from 1 to 100

        int fact = 1;
//        int num1 = 100;

        for (int i = 1; i < (100 + 1); i++) {
//            System.out.println(fact);
            fact = fact * i;
//            System.out.println(fact);
        }
        System.out.println("fact " + fact);


        // wap to find largest and smallest  elemnt from array


        int array[] = {1, 3, 4, 5, 567, 4, 3, 9, 8, 6, 56, 1};

        int max = array[0];
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("min array  " + min);
        System.out.println("maximum fromarray is " + max);

        //wap to sort array in assending and descending order

        int x[] = {23, 45, 2, 1, 5, 8, 65, 78};

        Arrays.sort(x);
        for (int i : x) {
            System.out.println("the sorted array in assending order" + i);
        }

        for (int i = x.length - 1; i >= 0; i--) {
            System.out.println("array in descending order" + x[i]);
        }

//         wap to print a fibonassi series

        int first = 0, second = 1, next = 0;
        int num1 = 25;
        for (int i = 0; i <= num1; i++) {
            System.out.print(" " + first);

            next = first + second;
            first = second;
            second = next;
        }
        System.out.println();
//         wap to Reverse a string in java

        String name1 = "nikhil";
        String rev = " ";
        for (int i = name1.length() - 1; i >= 0; i--) {
            rev = rev + name1.charAt(i);
        }
        System.out.println("Reverse string is" + rev);

//         wap to find the string is pallindrome or not

        String name12 = "nayan";
//        String n = name12;
        String reve = "";
        for (int i = name12.length() - 1; i >= 0; i--) {
            reve = reve + name12.charAt(i);
        }
        System.out.println("Reverse string is" + reve);

        if (name12.equalsIgnoreCase(reve)) {
            System.out.println("String is pallindrome");
        } else {
            System.out.println("string is not a pallindrome");
        }


//        wap to find duplicate element from array
        String a[] = {"c", "c", "c", "c", "a", "a"};
        String b[] = new String[a.length];
        int z = 0;
        boolean flag = false;
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length - 1; j++) {
                if (a[i] == a[j]) {
                    System.out.println("lopping");
                    flag = true;
                    b[z] = a[i];
                    z++;
                }
            }
        }
        if (flag == true) {
//            System.out.println("duplicate  found");
            for (String d : b) {
                if (d != null) {
                    System.out.println("duplicate elemnt is " + d);
                }
            }
        } else {
            System.out.println("duplicate element not found");
        }


//           wap to check 2 string are anagram or not

        String str1 = "live";
        String str2 = "vile7";

        str1.toLowerCase();
        str2.toLowerCase();

        char chararray1[] = str1.toCharArray();
        char chararray2[] = str2.toCharArray();

        Arrays.sort(chararray1);
        Arrays.sort(chararray2);

        if (Arrays.equals(chararray1, chararray2)) {
            System.out.println("string is anagram");
        } else {
            System.out.println("String is not an anagram");
        }
// write a java program to count the digit in integer
        int num2 = 12345;
        int count1 = 0;
        while (num2 != 0) {
            num2 = num2 / 10;
            count1++;
        }
        System.out.println(count1);


//      wap get maximum from the arraylist using java 8

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 4, 6, 7, 5, 3, 5, 6, 7, 23));

        Integer maxi = list.stream().mapToInt(k -> k).max().orElse(0);
        System.out.println(maxi);

        //      wap get minimum from the arraylist using java 8

        int mini = list.stream().mapToInt(j -> j).min().orElse(0);
        System.out.println(mini);

        int sum2 = list.stream().mapToInt(t -> t).sum();
        System.out.println("sum of arraylist"+sum2);

        double ave = list.stream().mapToDouble(p->p).average().orElse(0.0);
        System.out.println("ave of numbers"+ave);


//How do you find frequency of each character in a string using Java 8 streams?
        String inputString = "Java Concept Of The Day";
        Map<Character,Long> countString = inputString.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(c->c,Collectors.counting()));
        System.out.println(countString);

        //     find sum of all digits of a number in Java?

        int n = 123456;

        int sum = 1;

        while(sum!=0){

            int lastdigit = n % 10;

            sum = sum + lastdigit;

            n = n / 10;
        }
        System.out.println("some of digit from number"+sum);

        

    }
}
