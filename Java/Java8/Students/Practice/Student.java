package Java8.Students.Practice;

public class Student {

    private String Name;
    private String Age;
    private String Address;
    private String MobileNumber;

    public Student(String name, String age, String address, String mobileNumber) {
        Name = name;
        Age = age;
        Address = address;
        MobileNumber = mobileNumber;
    }

    public String getName() {
        return Name;
    }

    public String getAge() {
        return Age;
    }

    public String getAddress() {
        return Address;
    }

    public String getMobileNumber() {
        return MobileNumber;
    }

    @Override
    public String toString() {
        return "Student{" +
                "Name='" + Name + '\'' +
                ", Age='" + Age + '\'' +
                ", Address='" + Address + '\'' +
                ", MobileNumber='" + MobileNumber + '\'' +
                '}';
    }
}
