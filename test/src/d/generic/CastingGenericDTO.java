package d.generic;

import java.io.Serializable;

public class CastingGenericDTO<T> implements Serializable {
	private T object;
	public void setObjcet(T obj) {
		this.object = obj;
	}
	
	public T getObject() {
		return object;
	}
}
