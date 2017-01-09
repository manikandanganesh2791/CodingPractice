import java.util.LinkedList;
public class PalindromeLink {
	static LinkedList<Integer> linkedlistvalues = new LinkedList<Integer>();
	
	static boolean isPalindrome(LinkedList<Integer> palindromechecklist){
		boolean result = false;
		int s = palindromechecklist.size();
		for(int i=0; i<s/2; i++){
			if(palindromechecklist.get(i) != palindromechecklist.get((s-1)-i)){
				result = false;
				break;
			}
			result = true;
		}
		return result;
	}
	public static void main(String[] args){
		linkedlistvalues.add(1);
		linkedlistvalues.add(2);
		linkedlistvalues.add(3);
		linkedlistvalues.add(3);
		linkedlistvalues.add(3);
		linkedlistvalues.add(1);
		boolean output_result = isPalindrome(linkedlistvalues);
		System.out.println(output_result);
	}
}
