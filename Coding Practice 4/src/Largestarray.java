import java.util.ArrayList;
public class Largestarray {
	public static void main(String [] args){
		int[] arr = {1,4,5,2,3,4,5,6};
		int[] store = new int[3];
		int temp = 0;
		ArrayList<Integer> result = new ArrayList<Integer>();
		if(arr.length>=3){
			for(int i=0; i<arr.length-2;i++){
				store[0] = arr[i];
				store[1] = arr[i+1];
				store[2] = arr[i+2];
				temp = store[0];
				for(int j=1; j<store.length;j++){
					if(store[j] > temp){
						temp = store[j];
					}
				}
				result.add(temp);
			}	
		}
		for(int k=0; k<result.size();k++){
			System.out.println(result.get(k));
		}
	}
}
