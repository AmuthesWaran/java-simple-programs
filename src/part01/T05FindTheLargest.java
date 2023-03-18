package part01;

public class T05FindTheLargest {

	public static void main(String[] args) {
		
		int arr[] = {471, 25, 488, 98};
		
		int max = arr[0];
		
		
		for (int i = 0; i< arr.length; i++) {
			
			if (max < arr[i]) {
				max = arr[i];
			}
			
		}
		
		System.out.println("The Maximum number in the array is: " + max);
		
	}

}
