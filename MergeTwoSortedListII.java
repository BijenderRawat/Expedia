import java.util.ArrayList;

class MergeTwoSortedListII {
    public void merge(ArrayList<Integer> a, ArrayList<Integer> b) {
        int i = 0, j = 0;
        while (i < a.size() && j < b.size()) {
            if (a.get(i) <= b.get(j))
                i++;
            else {
                a.add(i, b.get(j));
                j++;
            }
        }
        while (j < b.size()) {
            a.add(b.get(j));
            j++;
        }
    }
}
