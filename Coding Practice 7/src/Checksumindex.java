
public class Checksumindex {
	static int _sum_left = 0;
	static int _sum_right = 0;
	static int[] arr = {1,2,3,4,0,6};
	public static void main(String[] args){
		for(int i=0; i<arr.length;i++){
			_sum_left = 0;
			_sum_right = 0;
			for(int j=0; j<=i; j++){
				_sum_left += arr[j];
			}
			for(int k=i; k<arr.length;k++){
				_sum_right+=arr[k];
			}
			if((_sum_left == _sum_right) && (_sum_left > 0) && (_sum_right > 0)){
				System.out.println(i);
				break;
			}
		}
	}
}
