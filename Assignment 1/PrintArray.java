public class PrintArray {

	public static void main(String[] args) {
		/* Step 1*/
		int[] arr1 = new int[12];
		print(arr1);

		/* Step 2
		int[] arr2 = null;
		print(arr2);
		*/

		/* Step 3*/
		double[] doubles = new double[20];
		print1(doubles);  // can this be made to work without changing the type of doubles?

	}
  static void print1(double[] array){
    for (int i = 0; i< array.length; i++){
      System.out.println(array[i]);
    }
  }
	static void print(int[] array) {
		for (int i = 0; i< array.length;i++) {
			System.out.println(array[i]);
		}
	}
}
