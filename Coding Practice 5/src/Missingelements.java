
public class Missingelements {
	public static void main(String [] args){
		int[] arr = {0,1,3,5,9,48,82,99};
		StringBuilder sb = new StringBuilder();
		String result = "";
		if(arr.length > 0){
			if(arr[0] != 0){
				sb.append("0-" + Integer.toString(arr[0]-1));
				if(arr.length >= 2){
					for(int i=1; i<arr.length; i++){
						if((arr[i] - arr[i-1]) != 1){
							sb.append(","+Integer.toString(arr[i-1]+1)+"-"+Integer.toString(arr[i]-1));
						}
					}
				}
			}
			else{
				for(int i=1; i<arr.length; i++){
					if((arr[i] - arr[i-1]) != 1){
						if(arr[i] - arr[i-1] == 2){
							if(i != arr.length -1){
								sb.append(Integer.toString(arr[i-1]+1)+",");
							}
							else{
								sb.append(Integer.toString(arr[i-1]+1));
							}
						}
						else{
							if(i != arr.length -1){
								sb.append(Integer.toString(arr[i-1]+1)+"-"+Integer.toString(arr[i]-1)+",");
							}
							else{
								sb.append(Integer.toString(arr[i-1]+1)+"-"+Integer.toString(arr[i]-1));
							}
						}
					}
				}
			}
		}
		else{
			System.out.println("null");
		}
		System.out.println(sb);
	}
}
