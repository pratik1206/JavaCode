import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class A {
    public static void main(String[] args) {
        String str = "apcsdr";
        char ch[] = str.toCharArray();
        for (int i=0;i<=ch.length-1;i++){
            System.out.println(ch[i]);
        }
         char array[] = {'j','a','b','d','i'};
         char max = ' ';
        Arrays.sort(array);

           max = array[array.length -1];

        System.out.println(max);

        System.out.println("*****************");

//         ArrayList<Character> al = new ArrayList<>(Arrays.asList(array));
//
//        System.out.println(al.stream().max(Comparator.naturalOrder()).get());




         int arr[] = {1,2,4,6,8,98,4,2,45};

         List<Integer> list = new ArrayList<>();
         for(int k : arr){
             list.add(k);
         }
        System.out.println(list);

         Integer listt = list.stream().mapToInt(a->a).max().orElse(0);
        System.out.println(listt);

    }
}
