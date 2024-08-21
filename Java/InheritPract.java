class Animal{
    void makesound(){
        System.out.println("Animal makes sound");
    }
}
class cat extends Animal{
    void makesound(){
        super.makesound();
        System.out.println("cat makes sound");
    }
}

public class InheritPract {
    public static void main(String[] args) {
  cat ct =new cat();
  ct.makesound();
    }
}
