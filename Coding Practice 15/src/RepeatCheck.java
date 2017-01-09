import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;
public class RepeatCheck {
	/**
	 * 
	 * @param args
	 * 	public static void main(String[] args){
		String[] array = {"a", "cc", "a", "dd"};
		List<String> list = new ArrayList<String>(Arrays.asList(array));
		list.removeAll(Arrays.asList("a"));
		array = list.toArray(new String[0]);	
		for(int i=0; i<array.length;i++){
			System.out.println(array[i]);
		}
}
	 */
	public static void main (String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of test cases");
		int _number_test_cases = sc.nextInt();
		int _n_value = 0;
		String _array_values = "";
		int[] output_array = new int[2];
		for(int i=0; i<_number_test_cases; i++){
			System.out.println("Enter the N value");
			_n_value = sc.nextInt();
			System.out.println("Building the array by adding 2 x "+_n_value+" + 2 array values...");
			_array_values = sc.nextLine();
			String[] _temp_array = _array_values.split(" ");
			int[] _input_array = new int[_temp_array.length];
			for(int _array_index = 0; i<_input_array.length;i++){
				_input_array[_array_index] = Integer.parseInt(_temp_array[_array_index]);
			}
			output_array = grouparray(_temp_array);
		}
	}
	
	static int[] grouparray(String[] _input_array){
		int[] result = new int[2];
		List<String> _input_list = new ArrayList<String>(Arrays.asList(_input_array));
		return result;
	}
}