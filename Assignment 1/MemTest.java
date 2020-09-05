public class MemTest {

	public static void main(String[] args) {
		int N = 10000;
		int M = 10000;

		/* Step 1*/

		for (int i = 0; i< N;i++) {
			int[] box = new int[M];
		}

		/* Step 2 */
		int[][] boxes = new int[N][];

		for (int i = 0; i< N;i++) {
			boxes[i] = new int[M];
		}
	}
}
