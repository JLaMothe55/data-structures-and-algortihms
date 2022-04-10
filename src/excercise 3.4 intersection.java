import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class intersection {
    List<Long> L1 = new LinkedList<Long>(Arrays.asList(11L, 22L, 23L, 28L, 30L, 40L ,50L));
    List<Long> L2 = new LinkedList<Long>(Arrays.asList(8L, 10L, 11L, 28L, 42L, 50L, 100L, 200L, 300L));
    List<Long> L3 = new LinkedList<Long>(Arrays.asList());

    public void intersectLists(){
        int list1position = 0;
        int list2position = 0;
        int list3Position = 0;

        while (list1position < L1.size() && list2position < L2.size()){
            if (L1.get(list1position) < L2.get(list2position)){
                list1position++;
            }
            else if (L2.get(list2position) < L1.get(list1position)){
                list2position++;
            }
            else {
                L3.add(L1.get(list1position));
                list1position++;
                list2position++;
            }
        }

        while (list3Position < L3.size()){
            System.out.printf("\n %d, \n", L3.get(list3Position));
            list3Position++;
        }

    }




    public static void main(String [] args){
        intersection intersect = new intersection();
        intersect.intersectLists();
        System.out.println("Time complexity is O(2N)");
    }
}
