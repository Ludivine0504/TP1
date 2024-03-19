package CallExceptionMethods;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        try {
        	throw new Exception("My Exption");
        }catch(Exception e) {
        	System.err.println("Caught Exception");
        	//show error information with e.getMessage()
        	System.err.println("getLocalizedMessage():"+e.getLocalizedMessage());
        	//show stack trace of the error with e.printStackTrace();
        	e.printStackTrace();
        }
	}

}
