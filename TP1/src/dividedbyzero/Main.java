package dividedbyzero;
public class Main {
 
 /**
 * @param args the command line arguments
 */
     
public static void main(String[] args) {
	        try{
	           System.out.println(3/0);
	        }catch (NullPointerException e){
	        	//Print the error message like this:
	        	System.err.println("NullPointerException:"+e.getMessage());
	        	//Or handle the error another way here
	        }catch (ArithmeticException e) {
	        	System.err.println("ArithmeticException:"+e.getMessage());
	        }
	    }
	}

