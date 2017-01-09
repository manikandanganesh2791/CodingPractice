import java.util.ArrayList;
import java.util.HashMap;
public class Maximumpairsum {
	public static void main(String [] args){
		int [] arr = {5, 15, 10, 30};
		int _check_val = 12;
		int result = 0;
		HashMap<Integer, ArrayList<Integer>> _pair_map = new HashMap<Integer, ArrayList<Integer>>();
		for(int i=0; i<arr.length - 1; i++){
			for(int j=i+1; j<arr.length;j++){
				if(Math.abs(arr[j] - arr[i]) < _check_val){
					_pair_map.put(arr[i], new ArrayList<Integer>());
					_pair_map.get(arr[i]).add(arr[j]);
				}
			}
		}
		
		System.out.println(result);
	}
}
