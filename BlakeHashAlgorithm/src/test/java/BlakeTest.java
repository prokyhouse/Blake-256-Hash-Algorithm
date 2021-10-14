import org.junit.Assert;
import org.junit.Test;

import java.nio.charset.StandardCharsets;

public class BlakeTest {

    @Test
    public void test() {
        Blake b  = new Blake();
        String input = "The quick brown fox jumps over the lazy dog";
        String expected = "7576698E E9CAD301 73080678 E5965916 ADBB11CB 5245D386 BF1FFDA1 CB26C9D7";
        byte[] data = input.getBytes(StandardCharsets.UTF_8);
        String answer = b.start(data);
        Assert.assertEquals(answer, expected);

        System.out.println("\n\n\nINPUT: " + input);
        System.out.println("RESULT: " + answer + "\n\n\n");
    }

}