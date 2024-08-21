package Java8;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PracticeStreamProblems {
    public static void main(String[] args) {
        String input = "Hi My Name Is Pratik , Pratik";

        Map<Character,Long> Frequencymap = input.chars().mapToObj(c-> (char) c).collect(Collectors.groupingBy(a->a,Collectors.counting()));

        Frequencymap.forEach((character,frequency)-> System.out.println("char = "+character+" frquency   "+frequency));





          //How do you find frequency of each element in an array or a list?

        List<String> list = Arrays.asList("apple", "banana", "apple", "orange", "banana", "apple");

        Map<String,Long> FrequencyChar = list.stream().collect(Collectors.groupingBy(a->a,Collectors.counting()));

        FrequencyChar.forEach((Word,Frequency)-> System.out.println("Word  = "+Word+"   Frequency   "+Frequency ));

//        How do you sort the given list of decimals in reverse order?

        List<Double> decimalList = Arrays.asList(12.45, 23.58, 17.13, 42.89, 33.78, 71.85, 56.98, 21.12);

        List<Double> collect = decimalList.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println("List in the Reverse Order"+collect);

//    Given a list of strings, join the strings with ‘[‘ as prefix, ‘]’ as suffix and ‘,’ as delimiter?
        List<String> listOfStrings = Arrays.asList("Facebook", "Twitter", "YouTube", "WhatsApp", "LinkedIn");

        String collect1 = listOfStrings.stream().collect(Collectors.joining("," ,"[" ,"]"));

        System.out.println("Joining the String"+collect1);


//        From the given list of integers, print the numbers which are multiples of 5?

        List<Integer> listOfIntegers = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);

        List<Integer> collect2 = listOfIntegers.stream().filter(a -> a % 5 == 0).collect(Collectors.toList());
        System.out.println("no which are divisible by 5 are"+collect2);


//        Given a list of integers, find maximum and minimum of those numbers?

        List<Integer> listOfIntegerss = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);

        double maxlist = listOfIntegerss.stream().mapToInt(a->a).max().orElse(0);
        System.out.println("max no from list is "+maxlist);

        double minlist = listOfIntegerss.stream().mapToInt(a->a).min().orElse(0);
        System.out.println("min from list  "+minlist);


//        How do you get three maximum numbers and three minimum numbers from the given list of integers?
        List<Integer> listOfaIntegers = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);

        listOfaIntegers.stream().mapToInt(a -> a).sorted().limit(3).forEach(System.out::println);
//        System.out.println("minimum 3 no from list"+limit);

        listOfaIntegers.stream().sorted(Comparator.reverseOrder()).limit(3).forEach(System.out::println);

//  Given a list of strings, sort them according to increasing order of their length?

        List<String> listOfStringsa = Arrays.asList("Java", "Python", "C#", "HTML", "Kotlin", "C++", "COBOL", "C");
        List<String> liststr =  listOfStringsa.stream().sorted(Comparator.comparing(String::length)).collect(Collectors.toList());
        System.out.println("sorting order string length   ="+liststr);


//        Given an integer array, find sum and average of all elements?

        int[] a = new int[] {45, 12, 56, 15, 24, 75, 31, 89};

             int sum = Arrays.stream(a).sum();
        System.out.println("Sum of arrays using stream  "+sum);


        double ave = Arrays.stream(a).average().orElse(0.0);
        System.out.println("Average of no  "+ave);





    }

}
