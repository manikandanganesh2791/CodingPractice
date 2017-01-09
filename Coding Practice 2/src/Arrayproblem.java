
public class Arrayproblem {
	
	public int[] listVal(int[][] arr){
		int[]result = new int[arr[0].length * arr.length];
		int _result_index = 0;
		boolean flag = true;
		for(int i=0; i<arr.length;i++){
			if(flag){
				for(int j=0; j<arr[i].length;j++){
					result[_result_index] = arr[i][j];
					_result_index+=1;
					flag = false;
				}
			}
			else{
				for(int j=arr[i].length - 1; j >=0; j--){
					result[_result_index] = arr[i][j];
					_result_index+=1;
					flag = true;
				}
			}
		}
		for(int k=0; k<result.length;k++){
			System.out.println(result[k]);
		}
		return result;
	}
	public static void main(String [] args){
		int[][] arr = new int[3][3];
		
		arr[0][0] = 1;
		arr[0][1] = 2;
		arr[0][2] = 3;
		arr[1][0] = 4;
		arr[1][1] = 5;
		arr[1][2] = 6;
		arr[2][0] = 7;
		arr[2][1] = 8;
		arr[2][2] = 9;
		
		Arrayproblem ap = new Arrayproblem();
		ap.listVal(arr);
	}
}
