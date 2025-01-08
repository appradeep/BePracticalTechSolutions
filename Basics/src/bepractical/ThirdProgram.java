package bepractical;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

class Student {
	
	int studentId=101;
	String studentName="Pradeep";
	
	public void info() {
		System.out.println("Student Information");
	}
}
public class ThirdProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student();
		Class name = s.getClass();
		System.out.println(name);
		
		Field[] declaredFields = name.getDeclaredFields();
		for(Field fieldName : declaredFields) {
			System.out.println(fieldName.getName());
		}
		
		Method[] declaredMethods = name.getDeclaredMethods();
		for(Method methodName : declaredMethods) {
			System.out.println(methodName.getName());
		}
	}

}
