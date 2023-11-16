package testarr;

import checkarr.CheckArrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class TestArrays {
    @MethodSource("addTestArrWithValAfterOne")
    @ParameterizedTest
    public void testRetArrWithValAfterOne(int[] arr1, int[] arr2) {
       Assertions.assertArrayEquals(arr2, CheckArrays.retArrWithValAfterOne(arr1));
    }

    public static Stream<Arguments> addTestArrWithValAfterOne() {
        List<Arguments> out = new ArrayList<>();
        out.add(Arguments.arguments(new int[]{1, 2, 1, 2, 2}, new int[]{2, 2}));
        out.add(Arguments.arguments(new int[]{1, 1, 1}, new int[0]));
        out.add(Arguments.arguments(new int[]{3, 4, 5, 1}, new int[0]));
        return out.stream();
    }
    @Test
    public void testAllMethods() {
        Assertions.assertAll(
                () -> {
                    Assertions.assertThrows(RuntimeException.class, () -> CheckArrays.retArrWithValAfterOne(new int[]{2, 2}));
                },
                () -> {
                    Assertions.assertTrue(CheckArrays.onlyOneAndTwo(new int[]{1, 2, 1, 2, 2}));
                },
                () -> {
                    Assertions.assertFalse(CheckArrays.onlyOneAndTwo(new int[]{1, 1, 1}));
                },
                () -> {
                    Assertions.assertFalse(CheckArrays.onlyOneAndTwo(new int[0]));
                }
        );
    }
}
