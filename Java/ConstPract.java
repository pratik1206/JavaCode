public class ConstPract {
//    String Brand;
//   public ConstPract(){
//       this.Brand="Ford";
//   }
//    public String getBrand(){
//        return Brand;
//    }

      int width;
      int height;
     int  depth;
    ConstPract(){
        System.out.println("Constructor is without parameter");
        width = 10;
        height = 20;
        depth =30;
    }
    ConstPract(int width,int height,int depth){
        System.out.println("this is a parameterised constructor");
        this.width=width;
        this.height=height;
        this.depth=depth;

    }
     void volume(){
        int vol = width * height * depth;
         System.out.println("vol is"+vol);
     }



//    public void Display(){
//        System.out.println("car is running");
//    }
    public static void main(String[] args) {
//        ConstPract br = new ConstPract();
//        System.out.println(br.getBrand());
//
//        mySwitch mysw = new mySwitch();
//        mysw.off();
//        mysw.on();

        ConstPract ct = new ConstPract();
        ct.volume();
        ConstPract ct1 = new ConstPract(10,2000,300);
        ct1.volume();

    }
}
//interface Switch {
//    void on();
//    void off();
//}
//class mySwitch implements Switch{
//    public void on(){
//        System.out.println("Switch is on");
//    }
//    public void off(){
//        System.out.println("Switch is off");
//    }
//}