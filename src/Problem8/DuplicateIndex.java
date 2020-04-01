package Problem8;

import java.util.HashSet;
import java.util.Set;

/*
*  Complexity: O(n) in worst case if the duplicated elements is the last element
* */

public class DuplicateIndex {

    public static void main(String[] args) {
        System.out.println(indexOfFirstFuplicate(new int[]{ 5, 17, 3, 17, 4, -1 }));
    }

    static int indexOfFirstFuplicate(int[] arr){
        Set<Integer> uniqueArr = new HashSet<>();
        for(int i=0;i<arr.length;i++){
            if(!uniqueArr.add(arr[i])) {
                return i;
            }
        }
        return -1;
    }
}
