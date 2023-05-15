package ArraysAndHashing.ValidAnagram;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        List<String> list1 = new ArrayList<>(Arrays.asList(s.split("")));
        List<String> list2 = new ArrayList<>(Arrays.asList(t.split("")));
        Collections.sort(list1);
        Collections.sort(list2);
        return list1.equals(list2);
    }
}
