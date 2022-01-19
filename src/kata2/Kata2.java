package kata2;

import java.util.HashMap;
import java.util.Map;

public class Kata2 {

    public static void main(String[] args) {
        int[] data = {2, 5, 8, 6, 7, 15, 455, 58, 78, 8, 11, 6, 9, 8, 20, 5, 7};
        HashMap<Integer, Integer> histogram = new HashMap();
        for (int i = 0; i < data.length; i++) {
            int j = data[i];
            if(histogram.containsKey(j)){
                histogram.put(j, (histogram.get(j) + 1));
            } else{
                histogram.put(j, 1);
            }
        }
        
        for (Map.Entry<Integer, Integer> entry : histogram.entrySet()) {
            System.out.println(entry.getKey() + "==>" + entry.getValue());
        }
    }
    
}
