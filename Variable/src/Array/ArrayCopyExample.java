package Array;

import java.util.Arrays;

public class ArrayCopyExample {
	public static void main(String[] args) {
		char[] arr1 = {'J','A','V','A'};
		
		char[] arr2 = Arrays.copyOf(arr1, arr1.length);
		System.out.println("Arry2는"+Arrays.toString(arr2));
		
		char[] arr3 = Arrays.copyOf(arr2,arr2.length);
		System.out.println("Arry3은"+Arrays.toString(arr3));
	
		char[] arr4 = Arrays.copyOfRange(arr1, 1, 3);
		System.out.println("Arry4는"+Arrays.toString(arr4));
		
		char[] arr5 = Arrays.copyOfRange(arr4, 1, 8);
		System.out.println("Arry5는"+Arrays.toString(arr5));
		
		int[][] original = {{1,2},{3,4}};
		
		System.out.println("[얕은복사 후 비교]");
		int[][] cloned1 = Arrays.copyOf(original, original.length);
		System.out.println("배열 번지 비교: " + original.equals(cloned1));
		System.out.println("1차 배열 항목값 비교"+Arrays.equals(original, cloned1));
		System.out.println("중첩 배열 항목값 비교"+Arrays.deepEquals(original, cloned1));
		
		System.out.println("\n[깊은 복제 후 비교]");;
		int[][] cloned2 = Arrays.copyOf(original, original.length);
		cloned2[0] = Arrays.copyOf(original[0], original[0].length);
		cloned2[1] = Arrays.copyOf(original[1], original[1].length);
		System.out.println("배열번지 비교: "+original.equals(cloned2));
		System.out.println("1차 배열 항목값 비교"+Arrays.equals(original, cloned2));
		System.out.println("2차 배열 항목값 비교"+Arrays.deepEquals(original, cloned2));
		

	}

}
