
public class Sumofgroups {
	public boolean groupSum(int start, int[] nums, int target) {
		if(start >= nums.length)
			return (target == 0);
		if(groupSum(start+1, nums, target - nums[start]))
			return true;
		if(groupSum(start+1, nums, target))
			return true;
		return false;
	}
	public static void main(String [] args){
		int[] arr = {2,6,8,10};
		int start = 0;
		int target = 20;
		Sumofgroups sog = new Sumofgroups();
		sog.groupSum(start, arr, target);
		if(sog.groupSum(start, arr, target)){
			System.out.println("Yes it is possible");
		}
	}
}

