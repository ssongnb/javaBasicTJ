package revss;

public class revss4 {

public int revs(int value) {
		
		int ret = 0;
		if(value%3==0) {
			ret=3;
		}else if(value%4==0) {
			ret=4;}
			return ret;
		}
		
		public static void main(String[]args) {
			revss4 exam = new revss4();
	        System.out.println(exam. revs(6));
	        System.out.println(exam. revs(8));
	    
	}
}
	
