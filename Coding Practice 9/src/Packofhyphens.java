
public class Packofhyphens {
	public static void main(String [] args){
		String A = "2-4a0r7-4k-asfasf-112";
		int K = 3;
		String _without_hypens = "";
		StringBuilder sb = new StringBuilder();
		StringBuilder _hyphen_appended = new StringBuilder();
		int count = 0;
		String _with_hyphens_rev = "";
		String _with_hyphens = "";
		//loop to get all the characters without hyphens
		for(int i=0; i<A.length();i++){
			if(!(A.substring(i, i+1).equals("-"))){
				sb.append(A.substring(i,i+1));
			}
		}
		_without_hypens = sb.toString();
		//loop from the last character to get assign hyphens after crossing K characters
		for(int j=_without_hypens.length() -1; j>=0; j--){
			_hyphen_appended.append(_without_hypens.substring(j, j+1));
			count+=1;
			if(count == K && j != 0){
				_hyphen_appended.append("-");
				count = 0;
			}
		}
		_with_hyphens_rev = _hyphen_appended.toString();
		
		//loop to reverse the string
		for(int k = _with_hyphens_rev.length() -1; k>=0; k--){
			_with_hyphens+=_with_hyphens_rev.substring(k, k+1);
		}
		System.out.println(_with_hyphens);
	}
}
