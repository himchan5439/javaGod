package c.annotation;

import java.lang.reflect.Method;

public class UserAnnotationCheck {
	public static void main(String[] args) {
		UserAnnotationCheck sample = new UserAnnotationCheck();
		sample.checkAnnotations(UserAnnotationSample.class);
	}

	public void checkAnnotations(Class useClass) {
		Method[] methods = useClass.getDeclaredMethods();
		for (Method tempmethod : methods) {
			UserAnnotation annotation = tempmethod.getAnnotation(UserAnnotation.class);
			if (annotation != null) {
				int number = annotation.number();
				String text = annotation.text();
				System.out.println(tempmethod.getName() + "() : number = " + number + " text = " + text);
			} else {
				System.out.println(tempmethod.getName()+"() : annotation is null.");
			}
		}
	}
}
