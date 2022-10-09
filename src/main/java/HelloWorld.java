public class HelloWorld {

	private static boolean almostIncreasingSequence(int[] sequence) {
		int count = 0;
		int max = 0;
		int count2 = 0;
		int count3 = 0;
		boolean count4 = false;
		for (int i = 0; i < sequence.length - 1; i++) {
			if (sequence[i] == sequence[i + 1] && sequence.length == 2)
				continue;

			if (sequence[i] >= sequence[i + 1]) {
				max = sequence[i];
				count++;


				count2 = sequence.length - (i + 1);
				for (int j = i + 1; j < sequence.length - 1; j++) {
					if (sequence[j] < sequence[j + 1]) {
						count3++;
					}
				}
				count4 = count2 <= count3;

			}
			if (sequence[i] < sequence[i + 1]) {

			}
			// if (count == 1 && max == sequence[sequence.length - 1])
			//     count++;

			// if (count == 1 && max == sequence[i + 1])
			//     count++;

		}
		System.out.println("count: " + count);
		System.out.println("count2: " + count2);
		System.out.println("count3: " + count3);
		System.out.println("count4: " + count4);
		return (count < 2) && (count4);
	}

	private static boolean almostIncreasingSequence2(int[] sequence) {
		int count1 = 0;
		int count2 = 0;
		int max = sequence[0];
		for (int i = 0; i < sequence.length - 1; i++) {
			if (sequence[i] >= sequence[i + 1]) {
				count1++;
			}
			if (count1 > 0 && i >= sequence.length / 2) {
				count2++;
			}

		}
		System.out.println("count: " + count1);
		System.out.println("count: " + count2);
		return count1 > 1;
	}

	boolean almostIncreasingSequenceNew(int[] array) {
		int max = 0;
		int flag = 0;
		for (int i = 1; i < array.length - 1; i++) {
			if (flag > 1) return false;

			if (array[i - 1] <= array[i] && array[i] < array[i + 1]) {
				max = array[i + 1];
			} else if (array[i - 1] > array[i] && array[i] > array[i + 1] || array[i - 1] == array[i] && array[i] == array[i + 1]) {
				return false;
			} else if (array[i - 1] > array[i] && array[i] < array[i + 1] && array[array.length - 1] <= array[i - 1]) {
				flag++;
				max = array[i + 1];
			} else if (array[i - 1] < array[i] && array[i] > array[i + 1]) {
				flag++;
				if (flag > 1) return false;
				max = array[i];
				//if (i + 1 == array.length - 1) {
				if (i == array.length - i) {
					return true;
				}
				if (array[i + 1] > array[i - 1] && array[i + 1] < array[array.length - 1])
					flag--;
			} else {
				flag++;
				max = array[i + 1];
			}

			if (flag == 1 && i == array.length - 2 && array[array.length - 1] > array[i - 1])
				return true;
		}
		return flag < 2;
	}

	boolean almostIncreasingSequenceNew2(int[] array) {
		int max = 0;
		int flag = array.length;
		for (int i = 0; i < array.length - 1; i++) {

			//if (flag > 1) return false;
			//if (array.length <= 2) return true;
			//if (array[i] == array[i + 1] && flag > 0) return false;

			if (array[i] >= array[i + 1]) {
				//max = array[i];
				//flag++;
				System.out.println("Bad number in position " + i);
			} else if (array[i] < array[i]) {
				flag--;
			}
		}
		return flag < 2;
	}

	boolean almostIncreasingSequenceWhile3(int[] sequence) {
		int i = 0;
		int j = 1;
		int count = 0;
		while (i < sequence.length - 1 && j <= sequence.length - 1) {
			//if (count > 1) return false;
			if (sequence[i] <= sequence[j]) {
				i += 1;
				j += 1;
			} else {
				j += 1;
				//i += 2;
				count += 1;
			}
		}
		return count <= 1;
	}

	private static boolean almostIncreasingSequenceInt(int[] array) {
		int flag = 0;
		int i = 1;
		int size = array.length;
		int badNumberPosition = 0;

		//if (array.length <= 2) return 0;

		while (i < size - 1) {

			if (flag > 0) {

			}

//			System.out.println("array[i - 1]: " + array[i - 1]);
//			System.out.println("array[  i  ]: " + array[i]);
//			System.out.println("array[i + 1]: " + array[i + 1]);
//			System.out.println();

			if (array[i - 1] < array[i] && array[i] < array[i + 1]) {

			} else

			if (array[i - 1] < array[i] && array[i] > array[i + 1]) {
				flag++;
				if (array[i + 1] > array[i - 1])
					badNumberPosition = i;
				else if (array[i + 1] == array[i - 1])
					badNumberPosition = i + 1;
			} else

			if (array[i - 1] > array[i] && array[i] < array[i + 1]) {
				if (array[i + 1] > array[i - 1]) {
					i++;
					continue;
				} else if (array[i - 1] != array[badNumberPosition]) {
					flag++;
				}
			} else

			if (array[i - 1] > array[i] && array[i] > array[i + 1]) {
				return false;
			} else

			if (array[i - 1] <= array[i] && array[i] < array[i + 1]) {
				if (array[i - 1] != array[badNumberPosition] || array[i - 1] <= array[i]) {
					flag++;
					badNumberPosition = i;
				}
			} else

			if (array[i - 1] >= array[i] && array[i] > array[i + 1]) {
				return false;
			} else

			if (array[i - 1] < array[i] && array[i] <= array[i + 1]) {
				flag++;
				badNumberPosition = i;
			} else

			if (array[i - 1] > array[i] && array[i] >= array[i + 1]) {
				return false;
			}

			i++;
		}

		System.out.println("Bad number in position " + badNumberPosition);

		return flag < 2;
	}

	private static int getOddElement2(int x1, int x2, int x3) {
		int oddElement = 0;

		if ((x1 > x3 && x3 > x2) || (x3 > x2 && x1 == x3))
			oddElement = x1;

		else if ((x2 > x3 && x3 > x1) || (x3 > x1 && x2 < x1) || (x1 == x2 && x3 > x2) || (x1 < x3 && x2 == x3))
			oddElement = x2;

		else if ((x2 > x1 && x2 > x3 && x1 > x3) || (x3 < x2 && x1 == x3))
			oddElement = x3;

		return oddElement;
	}

	private static int getOddElement(int[] array) {
		int oddElement = -1;

		if (array.length == 3) {
			if ((array[0] > array[2] && array[2] > array[1]) || (array[2] > array[1] && array[0] == array[2]))
				oddElement = 0;

			else if ((array[1] > array[2] && array[2] > array[0]) || (array[2] > array[0] && array[1] < array[0]) || (array[0] == array[1] && array[2] > array[1]) || (array[0] < array[2] && array[1] == array[2]))
				oddElement = 1;

			else if ((array[1] > array[0] && array[1] > array[2] && array[0] > array[2]) || (array[2] < array[1] && array[0] == array[2]))
				oddElement = 2;
		}

		return oddElement;
	}


	/*static boolean almostIncreasingSequence3(int[] array) {
		int flag = 0;
		int[] temp;
		int oddElementIndex;

		if (array.length <= 2) return true;

		for (int i = 1; i < array.length - 1; i++) {

			if (flag > 1) return false;

			if (flag > 0) {
				if (!(array[i] < array[i + 1])) {
					return false;
				}
			} else {
				temp = Arrays.copyOfRange(array, i - 1, i + 2);
				System.out.println(Arrays.toString(temp));
				oddElementIndex = getOddElement(temp);

				if (oddElementIndex != -1) {
					System.out.println("Odd array index: " + oddElementIndex);
					flag++;
				}
			}
		}

		return flag < 2;
	}*/

	boolean almostIncreasingSequence3(int[] sequence) {
		int invalidItemsCount = 0;
		for (int i = 1; i < sequence.length; i++) { //  1..4
			if (sequence[i] <= sequence[i - 1]) {
				invalidItemsCount++;
				if (invalidItemsCount > 1)
					return false;

				if (i == sequence.length - 1 && invalidItemsCount == 1)
					return true;

				if (i > 1)
					if (sequence[i] <= sequence[i - 2] && sequence[i + 1] <= sequence[i - 1])
						return false;
			}
		}
		return true;
	}

	/*
	// Java

	boolean almostIncreasingSequence(int[] array) {
        int badCount = 0;
        int preMaxValue = -1_000_000;

        for (int i = 1; i < array.length - 1; i++) {
            if (array[i - 1] >= array[i]) {
                badCount++;
                if (array[i + 1] <= array[i - 1]) {
                    if (i > 1)
                        preMaxValue = array[i - 2];
                } else if (array[i + 1] > array[i - 1] && array[i + 1] > array[i])
                    continue;
            }
            if (badCount > 0)
                if (array[i] <= preMaxValue || array[i + 1] <= array[i])
                    badCount++;
        }

        return badCount <= 1;
	}

	*/

	/*
	// JavaScript 6

	function almostIncreasingSequence(sequence) {
    let invalidItemsCount = 0;
    for (let i = 1; i < sequence.length; i++) {
        if (sequence[i] <= sequence[i-1]) {
            invalidItemsCount++;
            if (invalidItemsCount > 1)
                return false;
            if (sequence[i] <= sequence[i-2] && sequence[i+1] <= sequence[i-1])
                return false;
        }
    }
    return true;
	}

	*/

	public static void main(String args[]) {

		int[][] intArray = {
				{9, 1, 2, 3, 4},        // 0
				{1, 1, 2, 3, 4},		// 0

				{1, 8, 3, 4, 5},		// 1
				{10, 8, 20, 30, 40},	// 0
				{8, 8, 20, 30, 40},		// 0
				{1, 3, 3, 4, 5},		// 1

				{1, 2, 5, 3, 5},		// 2
				{1, 2, 1, 3, 4},////////// 2
				{0, 1, 1, 2, 3},		// 1
				{1, 2, 9, 7, 8},		// 2
				{1, 2, 3, 3, 4},		// 2

				{1, 2, 5, 3, 6},		// 2
				{1, 2, 3, 3, 4},		// 2
				{1, 2, 3, 9, 4},		// 3
				{0, 1, 4, 5, 5},		// 3

				{1, 2, 3, 4, 2},////////// 4
				{1, 1, 2, 3, 4, 4},// 3
				{40, 50, 60, 10, 20, 30},
				{3, 6, 5, 8, 10, 20, 15},
				{3, 5, 67, 98, 3},
				{1, 3, 2, 1}
		};

		System.out.println(intArray.length);

		System.out.println("This is only in branch-1");
	}
}
