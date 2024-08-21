package Java8.Students.Practice;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import  java.util.*;

public class StudentImpl  {
    public static void main(String[] args) {

        List<Student> list = new ArrayList<>();
         list.add(new Student("Pratik","16","Rupeenagar","7249001757"));
          list.add(new Student("Samarth","20","PuneStation","456789679"));
           list.add(new Student("Bharti","36","fburhv","45678"));
        list.add(new Student("Nikhil","34","Rupeenagar","7249001757"));

           List<Student> str = list.stream().filter(a->a.getName().startsWith("P")).collect(Collectors.toList());
           System.out.println(str);

//           //Get student with exact match name "jayesh"

        List<Student> str1 = list.stream().filter(a->a.getName().contains("Samarth")).collect(Collectors.toList());
        System.out.println(str1);

        // Get student with matching address "1235"

        List<Student> str2 = list.stream().filter(a->a.getAddress().equals("Rupeenagar")).collect(Collectors.toList());
        System.out.println(str2);

        //Get all student having mobile numbers 3333.

        List<Student> str3 = list.stream().filter(a->a.getMobileNumber().equals("7249001757")).collect(Collectors.toList());
        System.out.println("List of student with same mobile number"+str3);

//        Convert List<Student> to List<String> of student name

        System.out.println(list.stream().map(Student::getName).collect(Collectors.joining(",","[","]")));



//
        List<String> nameList =  Arrays.asList("Jayesh", "Dany", "Khyati", "Hello", "Mango");
        System.out.println(nameList.stream().map(a->a.toUpperCase()).collect(Collectors.toList()));
    }
}
