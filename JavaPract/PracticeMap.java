import java.util.HashMap;
import java.util.Map;

public class PracticeMap {
    public static void main(String[] args) {

        Map<String,Integer> map = new HashMap<>();
        map.put("pratik",1);
        map.put("ajit",2);
        map.put("nilesh",3);
        map.put("samarth",4);

        System.out.println(map);

       for (Map.Entry<String,Integer> setting : map.entrySet()){
           System.out.println("key= "+setting.getKey()+ "value = " + setting.getValue() );
       }


    }
}
