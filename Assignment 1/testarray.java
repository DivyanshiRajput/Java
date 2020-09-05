class TestArray {

	public static void main(String[] args) {

		System.out.println("Step 1");
		int[] ints1 = new int[10];
		for (int i=0;i<10;i++) {
			System.out.println(ints1[i]);
		}

		System.out.println("Step 2");
		int val =1;
		int val2 = 10;
		int[] ints2 = new int[10];
		for (int i=0;i<10;i++) {
		ints2[i] = i*val + val2;
			System.out.println(ints2[i]);
		}

		System.out.println("Step 3");
		int[] ints3 = new int[10];
		for (int i=0;i<10;i++) {
			System.out.println(ints3[i]);
		}

		/*System.out.println("Step 4");
		int[] ints4 = null;
		for (int i=0;i<10;i++) {
			System.out.println(ints4[i]);
		}*/

		System.out.println("Step 5");
		int[] ints5 = new int[10];
		for (int i=0;i<10;i++) {
			ints5[i] = i;
			System.out.println(ints5[i]);
		}

	}

}
