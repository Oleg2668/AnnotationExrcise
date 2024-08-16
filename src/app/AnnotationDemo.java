package app;
import java.lang.reflect.Method;

public class AnnotationDemo {
    public static void main(String[] args) {
        Method[] methods = ArrayUtils.class.getDeclaredMethods();

        for (Method method : methods) {
            if (method.isAnnotationPresent(MethodInfo.class)) {
                MethodInfo methodInfo = method.getAnnotation(MethodInfo.class);
                Author author = method.getAnnotation(Author.class);

                System.out.println("Method: " + methodInfo.name());
                System.out.println("Return Type: " + methodInfo.returnType());
                System.out.println("Description: " + methodInfo.description());

                if (author != null) {
                    System.out.println("Author: " + author.firstName() + " " + author.lastName());
                }

                System.out.println();
            }
        }
    }
}