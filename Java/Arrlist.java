import java.util.*;
public class Arrlist {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("red");
        list.add("Green");
        list.add("Orange");
        list.add("white");
        list.add("Black");
        System.out.println(list);// to print the all list items
        System.out.println(list.get(0));// for getting perticular element by index

        // this is to iterat over a list
        ListIterator itr = list.listIterator();

        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        //this is to add element at perticular index
         list.add(0,"pratik");
        System.out.println(list);

        //Write a Java program to update an array element by the given element
        System.out.println("list before updation"+list);
        list.set(2,"waghmode");
        System.out.println("List after updation"+list);

        //Write a Java program to remove the third element from an array list.

        list.remove(3);
        System.out.println("Array element afetr removing 3rd elemnt"+list);

        //Write a Java program to search for an element in an array list.

          if (list.contains("pratik")){
              System.out.println("element found");
          }else {
              System.out.println("elemnt not found");
          }
        //Write a Java program to sort a given array list.
        Collections.sort(list);
        System.out.println("List after sorting"+list);

          //Write a Java program to copy one array list into another.

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("nikhil");
        list2.add("Samarth");
        list2.add("umesh");

        System.out.println(list2);

        list2.addAll(list);

        System.out.println("this is list after merging"+list2);

        //Write a Java program to shuffle elements in an array list.

        Collections.shuffle(list);
        System.out.println("list after shuffeling element"+list);

        // Write a Java program to reverse elements in an array list.
        Collections.reverse(list);
        System.out.println("list after reversing a elemnt"+list);

        //Write a Java program to extract a portion of an array list.

        List<String> sublist = list.subList(0,3);
        System.out.println("extracted portion from arraylist"+sublist);


    }
}
