import java.util.Arrays;

public class CodeSignal {

    public boolean almostIncreasingSequence0(int[] sequence) {
        int index = 0;
        int error = 0;

        // 1, 2, 5, 3, 5

        for (int x = 0; x < sequence.length - 1; x++) {
            if (sequence[x + 1] <= sequence[x]) { //flag
                error++;
                if (x > 0 && x < sequence.length - 2) {
                    if (sequence[x] >= sequence[x + 2])
                        index = x;
                    else
                        index = x + 1;
                }
            }

            if (error > 1)
                return false;
        }

        if (index != 0) {
            return sequence[index + 1] > sequence[index - 1];
        }
        return true;
    }

    public boolean almostIncreasingSequence(int[] array) {
        int badCount = 0;
        //int maxIndex = 0;
        //int maxValue = 0;
        int preMaxValue = -1_000_000;

        for (int i = 1; i < array.length - 1; i++) {
            if (array[i - 1] >= array[i]) {
                badCount++;
                if (array[i + 1] <= array[i - 1]) {
                    //maxValue = array[i - 1];
                    //maxIndex = i - 1;
                    if (i > 1)
                        preMaxValue = array[i - 2];
                } else if (array[i + 1] > array[i - 1] && array[i + 1] > array[i]) {
                    //maxValue = array[i];
                    //maxIndex = i;
                    continue;
                }
            }
            if (badCount > 0)
                if (array[i] <= preMaxValue || array[i + 1] <= array[i])
                    badCount++;
        }

        //System.out.println("maxNumberIndex: " + maxIndex);
        //System.out.println("maxNumberValue: " + maxValue);

        return badCount <= 1;
    }

    int matrixElementsSum(int[][] matrix) {
        int sum = 0;
        for (int j = 0; j < matrix[0].length; j++) {
            for (int i = 0; i < matrix.length; i++) {
                sum = sum + matrix[i][j];
                if (matrix[i][j] == 0) {
                    break;
                }
            }
        }
        return sum;
    }

    String[] allLongestStrings(String[] inputArray) {
        String[] resultArray = new String[inputArray.length];
        int maxStrLen = 0;
        int currentStrLen = 0;
        int previousStrLen = 0;

        for (int i = 1; i < inputArray.length; i++) {
            currentStrLen = inputArray[i].length();
            previousStrLen = inputArray[i - 1].length();
            if (previousStrLen > currentStrLen && previousStrLen >= maxStrLen) {
                maxStrLen = previousStrLen;
                //System.out.println(maxStrLen);
                System.out.println(inputArray[i - 1]);
                resultArray[i - 1] = inputArray[i - 1];
            } else {
                if (currentStrLen >= maxStrLen) {
                    maxStrLen = currentStrLen;
                    System.out.println(inputArray[i]);
                    resultArray[i - 1] = inputArray[i];
                }
                //System.out.println(maxStrLen);
            }

        }

        System.out.println(Arrays.asList(resultArray));

        return resultArray;
    }

    int max(int a, int b) {
        int result = (a > b) ? a : b;
        System.out.println("Max number is " + result);
        return result;
    }

    int max2(int a, int b) {
        return (a > b) ? a : b;
    }





}
