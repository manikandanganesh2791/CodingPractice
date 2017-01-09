import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
public class Basketball {
	public static void main(String [] args){
		int[] A = {6,4,1,7,8,10}; //1 4 6 7 8 10
		boolean flag = true;
		int temp = 0;
		HashMap<Integer, ArrayList<Integer>> _interval_map = new HashMap<Integer, ArrayList<Integer>>();
		HashMap<Integer, ArrayList<Integer>> _join_map = new HashMap<Integer, ArrayList<Integer>> ();
		ArrayList<Integer> _temp_list = new ArrayList<Integer>();
		int _key_count = 0;
		int _join_key_count = 0;
		int _list_size = 0;
		while(flag == true){
			flag = false;
			for(int i=0; i<A.length - 1;i++){
				if(A[i+1] < A[i]){
					temp = A[i];
					A[i] = A[i+1];
					A[i+1] = temp;
					flag = true;
				}
			}
			for(int j=1; j<A.length-2;j++){
				if((A[j+1] - A[j]) <=2 && ((A[j] - A[j-1]) <=2)){
					_interval_map.put(_key_count, new ArrayList<Integer>());
					_interval_map.get(_key_count).add(A[j-1]);
					_interval_map.get(_key_count).add(A[j]);
					_interval_map.get(_key_count).add(A[j+1]);
					_key_count++;
					j++;
				}
			}
			for(int k=1; k<_interval_map.size();k++){
				_list_size = _interval_map.get(k-1).size();
				if(_interval_map.get(k).get(0) == _interval_map.get(k-1).get(_list_size - 1)){
					_join_map.put(_join_key_count, _interval_map.get(k-1));
					_join_map.get(_join_key_count).addAll(_interval_map.get(k));
					_join_key_count++;
				}
			}
			
		}
	}
}
