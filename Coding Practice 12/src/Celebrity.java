
public class Celebrity {
	public static void main(String [] args){
		int M[][] = new int [24][24];
		for(int i=0; i<M.length;i++){
			for(int j=0; j<M[i].length;j++){
				if(j==23 && i!=23){
					M[i][j] =1;
				}
				else{
					M[i][j]=0;
				}
			}
		}
		//for(int i=0; i<M.length;i++){
			//for(int j=0; j<M[i].length;j++){
				//System.out.println(M[i][j]);
			//}
		//}
		// Your code here
        boolean flag = false;
        int _celeb_id = 0;
        int result = 0;
        for(int i=0; i<M.length; i++){
            if(flag == false){
                for(int j=0; j<M[i].length; j++){
                    if(M[i][j] == 0){
                        flag = true;
                    }
                    else{
                        flag = false;
                        break;
                    }
                }
            }
            else{
                _celeb_id = i-1;
                break;
            }
        }
        if(_celeb_id > 0){
        	System.out.println(_celeb_id);
            for(int k=0; k<M.length; k++){
            	if(k==_celeb_id && k+1 < M.length){
            		k++;
            	}
            	else if(k==_celeb_id && k+1 == M.length && result == 1){
            		result = 1;
            		break;
            	}
                if(M[k][_celeb_id] == 1){
                    result = 1;
                }
                else{
                    result = -1;
                    break;
                }
            }
        }
        if(result == 1){
            System.out.println(_celeb_id);
        }
        else{
        	System.out.println("-1");
        }
	}
}