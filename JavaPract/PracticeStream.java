import java.util.*;
import java.util.stream.Collectors;

public class PracticeStream {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,23,45,2,4,5,76,4433,78,65,90,5,2,4,4,1,45);
        //find maximum from list
        Integer maximum = list.stream().mapToInt(a->a).max().orElse(0);
        System.out.println("Maximum from the list is "+ maximum);

        //find minimum from list

        Integer minimum = list.stream().mapToInt(a->a).min().orElse(0);
        System.out.println("minimum from list is = "+ minimum);

        //find 2nd minimum from the list

        Optional<Integer> secondMinimum = list.stream().sorted().distinct().skip(1).findFirst();
        System.out.println("SecondMinimum from list"+ secondMinimum);

        //find 2nd maximum from the list

        Optional<Integer> secondMaximum = list.stream().sorted(Comparator.reverseOrder()).distinct().skip(1).findFirst();
        System.out.println("Second maximum from list"+secondMaximum);

        //sorted list

        List<Integer> sortedList = list.stream().sorted().collect(Collectors.toList());
        System.out.println("sorted list"+sortedList);

        //2nd way reverse order

        List<Integer> sortedList1 = list.stream().sorted((a,b)->b-a).collect(Collectors.toList());
        System.out.println("sort reverse order"+ sortedList1);

        //remove duplicate from list

        List<Integer> Duplicate = list.stream().distinct().collect(Collectors.toList());
        System.out.println("List after duplicate removed = "+ Duplicate);

        // find the average of list

        Double Average = list.stream().mapToDouble(a -> a).average().orElse(0.0);
        System.out.println("Average = " +Average);

        //Find the Even from list

       List<Integer> Even =  list.stream().filter(n->n%2==0).collect(Collectors.toList());
        System.out.println("Even no from list = "+Even);

//        Another List
        List<String> list1 = Arrays.asList("pratik","rahul","SAMARTH","ankush");
//    To make uppercase
           List<String> Uppercase = list1.stream().map(a->a.toUpperCase()).collect(Collectors.toList());
        System.out.println("Uppercase list -"+Uppercase);

          //Reverse the list

        List<String> Reverse = list1.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println("ReverseList = "+Reverse);


//        String problem
        String input = "Hi My Name Is Pratik , Pratik";
//    //How do you find frequency of each element from the String.

        Map<Character,Long> Frequency =  input.chars().mapToObj(a->(char)a).collect(Collectors.groupingBy(a->a,Collectors.counting()));
        System.out.println("Frequency" + Frequency);


        List<String> List = Arrays.asList("apple", "banana", "apple", "orange", "banana", "apple");
        //How do you find frequency of each element in an array or a lis?
        Map<String,Long> Freq = List.stream().collect(Collectors.groupingBy(a->a,Collectors.counting()));
        System.out.println(Freq);


    }
}
