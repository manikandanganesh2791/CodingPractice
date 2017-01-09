import java.util.ArrayList;
public class MinimumDelta {
	static int mindel(int [] arr1, int [] arr2){
		int result = 0;
		boolean flag1 = true;
		boolean flag2 = true;
		int arr1_minimumval = arr1[0];
		int arr2_minimumval = arr2[0];
		int min_array_length = 0;
		ArrayList<Integer> arr_mindelval = new ArrayList<Integer>();
		while(flag1 == true){
			flag1 = false;
			for(int i=1; i<arr1.length; i++){
				if(arr1[i] < arr1_minimumval){
					arr1_minimumval = arr1[i];
					arr1[i] = arr1[i-1];
					arr1[i-1] = arr1_minimumval;
					flag1 = true;
				}
			}
		}
		while(flag2 == true){
			flag2 = false;
			for(int j=1; j<arr2.length; j++){
				if(arr2[j] < arr2_minimumval){
					arr2_minimumval = arr2[j];
					arr2[j] = arr2[j-1];
					arr2[j-1] = arr2_minimumval;
					flag2 = true;
				}
			}
		}
		
		if(arr1.length > arr2.length){
			min_array_length = arr2.length;
		}
		else{
			min_array_length = arr1.length;
		}
		
		
		
		for(int k=0; k<min_array_length; k++){
			arr_mindelval.add(arr1[k] - arr2[k]);
		}
		
		for(int _arr_mindelta_index = 0; _arr_mindelta_index < arr_mindelval.size() - 1; _arr_mindelta_index++){
			if(arr_mindelval.get(_arr_mindelta_index) < arr_mindelval.get(_arr_mindelta_index + 1)){
				int min_delta_val = arr_mindelval.get(_arr_mindelta_index);
				arr_mindelval.add(_arr_mindelta_index, arr_mindelval.get(_arr_mindelta_index + 1));
				arr_mindelval.add(_arr_mindelta_index+1, min_delta_val);
			}
		}
				
		
		return result;
	}
	public static void main(String[] args){
		int a[] = {1, -30, 50, -20}; //-30, -20, 1, 50
		int b[] = {-20, 35, -200, -35}; //-200, -35, -20, 35
		int minimumval = mindel(a, b);
		System.out.println(minimumval);
	}
}
