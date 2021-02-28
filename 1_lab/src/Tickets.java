import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Tickets implements ITask {
    @Override
    public String run(List<String> data) {
        return String.valueOf(digit(Integer.parseInt(data.get(0).trim())));
    }

    public long digit(int num) {
        long count = 0;

        Map<Integer, Integer> sumMap = new HashMap<Integer, Integer>();
        List<Integer> sumArray = getArray(num);
        for (Integer sum : sumArray) {
            if (sumMap.containsKey(sum)) {
                sumMap.put(sum, sumMap.get(sum)+1);
            } else {
                sumMap.put(sum, 1);
            }
        }

        for(Map.Entry<Integer, Integer> item : sumMap.entrySet()){
            count += ((long)(item.getValue())*item.getValue());
        }
        return count;
    }

    private List<Integer> getArray(int n) {
        if (n == 1) {
            ArrayList<Integer> resultArray = new ArrayList<Integer>(10);
            for (int i1 = 0; i1 <= 9; i1++) {
                resultArray.add(i1);
            }
            return resultArray;
        }

        List<Integer> sumArray = getArray(n-1);
        List<Integer> resultArray = new ArrayList<Integer>(2*sumArray.size());

        for (Integer integer : sumArray) {
            for (int i2 = 0; i2 <= 9; i2++) {
                resultArray.add(integer + i2);
            }
        }

        return resultArray;
    }
}
