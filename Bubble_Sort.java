package DSA_Assignment3;

public class Bubble_Sort {
	static void bubble_sort(char a[]) {
		
		int i, j;
		char temp;
		for (i = 0; i < a.length - 1; i++) {
			for (j = 0; j < a.length - 1; j++) {
				if (a[j] > a[j + 1]) {
					temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}
	}
	static void print_array(char a[]) 
	{
		System.out.println("\n Array has:");
		for (int index = 0; index < a.length; index++) {
			System.out.print(a[index] + " , ");
		}
	}

	public static void main(String[] args) {
		
		char a[] = { 'P', 'A', 'N', 'K', 'A' , 'J','A'};
		print_array(a);
		bubble_sort(a);
		print_array(a);
	}
}
