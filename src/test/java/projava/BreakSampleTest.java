package projava;

import org.junit.jupiter.api.Test;

import java.io.*;

import static org.junit.jupiter.api.Assertions.*;

final class BreakSampleTest {

    @Test
    void main_printsExpectedOutput() {
        // Arrange
        var originalOut = System.out;
        var outContent = new ByteArrayOutputStream();

        try (var ps = new PrintStream(outContent)) {
            System.setOut(ps);

            // Act
            BreakSample.main(new String[0]);
        } finally {
            System.setOut(originalOut);
        }

        // Assert (テキストブロックで期待出力を明示)
        var expected = """
                0
                1
                finish
                """;

        assertEquals(expected, outContent.toString());
    }
}