package Java8;

import java.util.*;
import java.util.stream.Collectors;

public class Practicestream {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,23,45,2,4,5,76,4433,78,65,90,5,2,4);
           //find maximum from list
         int dlist = list.stream().mapToInt(a->a).max().orElse(0);
        System.out.println(dlist);
           //find minimum from list
        int elist = list.stream().mapToInt(a->a).min().orElse(0);
        System.out.println(elist);

          //find 2nd minimum from the list
        Optional<Integer> glist  = list.stream().sorted().distinct().skip(1).findFirst();
        System.out.println("2nd minimum from list   "+glist);

           //find 2nd maximum from the list

        Optional<Integer> hlist = list.stream().sorted(Comparator.reverseOrder()).distinct().skip(1).findFirst();
        System.out.println("2nd maximum from list "+hlist);

//        List<Integer> flist = list.stream().filter(a -> a > 10).collect(Collectors.toList());
//        System.out.println("nos greater than 10 are"+flist);
//
//        List<Integer> alist = list.stream().filter(a-> a > 10 ).sorted().collect(Collectors.toList());
//        System.out.println("sorted list"+alist);
//
//        List<Integer> blist = list.stream().sorted((a,b) -> b - a).collect(Collectors.toList());
//        System.out.println("sorted list"+blist);
//
//
//
//        List<Integer> collect = list.stream().distinct().collect(Collectors.toList());
//        System.out.println("Remove Duplicate elemnts"+collect);
//
//        Double collect1 = list.stream().mapToInt(a -> a).average().orElse(0.0);
//        System.out.println(collect1);
//
//
//        int even = list.stream().filter(n -> n % 2 == 0).mapToInt(a->a).sum();
//        System.out.println("sum of even nos   "+even);
//
//        int odd = list.stream().filter(n->n%2==1).mapToInt(n->n).sum();
//        System.out.println("sum of oddd"+odd);
//
//        list.stream().filter(n->n%2==0).mapToInt(n->n).forEach(System.out::println);
//
//
//
//
//
//        List<String> list1 = Arrays.asList("pratik","rahul","SAMARTH","ankush");
//        list1.stream().map(a->a.toUpperCase()).forEach(System.out::println);
//
        List<String> clist = Arrays.asList("SAMARTH","RAHUL","samarth","PRATIK","samarth");
//        clist.stream().map(a->a.toLowerCase(Locale.ROOT)).forEach(System.out::println);
//        System.out.println("-------------");
//        List<String> collect2 = clist.stream().distinct().collect(Collectors.toList());
//        System.out.println(collect2);
//
//
//        long sum1 = clist.stream().filter(a->a.startsWith(String.valueOf("S"))).count();
//        System.out.println("Count of string With Starting letter"+sum1);
//
//
//        List<String> str = clist.stream().sorted().collect(Collectors.toList());
//        System.out.println("sorted list of string"+ str);
//
//        List<String> str1 = clist.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
//        System.out.println("sorted list of string"+ str1);
    }
}
