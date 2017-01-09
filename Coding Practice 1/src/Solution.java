
public class Solution {

	public int loopFind(int[] arr){
		int result = 0;
		int val = 0;
		int _loop_count = 0;
		for(int i = 0; i<arr.length;i++){
			_loop_count+=1;
			if(_loop_count == arr.length){
				result = 0;
				break;
			}
			val = arr[i];
			if((val+i) >= arr.length){
				result+=1;
				break;
			}
			else{
				i+=val-1;
			}
		}
		return result;
	}
	public static void main(String [] args){
	int[] arr = {2, -1, 1, 2, 2};
	Solution s = new Solution();
	s.loopFind(arr);
	if(s.loopFind(arr) == 1){
		System.out.println("Yes there is a loop");
		}
		else{
			System.out.println("Fail");
		}
	}
}
