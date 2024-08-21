//public class c {
//    // Online Java Compiler
//// Use this editor to write, compile and run your Java code online
import java.util.*;
import java.util.stream.Collectors;
    class c{
        public static void main(String[] args) {
            System.out.println("Try programiz.pro");

            int arr[] = new int[5];
            arr[0] = 1;
            arr[1] = 2;
            arr[2] = 3;
            arr[3] = 35;
            arr[4] = 31;

            System.out.println(arr[4]);

            for(int i=0;i<arr.length;i++){
                System.out.println(arr[i]);
            }

            for(int x : arr){
                System.out.println(x);
            }
            Arrays.sort(arr);

            int max = arr[arr.length-1];
            System.out.println("Maximum from array  :"+max);


            String name = "pratik";

            String str = name
                    .chars()
                    .mapToObj(a->(char)a)
                    .sorted((a,b)->-1)
                    .map(String::valueOf).collect(Collectors.joining());
            System.out.println(str);

            List<String> items = List.of("apple", "banana", "cherry");

            Map<String,Long> itemlist = items.stream().collect(Collectors.groupingBy(a->a,Collectors.counting()));
            System.out.println(itemlist);


            String str1 = "vipul";


            String revstr = new StringBuilder(str1).reverse().toString();
            System.out.println(revstr);

            // int arry[] = {1,3,4,5,34,6,8,54};

            // ArrayList listarr =new ArrayList<>(Arrays.asList(arry));


            // System.out.println(listarr.stream().max(Comparator.naturalOrder())map(String.toString()));
        }
    }

