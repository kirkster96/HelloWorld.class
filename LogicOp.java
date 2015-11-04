public class LogicOp {
	public static void main (String args[]){
		int boy, girl;
		boy = 18;
		girl = 68;
		// && means all must be true and || needs only one to be true
		if(boy > 10 || girl < 60){
			System.out.println("You can enter ");
		}else{
			System.out.println("You cannot enter ");
		}
		
	}
}
