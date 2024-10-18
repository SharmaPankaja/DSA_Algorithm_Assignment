package DSA_Assignment3;

public class Binary_Search {
	
	static int binary_search(int a[], int start, int end, int key) {

		if (start <= end) {
			int mid = (start + end) / 2;
			if (key == a[mid])
				return 1;
			if ( key<a[mid])
				return binary_search(a, mid + 1,end, key);
			else
				return binary_search(a, start,mid-1, key);
		}
		return -1;
	}
	static void print_array(int a[]) {
		System.out.println("\n Array has : ");
		for (int index = 0; index < a.length; index++) {
			System.out.print(a[index] + " , ");
		}

	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {77,11,22,33,99,44,88,55,66};
		print_array(a);
		int key=33;
		int r =binary_search(a,0, a.length, key);
		if(r==-1)
			System.out.println("Element not found..");
		else
			System.out.println("Element found..");
	}
}
