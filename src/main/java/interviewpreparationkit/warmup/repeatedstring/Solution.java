package interviewpreparationkit.warmup.repeatedstring;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Solution {

	// Complete the repeatedString function below.
	static long repeatedString(String s, long n) {
		long strLength = s.length();
		long reps = n / strLength;
		long rest = n % strLength;
		long result = (reps * getLetterCount(s, s.length()) + getLetterCount(s, rest));
		return result;
	}

	static long getLetterCount(String s, long strLength) {
		long count = 0;
		for (int i = 0; i < strLength; i++) {
			if (s.charAt(i) == 'a') {
				count++;
			}
		}
		return count;
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
//		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("output.txt"));

		String s = scanner.nextLine();

		long n = scanner.nextLong();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		long result = repeatedString(s, n);

		bufferedWriter.write(String.valueOf(result));
		bufferedWriter.newLine();

		bufferedWriter.close();

		scanner.close();
	}
}
