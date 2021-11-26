import java.util.Arrays;

public class listPartitioning {
    public static boolean isSubsetSumEqual(int[] numbers) {
        int sumArray = 0;
        Arrays.sort(numbers);

        for (int num: numbers) {
            sumArray = sumArray + num;
        }
        if (sumArray % 2 != 0){
            return false;
        }
        else {
            int sumSubArray = sumArray / 2;
            int i = 1;
            while (sumSubArray > 0){
                if (sumSubArray >= numbers[numbers.length - i]) {
                    sumSubArray -= numbers[numbers.length - i];
                }
                i++;
                if (sumSubArray == 0){
                    return true;
                }
                if (numbers.length - i == 0){
                    return false;
                }
                }
            }
            return false;
        }
    }


