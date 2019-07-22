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
        return 1;
    }

    /*
    {1, 1, 1, 0}
    {0, 5, 0, 1}
    {2, 1, 3, 10
    */

    void matrixElementsSum2(int[][] matrix) {
        int sum = 0;
        int badCoordX = 0;
        int badCoordY = -1;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j <= matrix.length; j++) {
                System.out.print(matrix[i][j] + " ");

                if (matrix[i][j] == 0) {
                    badCoordY = j;
                }

                if (badCoordY != j) {
                    sum = sum + matrix[i][j];
                }
            }
            System.out.println();
        }
        System.out.println("Sum: " + sum);
    }
}
