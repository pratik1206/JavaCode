public class Employee{
    String Name;
    String role;
    public Employee(String Name,String role)
    {
        this.Name=Name;
        this.role=role;
    }
    String getName(){
        return Name;
    }
    String getRole(){
        return role;
    }
    Double getSalary(){
        return 0.0;
    }
}
class manager extends Employee{

    double salary;
    double bounus;

    public manager(String Name, String role,double salary,double bounus) {
        super(Name, role);
        this.salary=salary;
        this.bounus=bounus;
    }
    @Override
    Double getSalary(){
        return salary + bounus;
    }

    public static void main(String[] args) {
//        manager man = new manager("pratik","Manager",20000,2000);
//        System.out.println(man.getSalary());
//
//        Employee emp1 = new Manager("Lilo Heidi", 7500.0, 1500.0);
//        Employee emp2 = new Programmer("Margrit Cathrin", 5000.0, 600.0);
//
//        System.out.println("Manager: " + emp1.getName() + "\nRole: " + emp1.getRole() + "\nSalary: $" + emp1.calculateSalary());
//        System.out.println("\nProgrammer: " + emp2.getName() + "\nRole: " + emp2.getRole() + "\nSalary: $" + emp2.calculateSalary());

        Employee emp = new manager("pratik","Manager",12000,3000);
        System.out.println("ename"+emp.getName()+"\nerole"+emp.getRole()+"\nsalary"+emp.getSalary());
    }

    }




//public class Employee {
//    int salary;
//
//    public Employee(int salary){
//        this.salary=salary;
//    }
//    void work(){
//        System.out.println(" working as a employee");
//    }
//    int getSalary(){
//       return salary;
//    }
//}
//
//class HrManager extends Employee{
//
//    public HrManager(int salary){
//        super(salary);
//    }
//    void work(){
//
//        System.out.println(" working as hrmanager");
//    }
//    void addEmployee(){
//        System.out.println("hr is adding some Employee");
//    }
//
//    public static void main(String[] args) {
//          Employee emp = new Employee(20000);
//          HrManager hr = new HrManager(30000);
//
//          emp.work();
//        System.out.println("employees salary"+emp.getSalary());
//
//          hr.addEmployee();
//          hr.work();
//        System.out.println("hrsalary"+hr.getSalary());
//    }
//}