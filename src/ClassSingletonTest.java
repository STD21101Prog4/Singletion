import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ClassSingletonTest {
    public static void main(String[] args) {
        ClassSingleton instance1 = ClassSingleton.getInstance();
        instance1.setDescription("Première instance");

        ClassSingleton instance2 = ClassSingleton.getInstance();
        instance2.setDescription("Deuxième instance");

        System.out.println(instance1.getDescription());  // Affiche "Deuxième instance"
        System.out.println(instance2.getDescription());  // Affiche "Deuxième instance"
    }
}
