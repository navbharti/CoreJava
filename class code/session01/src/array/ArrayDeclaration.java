package array;

public class ArrayDeclaration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//declaring Single Dimension array
		int[] a;
		int []b;
		int c[];
		
		//can not give dimension at declaration
		//int [5] arr;
		
		//declaring two dimension array
		int[][] arr1;
		int arr2[][];
		int [][]arr3;
		int[] []arr4;
		int[] arr5[];
		int []arr6[];
		
		//array construction
		int []arr8 = new int[5];
		int []arr7 = new int[0];
		//int []arr10 = new int[];
		//int[] arr11=new int[-5];
		//int[] a1=new int[2147483647];
		//int[] a2=new int[2147483648];
		System.out.println(arr8);
		System.out.println(arr8[0]);

	}

}
