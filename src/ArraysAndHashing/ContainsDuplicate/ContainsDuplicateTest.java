package ArraysAndHashing.ContainsDuplicate;

import org.junit.Assert;
import org.junit.Test;

public class
ContainsDuplicateTest {

    @Test
    public void containsDuplicate1() {
        int[] input = {1, 2, 3, 1};
        boolean expected = true;
        Assert.assertEquals(expected, new ContainsDuplicate().containsDuplicate(input));
    }

    @Test
    public void containsDuplicate2() {
        int[] input = {1, 2, 3, 4};
        boolean expected = false;
        Assert.assertEquals(expected, new ContainsDuplicate().containsDuplicate(input));
    }

    @Test
    public void containsDuplicate3() {
        int[] input = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        boolean expected = true;
        Assert.assertEquals(expected, new ContainsDuplicate().containsDuplicate(input));
    }
}