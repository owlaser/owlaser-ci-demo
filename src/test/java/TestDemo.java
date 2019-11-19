import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestDemo {
    private String message = "HelloWorld";
    private Demo demo = new Demo(this.message);
    @Test
    public void testPrintMessage() {
        assertEquals(message, demo.printMessage());
    }
}
