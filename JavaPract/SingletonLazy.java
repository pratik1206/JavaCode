public class SingletonLazy {

    private static SingletonLazy samosa;
    private SingletonLazy(){}

    public static SingletonLazy getSamosa(){
        if (samosa==null){
            samosa = new SingletonLazy();
        }
        return samosa;
    }

    public void eatSamosa(){
        System.out.println("this LazySingleton");
    }

    public static void main(String[] args) {
        SingletonLazy samo = SingletonLazy.getSamosa();

        samo.eatSamosa();
    }

}
