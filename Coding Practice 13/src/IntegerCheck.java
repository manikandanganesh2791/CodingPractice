import java.util.Scanner;

public class IntegerCheck {
	static int atoi(String str){
		int _str_length = str.length();
		char _str_char = 0;
		int ascii = 0;
		String result_string = "";
		int result = 0;
		for(int j=0; j<_str_length; j++){
			_str_char = str.charAt(j);
			ascii = (int) _str_char;
			if((ascii >= 48 && ascii <= 57) || (ascii == 45)){
				result_string += _str_char;
			}
			else{
				result_string = "-1";
				break;
			}
		}
		result = Integer.parseInt(result_string);
		return result;
	}
	public static void main(String[] args){
		IntegerCheck ic = new IntegerCheck();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of test cases");
		String _number_test_cases = sc.nextLine();
		Integer _test_cases = Integer.parseInt(_number_test_cases);
		String _input_string = "";
		if(_test_cases > 0){
			for(int i=0; i<_test_cases; i++){
				System.out.println("Enter new string");
				_input_string = sc.next();
				int _output_number = atoi(_input_string);
				if(_output_number != -1){
					System.out.println(_output_number);
				}
				else{
					System.out.println("-1");
				}
			}
		}
	}
}
