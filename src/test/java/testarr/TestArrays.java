package testarr;

import checkarr.CheckArrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestArrays {
    int[] int1 = {1, 2, 1, 2, 2};
    int[] int2 = {2, 2};

    int[] int3 = {1, 1, 1};
    int[] int4 = new int[0];

    int[] int5 = {3, 4, 5, 1};

    @Test
    public void testRetArrWithValAfterOneCaseOne() {
        Assertions.assertArrayEquals(int2, CheckArrays.retArrWithValAfterOne(int1));
    }

    @Test
    public void testRetArrWithValAfterOneCaseTwo() {
        Assertions.assertArrayEquals(int4, CheckArrays.retArrWithValAfterOne(int3));
    }

    @Test
    public void testRetArrWithValAfterOneCaseThree() {
        Assertions.assertArrayEquals(int4, CheckArrays.retArrWithValAfterOne(int5));
    }

    @Test
    public void testRetArrWithValAfterOneCaseException() {
        boolean ex = false;
        try {
            CheckArrays.retArrWithValAfterOne(int2);
        } catch (RuntimeException e) {
            ex = true;
        }
        Assertions.assertTrue(ex);
    }

    @Test
    public void testOnlyOneAndTwoCaseOne() {
        Assertions.assertTrue(CheckArrays.onlyOneAndTwo(int1));
    }

    @Test
    public void testOnlyOneAndTwoCaseTwo() {
        Assertions.assertFalse(CheckArrays.onlyOneAndTwo(int3));
    }

    @Test
    public void testOnlyOneAndTwoCaseThree() {
        Assertions.assertFalse(CheckArrays.onlyOneAndTwo(int4));
    }

}
