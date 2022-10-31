import java.util.HashMap;
import java.util.Map;

public class Main {
    public static Map<String, Integer> map = new HashMap<>();
    public static void main(String[] args){
        map.put("str1", 5);
        map.put("str2", 1);
        map.put("str1", 2);
        System.out.println(map);
    }
    public static void addMap(String x, Integer y){
        if(map.containsKey(x) && map.containsValue(x) && map.get(x).equals(y)){
            throw new RuntimeException("Error");
        }
        map.put(x,y);
    }
}