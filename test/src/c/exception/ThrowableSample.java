package c.exception;

public class ThrowableSample {
	public static void main(String[] args) {
		ThrowableSample sample = new ThrowableSample();
//		sample.throwable();
		sample.throwException(13);
		try {
			sample.throwsException(13);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void throwable() {
		int[] intArray = new int[5];
		
		try {
			intArray = null;
			System.out.println(intArray[5]);
		} catch(Throwable t) {
			System.out.println(t.getMessage());
			System.out.println(t.toString());
			t.printStackTrace();
		}
	}
	
	public void throwException(int number) {
		try {
			if(number > 12) {				
				throw new Exception("Number is over than 12");
			}
			System.out.println("Number is "+number);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void throwsException(int number) throws Exception{
		if(number > 12) {				
			throw new Exception("Number is over than 12");
		}
		System.out.println("Number is "+number);
	}
}
