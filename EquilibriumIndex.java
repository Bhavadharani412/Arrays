public class Solution {
	public static int arrayEquilibriumIndex(int[] arr){  
		int n = arr.length;
		int[] left = new int[n];
		int[] right = new int[n];
		left[0] = arr[0];
		for(int i = 1; i < n; i++){
			left[i]= left[i-1] + arr[i];
		}
		right[n-1] = arr[n-1];
		for(int i = n-2;i>=0;i--){
			right[i] = right[i+1] + arr[i];
		}
		for(int i =0;i<n;i++){
			if(left[i] == right[i])
			{
				return i;
			}
		}
		return -1;
	}
}
