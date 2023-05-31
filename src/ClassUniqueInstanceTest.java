import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class ClassUniqueInstanceTest {
    public static void main(String[] args) {
        ClassUniqueInstance instance1 = ClassUniqueInstance.INSTANCE;
        instance1.setClick(5);

        ClassUniqueInstance instance2 = ClassUniqueInstance.INSTANCE;
        instance2.setClick(10);

        System.out.println(instance1.getClick());  // Affiche 10
        System.out.println(instance2.getClick());  // Affiche 10
    }
}
