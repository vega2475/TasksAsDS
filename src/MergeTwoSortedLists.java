import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MergeTwoSortedLists {
    public static List<Integer> mergeArrayLists(List<Integer> l1, List<Integer> l2) {
        List<Integer> mergedList = new ArrayList<>();
        int i = 0, j = 0;
        while (i < l1.size() && j < l2.size()) {
            if (l1.get(i) < l2.get(j)) {
                mergedList.add(l1.get(i));
                i++;
            } else {
                mergedList.add(l2.get(j));
                j++;
            }
        }
        while (i < l1.size()) {
            mergedList.add(l1.get(i));
            i++;
        }
        while (j < l2.size()) {
            mergedList.add(l2.get(j));
            j++;
        }
        l1.clear();
        l2.clear();
        return mergedList;
    }

    public static List<Integer> mergeLinkedLists(List<Integer> l1, List<Integer> l2) {
        List<Integer> mergedList = new LinkedList<>();
        while (!l1.isEmpty() && !l2.isEmpty()) {
            if (l1.get(0) < l2.get(0)) {
                mergedList.add(l1.get(0));
                l1.remove(0);

            } else {
                mergedList.add(l2.get(0));
                l2.remove(0);

            }
        }
        while (!l1.isEmpty()) {
            mergedList.add(l1.get(0));
            l1.remove(0);
        }
        while (!l2.isEmpty()) {
            mergedList.add(l2.get(0));
            l2.remove(0);
        }
        return mergedList;
    }

}
