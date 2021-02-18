import java.util.*;
import java.io.*;

public class prefixsums{
	public static void main(String[] args){
		int arr[] = {1, 2, 3, 4, 5};
		int n = arr.length;
		int[] prefix = new int[n];
		prefixArray(arr, n, prefix);
		for(int i = 0; i < n; i++) System.out.print(prefix[i] + " ");
	
	
	}
	private static void prefixArray(int[] arr, int n, int[] prefix) {
		prefix[0] = arr[0];
		for(int i = 1; i < n; i++) prefix[i] = prefix[i - 1] + arr[i];
	
	}


}
