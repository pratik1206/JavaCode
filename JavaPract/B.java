import java.util.*;
import java.util.stream.Collectors;

public class B {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,6,4,33,5};

        int max = arr[0];

        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println(max);

        char array[] = {'j', 'a', 'b', 'd', 'i'};

        ArrayList<Character> str1 = new ArrayList<>();
        for(char p : array){
            str1.add(p);
        }



        Optional<Character> str = str1.stream().sorted(Comparator.reverseOrder()).findFirst();
        System.out.println(str);
//        ArrayList<String> al = new ArrayList<>(Arrays.asList(array.toString()));
//        String name = al.stream().max(Comparator.naturalOrder()).get();
//        System.out.println(name);\


        String name = "Pratik ubsn hdc djc hdc j";

//        ArrayList<String> namelist = new ArrayList<>(Arrays.asList(name.toString()));
////        for(String d : name){
////            namelist.add(d);
////        }

        Map<Character,Long> listname = name.chars().mapToObj(a->(char)a).collect(Collectors.groupingBy(a->a,Collectors.counting()));
        System.out.println(listname);


        String input = "programming";

        input.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(a->a, Collectors.counting()))
                .entrySet().stream().filter(entry -> entry.getValue() > 1)
                .forEach(entry -> System.out.println("Character: " + entry.getKey() + ", Count: " + entry.getValue()));
    }
}
