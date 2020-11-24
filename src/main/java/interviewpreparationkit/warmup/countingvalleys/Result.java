package interviewpreparationkit.warmup.countingvalleys;

class Result {

	/*
	 * Complete the 'countingValleys' function below.
	 *
	 * The function is expected to return an INTEGER. The function accepts following
	 * parameters: 1. INTEGER steps 2. STRING path
	 */

	public static int countingValleys(int steps, String path) {
		// Write your code here
		int valleys = 0;
		int altitude = 0;
		for (int i = 0; i < steps; i++) {
			switch (path.charAt(i)) {
			case 'D':
				if (altitude == 0) {
					valleys++;
				}
				altitude--;
				break;
			case 'U':
				altitude++;
				break;
			}
		}
		return valleys;
	}
}
