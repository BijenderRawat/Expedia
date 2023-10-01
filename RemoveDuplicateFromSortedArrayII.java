import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

class RemoveDuplicateFromSortedArrayII {
    public int removeDuplicates(ArrayList<Integer> a) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : a)
            if (!map.containsKey(i))
                map.put(i, 1);
            else
                map.replace(i, map.get(i) + 1);
        a.clear();
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() < 2)
                a.add(entry.getKey());
            else {
                a.add(entry.getKey());
                a.add(entry.getKey());
            }
        }
        Collections.sort(a);
        return a.size();
    }
}