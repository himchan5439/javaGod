package c.string;

public class StringSample {
	public static void main(String[] args) {
		StringSample sample = new StringSample();
		sample.convertUTF16();
	}

	public void convert() {
		try {
			String korean = "�ѱ�";

			byte[] array1 = korean.getBytes();

			for (byte data : array1) {
				System.out.print(data + " ");
			}
			System.out.println();
			String korean2 = new String(array1);
			System.out.println(korean2);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void convertUTF16() {
		try {
			String korean = "�ѱ�";
			byte[] array1 = korean.getBytes("UTF-16");
			printByteArray(array1);
			String korean2 = new String(array1, "UTF-16");
			System.out.println(korean2);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private void printByteArray(byte[] array) {
		for (byte data : array) {
			System.out.print(data + " ");
		}
		System.out.println();
	}
}
