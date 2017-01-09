import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Findingfanny {
	public void findarr(int[] mainarr){
		HashMap<Integer, Integer> _index_dis = new HashMap<Integer, Integer>();
		int temp = 0;
		int mindis = 0;
		int _index_pos = 0;
		boolean flag = false;
		int[] subarr = {5,7};
		for(int i=0; i<mainarr.length;i++){
			if(mainarr[i] == subarr[0]){
				for(int j=i+1; j<mainarr.length;j++){
					if(mainarr[j] == subarr[1]){
						_index_dis.put(i,j);
						temp = j - i;
						break;
					}
				}
				if(mindis > 0 && temp < mindis){
					_index_pos = i;
					mindis = temp;
				}
				else if(mindis == 0){
					_index_pos = i;
					mindis = temp;
				}
			}
		}
		System.out.println(mindis + " " + _index_pos);
	}
	public static void main(String [] args){
		int[] mainarr = {1,2,3,5,8,7,6,9,5,7,3,0,5};
		Findingfanny ff = new Findingfanny();
		ff.findarr(mainarr);
	}
}
