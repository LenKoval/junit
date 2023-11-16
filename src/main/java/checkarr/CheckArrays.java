package checkarr;

public class CheckArrays {
    static int[] retArr;

    public CheckArrays() {
    }

    public static int[] retArrWithValAfterOne(int[] arr) {
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                index = i;
            }
        }

        if (arr[index] != 1) {
            throw new RuntimeException();
        }

        retArr = new int[arr.length - (index + 1)];
        for (int i = 0; i < retArr.length; i++) {
            for (int j = index; j < arr.length; j++) {
                retArr[i] = arr[j];
            }
        }
        return retArr;
    }

    public static boolean onlyOneAndTwo(int[] arr) {
        int one = 0;
        int two = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                one = 1;
            } else if (arr[i] == 2) {
                two = 2;
            } else {
                return false;
            }
        }

        if (one == 1 && two == 2) {
            return true;
        }
        return false;
    }
}
