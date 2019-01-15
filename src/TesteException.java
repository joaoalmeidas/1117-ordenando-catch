
public class TesteException {

	public static void main(String[] args) {
		
		
		try {
			
			metodoExceptionB();
			
		}catch(ExceptionA e) {
			
			e.printStackTrace();
			
			
		}catch(ExceptionB e) {
			
			e.printStackTrace();
			
		}

	}
	
	public static void metodoExceptionB() throws ExceptionB {
		
			
		throw new ExceptionB("ExceptionB");

		
	}
	
	public static void metodoExceptionC() throws ExceptionC {
		

		throw new ExceptionC("ExceptionC");

		
	}

}
