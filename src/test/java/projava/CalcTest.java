package projava;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalcTest {

    @Test
    void 正の数同士の加算() {
        assertSame(4, new Calc().add(2, 2));
    }
}