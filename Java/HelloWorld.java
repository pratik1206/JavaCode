
import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");

        ArrayList al = new ArrayList();
        al.add(10);
        al.add(20);
        al.add(30);

        System.out.println(al);

        ListIterator itr = al.listIterator();

        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        while(itr.hasPrevious()){
            System.out.println(itr.previous());
        }

    }
}