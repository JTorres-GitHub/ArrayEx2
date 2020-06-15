
public class ArrayEx2 {
	public static boolean commonFirstLast(int[] arr1, int[] arr2){
		int arr1First = arr1[0];
		int arr1Last = arr1[arr1.length - 1];
		int arr2First = arr2[0];
		int arr2Last = arr2[arr2.length - 1];
		boolean match = false;
		
		if(arr1First == arr2First || arr1Last == arr2Last)
			match = true;
		
		return match;
	}
	
	public static void main(String[] arg){
		int[] array1 = new int[]{5, 5, 6, 7, 8, 9, 11};
		int[] array2 = new int[]{4, 6, 7, 8, 9, 10, 10};
		
		System.out.println(commonFirstLast(array1, array2));
	}
}
