import java.util.ArrayList;
import java.util.List;

public class Week1Day2OutOfMemoryError {
    public static void main(String[] args) {
        List<byte[]> list = new ArrayList<>();
        int counter = 0;
        try {
            while (true) {
                // Allocate a large byte array (e.g., 1 MB) in each iteration
                list.add(new byte[1024 * 1024]);
                counter++;
                System.out.println("Allocated " + counter + " MB");
            }
        } catch (OutOfMemoryError e) {
            System.err.println("Caught OutOfMemoryError: " + e.getMessage());
            System.err.println("Successfully allocated approximately " + counter + " MB before error.");
        }
    }
}
