
package TwoSum1;


import org.junit.Assert;
import org.junit.Test;


/**
 * @author toxodia
 **/
public class TwoSumTest {
    @Test
    public void SumTest1() {
        int[] input = {2, 7, 11, 15};
        int target = 9;
        int[] expected = {0, 1};
        Assert.assertEquals(expected, new TwoSum().twoSum(input, target));
    }

    @Test
    public void SumTest2() {
        int[] input = {3, 2, 4};
        int target = 6;
        int[] expected = {1, 2};
        Assert.assertEquals(expected, new TwoSum().twoSum(input, target));
    }

    @Test
    public void SumTest3() {
        int[] input = {2, 7, 11, 15};
        int target = 6;
        int[] expected = {0, 1};
        Assert.assertEquals(expected, new TwoSum().twoSum(input, target));
    }

}
