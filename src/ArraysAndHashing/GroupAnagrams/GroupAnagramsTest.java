package ArraysAndHashing.GroupAnagrams;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class GroupAnagramsTest {

    @Test
    public void groupAnagrams1() {
        String[] input = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> expected = new ArrayList<>(List.of(
                new ArrayList<>(List.of("eat", "tea", "ate")),
                new ArrayList<>(List.of("bat")),
                new ArrayList<>(List.of("tan", "nat"))
        ));
        Assert.assertEquals(expected, new GroupAnagrams().groupAnagrams(input));
    }

    @Test
    public void groupAnagrams2() {
        String[] input = {""};
        List<List<String>> expected = new ArrayList<>(List.of(
                new ArrayList<>(List.of(""))
        ));
        Assert.assertEquals(expected, new GroupAnagrams().groupAnagrams(input));
    }

    @Test
    public void groupAnagrams3() {
        String[] input = {"a"};
        List<List<String>> expected = new ArrayList<>(List.of(
                new ArrayList<>(List.of("a"))
        ));
        Assert.assertEquals(expected, new GroupAnagrams().groupAnagrams(input));
    }
}