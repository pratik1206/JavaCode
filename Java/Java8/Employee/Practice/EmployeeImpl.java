package Java8.Employee.Practice;
import java.util.*;
import java.util.stream.Collectors;

public class EmployeeImpl {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<Employee>();

        employeeList.add(new Employee(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
        employeeList.add(new Employee(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0));
        employeeList.add(new Employee(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
        employeeList.add(new Employee(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0));
        employeeList.add(new Employee(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0));
        employeeList.add(new Employee(166, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0));
        employeeList.add(new Employee(177, "Manu Sharma", 35, "Male", "Account And Finance", 2010, 27000.0));
        employeeList.add(new Employee(188, "Wang Liu", 31, "Male", "Product Development", 2015, 34500.0));
        employeeList.add(new Employee(199, "Amelia Zoe", 24, "Female", "Sales And Marketing", 2016, 11500.0));
        employeeList.add(new Employee(200, "Jaden Dough", 38, "Male", "Security And Transport", 2015, 11000.5));
        employeeList.add(new Employee(211, "Jasna Kaur", 27, "Female", "Infrastructure", 2014, 15700.0));
        employeeList.add(new Employee(222, "Nitin Joshi", 25, "Male", "Product Development", 2016, 28200.0));
        employeeList.add(new Employee(233, "Jyothi Reddy", 27, "Female", "Account And Finance", 2013, 21300.0));
        employeeList.add(new Employee(244, "Nicolus Den", 24, "Male", "Sales And Marketing", 2017, 10700.5));
        employeeList.add(new Employee(255, "Ali Baig", 23, "Male", "Infrastructure", 2018, 12700.0));
        employeeList.add(new Employee(266, "Sanvi Pandey", 26, "Female", "Product Development", 2015, 28900.0));
        employeeList.add(new Employee(277, "Anuj Chettiar", 31, "Male", "Product Development", 2012, 35700.0));

        System.out.println(employeeList.get(0));
//// How many male and female employees are there in the organization?
//
//          Map<String,Long> empl = employeeList.stream().collect(Collectors.groupingBy(n->n.getGender(),Collectors.counting()));
//
//          empl.forEach((gender,Count)-> System.out.println("Male  "+gender+"Count  "+Count));
////        Print the name of all departments in the organization?
//
//        List<String> collect = employeeList.stream().map(a -> a.getDepartment()).collect(Collectors.toList());
//
//        System.out.println(collect);
//
//
//        OptionalDouble average = employeeList.stream().mapToInt(a -> a.getAge()).average();
//        System.out.println(average);
////         What is the average age of male and female employees?
//        Map<String,Double> str = employeeList.stream().collect(Collectors.groupingBy(a->a.getGender(),Collectors.averagingDouble(a->a.getAge())));
//        System.out.println(str);
//
//// Get the details of highest paid employee in the organization?
//        Optional<Employee> highestPaidEmployeeWrapper=
//                employeeList.stream().collect(Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)));
//
//        Employee highestPaidEmployee = highestPaidEmployeeWrapper.get();
//
//        System.out.println("Details Of Highest Paid Employee : ");
//
//        System.out.println("==================================");
//
//        System.out.println("ID : "+highestPaidEmployee.getId());
//
//        System.out.println("Name : "+highestPaidEmployee.getName());
//
//        System.out.println("Age : "+highestPaidEmployee.getAge());
//
//        System.out.println("Gender : "+highestPaidEmployee.getGender());
//
//        System.out.println("Department : "+highestPaidEmployee.getDepartment());
//
//        System.out.println("Year Of Joining : "+highestPaidEmployee.getYearOfJoining());
//
//        System.out.println("Salary : "+highestPaidEmployee.getSalary());
//
//// Get the names of all employees who have joined after 2015?
//
//        employeeList.stream().filter(a -> a.getYearOfJoining() >= 2015).map(Employee::getName).forEach(System.out::println);
////        System.out.println(collect1.);
//
////         Count the number of employees in each department?
//s
//        Map<String,Long>  count = employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.counting()));
//        System.out.println(count);
//
////         What is the average salary of each department?
//        Map<String,Double>  count1 = employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.averagingDouble(a->a.getSalary())));
//        System.out.println(count1);
//
////        Get the details of youngest male employee in the product development department?
//
//        Optional<Employee> min = employeeList.stream().filter(a -> a.getGender() == "Male" && a.getDepartment() == "Product Development").min(Comparator.comparingInt(Employee::getAge));
//        System.out.println(min);
//
//
////         Who has the most working experience in the organization?
//
//
//        Optional<Employee> first = employeeList.stream().sorted(Comparator.comparing(Employee::getYearOfJoining)).findFirst();
//        System.out.println(first);
//
////         How many male and female employees are there in the sales and marketing team?
//
//        Map<String, Long> collect1 = employeeList.stream().filter(a -> a.getDepartment() == "Sales And Marketing").collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
//        System.out.println(collect1);
//
//        //What is the average salary of male and female employees?
//
//        Map<String,Double>  count2 = employeeList.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.averagingDouble(a->a.getSalary())));
//        System.out.println(count2);
//
////         List down the names of all employees in each department?
//
////        Map<String,String> countlist = employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment),Comparator.comparing(Employee::getName));
//        Map<String, List<String>> employeesByDepartment = employeeList.stream()
//                .collect(Collectors.groupingBy(Employee::getDepartment,
//                        Collectors.mapping(Employee::getName, Collectors.toList())));
//
//        employeesByDepartment.forEach((department, names) -> {
//            System.out.println("Department: " + department);
//            System.out.println("Employees: " + names);
//            System.out.println(); // Add a newline for readability
//        });
//
////        What is the average salary and total salary of the whole organization?
//
//        double sum = employeeList.stream().mapToDouble(a->a.getSalary()).sum();
//        System.out.println("Sum of salaries"+sum);
//
//        double ave = employeeList.stream().mapToDouble(a->a.getSalary()).average().orElse(0.0);
//        System.out.println("average"+ave);
//
////        Separate the employees who are younger or equal to 25 years from those employees who are older than 25 years.
//
//        List<Employee> emp =    employeeList.stream().filter(a->a.getAge()<=25).collect(Collectors.toList());
//        System.out.println(emp);
//
////        Who is the oldest employee in the organization? What is his age and which department he belongs to?
//
////        employeeList.stream().filter(a->a.getYearOfJoining()).findFirst();

        Map<String,Long> genderlist = employeeList.stream().map(a->a.getGender()).collect(Collectors.groupingBy(a->a,Collectors.counting()));
        System.out.println(genderlist);

        List<String> dept = employeeList.stream().map(m->m.getDepartment()).collect(Collectors.toList());
        System.out.println(dept);
        //avg age of male and female

        Map<String,Double> avgage = employeeList.stream().collect(Collectors.groupingBy(a->a.getGender(),Collectors.averagingDouble(a-> a.getAge())));
        System.out.println(avgage);

        // count the no of employee in each dept

      Map<String,Long> empcount =   employeeList.stream().collect(Collectors.groupingBy(a->a.getDepartment(),Collectors.counting()));
        System.out.println(empcount);

        //get all employees joined after 2015

        List<Employee> empdata = employeeList.stream().filter(a->a.getYearOfJoining()>=2015).collect(Collectors.toList());
        System.out.println(empdata);

         //2nd highest salery of employee

            Optional<Employee> secondsal = employeeList.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).distinct().skip(1).findFirst();
            System.out.println(secondsal);
    }
}
