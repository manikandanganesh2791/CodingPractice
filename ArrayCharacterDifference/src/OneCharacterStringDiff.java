import java.util.Scanner;
public class OneCharacterStringDiff {
	public static boolean compareString(String input_string, String[] input_array){
		int array_length = input_array.length;
		String input_word = "";
		int input_word_length = 0;
		int mismatch_number = 0;
		for(int i=0; i<array_length;i++){
			mismatch_number = 0;
			input_word = input_array[i];
			input_word_length = input_word.length();
			if((input_word_length == input_string.length()) || (input_word_length == input_string.length() + 1)){
				for(int j=0; j<input_string.length();j++){
					if(input_string.charAt(j) != input_word.charAt(j)){
						mismatch_number++;
					}
				}
				if(input_word_length == input_string.length()){
					if(mismatch_number == 0){
						break;
					}
				}
				if((input_word_length == input_string.length() + 1) && mismatch_number == 0){
					mismatch_number++;
					break;	
				}
			}
		}
		if(mismatch_number <= 1)
			return true;
		else
			return false;
	}
	public static void main(String [] args){
		Scanner user_input = new Scanner(System.in);
		System.out.println("Enter a string to be tested with array");
		String input_string = user_input.next();
		String[] input_array = new String[]{"babbasf", "agasgag", "banavb", "bababa", "banasfa"};
		boolean output_value = compareString(input_string, input_array);
		System.out.println("Matched values are there? " + output_value);
	}
}
