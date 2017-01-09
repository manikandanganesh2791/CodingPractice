import java.util.Scanner;
import java.util.ArrayList;
public class Remainder {
	static int remainderwith7(String num){
		int num_length = num.length();
		ArrayList<String> num_group = new ArrayList<String>();
		String _num_group = "";
		int _group_count = 0;
		int num_group_size = 0;
		int _sum_even = 0;
		int _sum_odd = 0;
		int _group_diff = 0;
		int result = 0;
		for(int i=num_length-1; i>=0;i--){
			_group_count+=1;
			_num_group+=num.substring(i,i+1);
			if((_group_count == 3) || (i == 0)){
				num_group.add(new StringBuilder(_num_group).reverse().toString());
				_num_group = "";
				_group_count = 0;
			}
		}
		num_group_size = num_group.size();
		for(int j=0;j<num_group_size;j++){
			_sum_even+=Integer.parseInt(num_group.get(j));
			j++;
		}
		for(int k=1;k<num_group_size;k++){
			_sum_odd+=Integer.parseInt(num_group.get(k));
			k++;
		}
		_group_diff = _sum_even - _sum_odd;
		result = _group_diff % 7;
		return result;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of test cases");
		String _number_test_cases = sc.nextLine();
		int _test_cases = Integer.parseInt(_number_test_cases);
		String _input_string = "";
		for(int i=0; i<_test_cases;i++){
			System.out.println("Enter the string");
			_input_string = sc.nextLine();
			int _string_remainder = remainderwith7(_input_string);
			System.out.println("Remainder: " + _string_remainder);
		}
	}
}
