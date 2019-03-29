
public class Series {

	public static void main(String[] args) {
		// 1,4,7,0,3,6,9,2,5,8,1.....

		display(3);

		display(4);

	}

	static void display(int row) {

		int start = 1;
		int r = 0;
		while (r != row) {
			for (int i = 0; i <= r; i++) {
				System.out.print(start % 10 + " ");
				start += 3;
			}
			System.out.println();
			r++;
		}

	}

}
