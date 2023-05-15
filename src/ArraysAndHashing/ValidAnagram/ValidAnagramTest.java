package ArraysAndHashing.ValidAnagram;



import org.junit.Assert;
import org.junit.Test;

public class ValidAnagramTest{
    @Test
    public void isAnagram1(){
        String s = "anagram";
        String t = "nagaram";
        boolean expected = true;
        Assert.assertEquals(expected, new ValidAnagram().isAnagram(s, t));
    }
    @Test
    public void isAnagram2(){
        String s = "rat";
        String t = "car";
        boolean expected = false;
        Assert.assertEquals(expected, new ValidAnagram().isAnagram(s, t));
    }
}