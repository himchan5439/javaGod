package d.generic;

public class GenericSample {
	public static void main(String[] args) {
		GenericSample sample = new GenericSample();
		sample.checkGenericDTO();
	}

	public void checkGenericDTO() {
		CastingGenericDTO<String> dto1 = new CastingGenericDTO<String>();
		dto1.setObjcet(new String());

		CastingGenericDTO<StringBuffer> dto2 = new CastingGenericDTO<StringBuffer>();
		dto2.setObjcet(new StringBuffer());

		CastingGenericDTO<StringBuilder> dto3 = new CastingGenericDTO<StringBuilder>();
		dto3.setObjcet(new StringBuilder());
	}

//	public void checkCastingDTO() {
//		CastingDTO dto1 = new CastingDTO();
//		dto1.setObject(new String());
//		
//		CastingDTO dto2 = new CastingDTO();
//		dto2.setObject(new StringBuffer());
//		
//		CastingDTO dto3 = new CastingDTO();
//		dto3.setObject(new StringBuilder());
//	}
}
