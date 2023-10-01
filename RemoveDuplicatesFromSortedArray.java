import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

class RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(ArrayList<Integer> a) {
        HashSet<Integer> set = new HashSet<>();
        for (int i : a)
            set.add(i);
        a.clear();
        Iterator<Integer> it = set.iterator();
        while (it.hasNext())
            a.add(it.next());
        Collections.sort(a);
        return a.size();
    }
}
