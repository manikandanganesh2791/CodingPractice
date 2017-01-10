import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
public class StringPattern {
	public static boolean patternCheck(String[] pat_arr, String check_str){
		boolean result = false;
		Map<String, List<Integer>> pattern_groups = new HashMap<String, List<Integer>>();
		ArrayList<Integer> arr_list = new ArrayList<Integer>();
		for(int i=0; i<pat_arr.length - 1; i++){
			for(int j=i+1; j<pat_arr.length; j++){
				if(pat_arr[i].equals(pat_arr[j])){
					pattern_groups.putIfAbsent(pat_arr[i], new ArrayList<Integer>(Arrays.asList(i)));
					if(!pattern_groups.get(pat_arr[i]).contains(j))
						pattern_groups.get(pat_arr[i]).add(j);
				}
			}
		}
		String[] check_data = check_str.split(" ");
		for(Entry<String, List<Integer>> map_entry : pattern_groups.entrySet()){
			arr_list.clear();
			arr_list.addAll(map_entry.getValue());
			for(int i=1; i<arr_list.size(); i++){
				if(check_data[arr_list.get(0)].equals(check_data[arr_list.get(i)])){
					result = true;
				}
				else{
					result = false;
					break;
				}
			}
		}
		return result;
	}
	public static void main(String [] args){
		String[] pattern_array = new String[]{"a", "b", "b", "b", "a"};
		String check_string = "dog cat cat cat dog";
		boolean output_result = patternCheck(pattern_array, check_string);
		System.out.println("Is the pattern matching with the given array? :" + output_result);
	}
}
