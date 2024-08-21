 class Singelton {

    private static final Singelton instance = new Singelton();

    private Singelton(){}

    public static Singelton getSingelton(){
        return instance;
    }

    public void dislay(){
        System.out.println("this is singelton class");
    }

     public static void main(String[] args) {
         Singelton singelton1 = Singelton.getSingelton();


         singelton1.dislay();

         Singelton singelton2 = Singelton.getSingelton();
         singelton2.dislay();
         System.out.println(singelton1.hashCode());
         System.out.println(singelton2.hashCode());
     }
}
