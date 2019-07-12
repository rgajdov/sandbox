import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

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

	public boolean almostIncreasingSequenceWhile(int[] sequence) {
		int count = 0;
		int i = 0;
		int j = 0;
		int inc = 0;
		int dec = 0;
		int max = sequence[0];

		while(i < sequence.length - 1 && count < 2) {
			System.out.print("i: " + i + ", ");

			if (count > 0 && max != sequence[0]) {
				if (sequence[i] <= max) {
					dec++;
					System.out.println(sequence[i] + " > " + sequence[i + 1] + ", dec: " + dec);
					count++;
					break;
				}
			}

			if (sequence[i] >= sequence[i + 1]) {
				dec++;
				max = sequence[i];
				System.out.println(sequence[i] + " > " + sequence[i + 1] + ", dec: " + dec);
				count++;
			} else {
				inc++;
				System.out.println(sequence[i] + " < " + sequence[i + 1] + ", inc: " + inc);
			}
			/*if (count > 0 && sequence[i + 1] < max) {
				count++;
				break;
			}*/
			i++;
		}

		System.out.println("count: " + count);

		return count < 2;
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



	public static void main(String args[]) {

	}
}
