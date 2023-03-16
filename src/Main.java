//realized for linked and arraylists

import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        List<Integer> l1 = new LinkedList<>(Arrays.asList(1, 3, 5, 7, 9, 33));
        List<Integer> l2 = new LinkedList<>(Arrays.asList(2, 4, 6, 8, 10, 33, 56));
        List<Integer> mergedList = MergeTwoSortedLists.mergeLinkedLists(l1, l2);
        System.out.println(mergedList);
        System.out.println(l1);
        System.out.println(l2);
    }
}
