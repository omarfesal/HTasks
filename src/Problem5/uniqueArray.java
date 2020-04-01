package Problem5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class uniqueArray {
    public static void main(String[] args) {
        // Example 1
        String[] s = unique(new String[]{"apples", "apples"});
        System.out.println(Arrays.toString(s));

        // Example 2
        String[] s2 = unique(new String[]{"apples", "oranges", "flowers", "apples"});
        System.out.println(Arrays.toString(s2));

    }


    static String[] unique(String[] strArray){
        List uniqueArr = new ArrayList<String>();
        for (int i = 0; i < strArray.length ; i++) {
            if(uniqueArr.indexOf(strArray[i]) == -1)  uniqueArr.add(strArray[i]);
            else uniqueArr.remove(strArray[i]);
        }
        Object[] uniqueObjects= uniqueArr.toArray();
        String[] uniqueStrArr = Arrays.copyOf(uniqueObjects,uniqueObjects.length, String[].class);
        return uniqueStrArr;
    }
}
