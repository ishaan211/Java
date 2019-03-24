
public class BinaryScr {
	public static void binarySearch(int arr[], int first, int last, int key){
		int mid = (first+last)/2;
		while(first<=last){
			if(arr[mid] < key){
				first = mid + 1;
			}
			else if(arr[mid] == key){
				System.out.println("Element found at index " + mid);
				break;
			}else{
				last = mid - 1;
			}
			mid = (first + last)/2;
		} 
		if(first > last){
			System.out.println("Element not found");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {10, 40, 50, 60, 70, 100, 120, 160, 220, 230};
		int key = 40;
		int last = arr.length - 1;
		binarySearch(arr,0,last,key);

	}

}
