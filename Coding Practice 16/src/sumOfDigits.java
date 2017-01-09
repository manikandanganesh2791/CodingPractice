
public class sumOfDigits {
	static int digitSum(int n){
		int result = 0;
		if(String.valueOf(n).length() > 0){
			String number_val = String.valueOf(n);
			if(String.valueOf(n).length() > 1){
				result = Integer.parseInt(number_val.substring(0,1));
				return result + digitSum(Integer.parseInt(number_val.substring(1,number_val.length())));
			}
			else{
				return Integer.parseInt(number_val.substring(0,1));
			}
		}
		else
			return result;
	}
	public static void main(String[] args){
		long startTime = System.nanoTime();
		int a = 465;
		int ans = digitSum(a);
		System.out.println(ans);
		long endTime = System.nanoTime();
		System.out.println("Took "+ (endTime - startTime)+ " ns");
	}
}