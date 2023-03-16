//realized for linked and arraylists

import java.util.List;
import java.util.LinkedList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("1-st task");
        Transfer number = new Transfer("FFF", 18);
        String result = number.convertToBase(5);
        System.out.println(result);


        System.out.println("------------------------------");
        System.out.println("2nd task");

        List<Integer> l1 = new LinkedList<>(Arrays.asList(1, 3, 5, 7, 9, 33));
        List<Integer> l2 = new LinkedList<>(Arrays.asList(2, 4, 6, 8, 10, 33, 56));

        MyLinkedList myLinkedList1 = new MyLinkedList();
        myLinkedList1.add(1);
        myLinkedList1.add(3);
        myLinkedList1.add(5);
        myLinkedList1.add(7);
        myLinkedList1.add(9);
        myLinkedList1.add(33);

        MyLinkedList myLinkedList2 = new MyLinkedList();
        myLinkedList2.add(-6);
        myLinkedList2.add(2);
        myLinkedList2.add(4);
        myLinkedList2.add(8);
        myLinkedList2.add(10);
        myLinkedList2.add(33);
        myLinkedList2.add(56);

        List<Integer> mergedList = MergeTwoSortedLists.mergeLinkedLists(l1, l2);

        MyLinkedList myMergedLinkedList = MergeTwoSortedLists.mergeTwoMyLinkedLists(myLinkedList1, myLinkedList2);

//        System.out.println(mergedList);
//        System.out.println(l1);
//        System.out.println(l2);

        System.out.println(myMergedLinkedList);
        System.out.println(myLinkedList1);
        System.out.println(myLinkedList2);
    }
}
